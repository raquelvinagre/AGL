import java.util.HashMap;
import java.util.Map;
import java.util.Random;

import org.stringtemplate.v4.*;

@SuppressWarnings("CheckReturnValue")
public class AGLToPythonCompiler extends aglBaseVisitor<String> {

    private STGroup templates = new STGroupFile("templates/template.stg");
    private StringBuilder code = new StringBuilder();
    private Map<String, String> variables = new HashMap<>();

    @Override
    public String visitProgram(aglParser.ProgramContext ctx) {
        for (aglParser.StatementContext stmt : ctx.statement()) {
            code.append(visit(stmt)).append("\n");
        }
        ST programTemplate = templates.getInstanceOf("program");
        programTemplate.add("statements", code.toString());
        return programTemplate.render();
    }

    @Override
    public String visitStatement(aglParser.StatementContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public String visitViewDeclaration(aglParser.ViewDeclarationContext ctx) {
        String viewName = ctx.ID().getText();
        String title = "";
        StringBuilder properties = new StringBuilder();
        // Default view center coordinates
        String ox = "0";
        String oy = "0";
        for (aglParser.PropertyAssignmentContext propCtx : ctx.multiplePropertyAssignment().propertyList()
                .propertyAssignment()) {
            String key = propCtx.PropertyID().getText();
            String value = propCtx.propertyValue().getText();
            if (key.equals("Ox")) {
                ox = value;
            }
            if (key.equals("Oy")) {
                oy = value;
            }
            if (key.equals("title")) {
                title = value;
            } else {
                if (key.equals("background")) {
                    key = "bg"; // Change 'background' to 'bg' for tkinter compatibility
                }
                properties.append(key).append("=").append(value).append(", ");
            }
        }
        // Remove the trailing comma and space

        if (properties.length() > 0) {
            properties.setLength(properties.length() - 2);
        }

        // add view to variables
        addVariable("view", viewName);

        ST viewTemplate = templates.getInstanceOf("viewDeclaration");
        viewTemplate.add("viewName", viewName);
        viewTemplate.add("properties", properties.toString());
        viewTemplate.add("title", title);
        return viewTemplate.render();
    }

    @Override
    public String visitVariableDeclaration(aglParser.VariableDeclarationContext ctx) {
        String varName = ctx.ID().getText();
        String value = "";

        // Check if the variable declaration includes a type and expression or wait
        // command
        if (ctx.type() != null) {
            if (ctx.expression() != null) {
                if (ctx.expression().vector() != null) {
                    value = visit(ctx.expression().vector()).replace("(", "").replace(")", "");
                    String x = value.split(",")[0].trim();
                    String y = value.split(",")[1].trim();
                    value = "[" + x + ", " + y + "]";
                } else {
                    value = visit(ctx.expression());
                }
            } else if (ctx.waitCommand() != null) {
                ST waitTemplate = templates.getInstanceOf("waitCommandInstantiation");
                waitTemplate.add("point", varName);
                waitTemplate.add("viewName", getVariable("view"));
                return waitTemplate.render();
            }
            // Handle point declaration
        }
        // Handle object instantiation
        else if (ctx.objectInstantiation() != null) {
            value = visit(ctx.objectInstantiation());
        }

        // Add the variable to the variables map
        addVariable(varName, value);

        ST varTemplate = templates.getInstanceOf("variableDeclaration");
        varTemplate.add("varName", varName);
        varTemplate.add("value", value);
        return varTemplate.render();
    }

    @Override
    public String visitVariableUpdate(aglParser.VariableUpdateContext ctx) {
        String varName = ctx.ID().getText();
        String value = "";

        if (ctx.expression() != null) {
            ST varTemplate = templates.getInstanceOf("variableUpdate");
            value = visit(ctx.expression());

            varTemplate.add("value", value);
            varTemplate.add("varName", varName);
            varTemplate.add("viewName", getVariable("view"));

            updateVariable(varName, value);

            return varTemplate.render();

        } else if (ctx.waitCommand() != null) {
            ST waitTemplate = templates.getInstanceOf("waitCommand");
            waitTemplate.add("point", varName);
            waitTemplate.add("viewName", getVariable("view"));
            return waitTemplate.render();
        }

        return null;
    }

    public Map<String, String> getVariables() {
        return variables;
    }

    public void addVariable(String varName, String value) {
        if (variables.containsKey(varName)) {
            variables.replace(varName, value);
        } else {
            variables.put(varName, value);
        }
    }

    public void updateVariable(String varName, String value) {
        if (variables.containsKey(varName)) {
            variables.replace(varName, value);
        }
    }

    public String getVariable(String varName) {
        if (!variables.containsKey(varName)) {
            return null;
        }
        return variables.get(varName);
    }

    @Override
    public String visitObjectInstantiation(aglParser.ObjectInstantiationContext ctx) {
        String objectType = ctx.ObjectID().getText().toLowerCase();

        if (objectType.equals("ellipse")) {
            objectType = "oval";
        } else if (objectType.equals("arcchord") || objectType.equals("pieslice")) {
            objectType = "arc";
        } else if (objectType.equals("dot")) {
            objectType = "rectangle";
        }

        String coords = visit(ctx.point());

        if (coords.length() < 2) {
            // Check if coords is a variable name
            if (getVariables().containsKey(coords)) {
                coords = getVariables().get(coords);
                coords = coords.replace("[", "(").replace("]", ")");
            }
        }

        String properties = visit(ctx.multiplePropertyAssignment());
        // Extract x1, y1 from coordinates
        String[] coordsArray = coords.replace("(", "").replace(")", "").split(",");
        String x1 = coordsArray[0].trim();
        String y1 = coordsArray[1].trim();
        String x_point = x1;
        String y_point = y1;
        String x2 = x1;
        String y2 = y1;

        // Check for length property
        boolean hasLength = false;
        StringBuilder filteredProperties = new StringBuilder();
        String[] propertiesArray = properties.split(", ");
        for (String property : propertiesArray) {
            if (property.trim().startsWith("length=")) {
                hasLength = true;
                String[] lengthValues = property.split("=")[1].replace("(", "").replace(")", "").split(",");
                if (lengthValues.length >= 2) {
                    int length_x = Integer.parseInt(lengthValues[0].trim());
                    int length_y = Integer.parseInt(lengthValues[1].trim());
                    String length_x_String = Integer.toString(length_x / 2);
                    String length_y_String = Integer.toString(length_y / 2);
                    String negative_length_x_String = Integer.toString(-length_x / 2);
                    String negative_length_y_String = Integer.toString(-length_y / 2);

                    x1 = coordsArray[0].trim() + " + " + negative_length_x_String;
                    y1 = coordsArray[1].trim() + " + " + negative_length_y_String;
                    // String x2 = coordsArray[0].trim() + " + " + length_x_String;
                    // String y2 = coordsArray[1].trim() + " + " + length_y_String;
                    x2 = x_point + " + " + length_x_String;
                    y2 = y_point + " + " + length_y_String;
                }
            } else {
                filteredProperties.append(property.trim()).append(", ");
            }
        }

        // Remove trailing comma and space
        if (filteredProperties.length() > 0) {
            filteredProperties.setLength(filteredProperties.length() - 2);
        }

        ST objectTemplate = templates.getInstanceOf("objectInstantiation");
        if (objectTemplate == null) {
            throw new RuntimeException("Template 'objectInstantiation' not found.");
        }

        objectTemplate.add("objectType", objectType);

        // Add coordinates as a single argument
        if (objectType.equals("text")) {
            objectTemplate.add("coords", x1 + ", " + y1);
        } else {
            if (hasLength) {
                objectTemplate.add("coords", x1 + ", " + y1 + ", " + x2 + ", " + y2);
            } else {
                objectTemplate.add("coords", x1 + ", " + y1 + ", " + x1 + ", " + y1);
            }
        }

        objectTemplate.add("properties", filteredProperties.toString());
        objectTemplate.add("viewName", getVariable("view"));
        return objectTemplate.render();
    }

    @Override
    public String visitObjectUpdate(aglParser.ObjectUpdateContext ctx) {
        String objectType = ctx.ID(0).getText();

        if (ctx.ID().size() != 1) { // If there is a second ID, it means that the object is an attribute of another
                                    // object
            objectType = ctx.ID(1).getText();
        }

        for (String key : getVariables().keySet()) {
            if (key.equals(objectType)) {
                objectType = key;
                break;
            }
        }

        StringBuilder properties = new StringBuilder();

        for (aglParser.PropertyAssignmentContext propCtx : ctx.propertyList().propertyAssignment()) {
            String key = propCtx.PropertyID().getText();
            String value = propCtx.propertyValue().getText();
            properties.append(key).append("=").append(value).append(", ");
        }

        // Remove the railing comma and space
        if (properties.length() > 0) {
            properties.setLength(properties.length() - 2);
        }

        // Update the variable in the variables map
        updateVariable(objectType, properties.toString());

        // Generate the output using the template
        ST objectTemplate = templates.getInstanceOf("objectUpdate");
        if (objectTemplate == null) {
            throw new RuntimeException("Template 'objectUpdate' not found.");
        }
        objectTemplate.add("objectName", objectType);
        objectTemplate.add("properties", properties.toString());
        objectTemplate.add("viewName", getVariable("view"));
        return objectTemplate.render();
    }

    @Override
    public String visitModelDeclaration(aglParser.ModelDeclarationContext ctx) {
        String modelName = ctx.ModelID().getText();
        StringBuilder properties = new StringBuilder();
        StringBuilder components = new StringBuilder();

        for (aglParser.ModelElementContext elementCtx : ctx.modelBody().modelElement()) {
            if (elementCtx.variableDeclaration() != null) {
                properties.append(visit(elementCtx.variableDeclaration())).append("\n");
            } else if (elementCtx.objectInstantiation() != null) {
                components.append(visit(elementCtx.objectInstantiation())).append("\n");
            }
        }

        // Create the full model definition
        StringBuilder modelDefinition = new StringBuilder();
        modelDefinition.append("model ").append(modelName).append(" {\n");
        modelDefinition.append(properties.toString().trim()).append("\n");
        modelDefinition.append(components.toString().trim()).append("\n");
        modelDefinition.append("}");

        // Store the model in the variables map
        addVariable(modelName, modelDefinition.toString());

        return ""; // Return an empty string as we're only storing the model definition
    }

    @Override
    public String visitModelInstantiation(aglParser.ModelInstantiationContext ctx) {
        String modelName = ctx.ModelID().getText();
        String modelDefinition = getVariable(modelName);
        if (modelDefinition == null) {
            throw new RuntimeException("Model '" + modelName + "' not found.");
        }

        StringBuilder modelPropertiesBuilder = new StringBuilder();
        StringBuilder components = new StringBuilder();
        boolean inComponentSection = false;

        // Parse the model definition to extract properties and components
        String[] modelLines = modelDefinition.split("\n");
        for (String line : modelLines) {
            if (line.contains(":: Model")) {
                continue;
            }
            if (line.contains("}")) {
                inComponentSection = false;
            }
            if (inComponentSection) {
                components.append(line).append("\n");
            } else {
                modelPropertiesBuilder.append(line).append("\n");
            }
            if (line.contains("{")) {
                inComponentSection = true;
            }
        }

        // Handle the 'at' point for instantiation
        String point = visit(ctx.point());

        // Generate the output using the template
        ST modelTemplate = templates.getInstanceOf("modelInstantiation");
        if (modelTemplate == null) {
            throw new RuntimeException("Template 'modelInstantiation' not found.");
        }
        modelTemplate.add("modelName", modelName);
        modelTemplate.add("properties", modelPropertiesBuilder.toString().trim());
        modelTemplate.add("components", components.toString().trim());
        modelTemplate.add("position", point);
        return modelTemplate.render();
    }

    @Override
    public String visitPropertyAssignment(aglParser.PropertyAssignmentContext ctx) {
        String varName;
        String propertyName;
        String value;

        propertyName = ctx.PropertyID().getText();
        value = ctx.propertyValue().getText();

        if (ctx.ID() != null) {
            varName = ctx.ID().getText();
            ST propTemplate = templates.getInstanceOf("propertyUpdate");
            propTemplate.add("varName", varName);
            propTemplate.add("propertyName", propertyName);
            propTemplate.add("value", value);
            propTemplate.add("viewName", getVariable("view"));
            return propTemplate.render();
        }

        ST propTemplate = templates.getInstanceOf("propertyAssignment");
        propTemplate.add("propertyName", propertyName);
        propTemplate.add("value", value);
        propTemplate.add("viewName", getVariable("view"));
        return propTemplate.render();
    }

    @Override
    public String visitMultiplePropertyAssignment(aglParser.MultiplePropertyAssignmentContext ctx) {
        StringBuilder properties = new StringBuilder();
        for (aglParser.PropertyAssignmentContext propCtx : ctx.propertyList().propertyAssignment()) {
            properties.append(visit(propCtx)).append(", ");
        }
        if (properties.length() > 0) {
            properties.setLength(properties.length() - 2);
        }
        return properties.toString();
    }

    @Override
    public String visitCommand(aglParser.CommandContext ctx) {
        if (ctx.waitCommand() != null) {
            return visitWaitCommand(ctx.waitCommand());
        } else if (ctx.closeCommand() != null) {
            return visitCloseCommand(ctx.closeCommand());
        } else if (ctx.refreshCommand() != null) {
            return visitRefreshCommand(ctx.refreshCommand());
        } else if (ctx.moveCommand() != null) {
            return visitMoveCommand(ctx.moveCommand());
        }
        return "";
    }

    @Override
    public String visitPrintStatement(aglParser.PrintStatementContext ctx) {
        String value = "";
        if (ctx.STRING() != null) {
            value = ctx.STRING().getText();
        } else if (ctx.ID() != null) {
            // String variableName = ctx.ID().getText();
            // value = getVariable(variableName);
            value = ctx.ID().getText();
        } else if (ctx.listElementAccess() != null) {
            value = visitListElementAccess(ctx.listElementAccess());
        }

        ST printTemplate = templates.getInstanceOf("printStatement");
        printTemplate.add("value", value);
        return printTemplate.render();
    }

    @Override
    public String visitRefreshCommand(aglParser.RefreshCommandContext ctx) {
        int delay = 0;
        if (ctx.INTEGER() != null) {
            delay = Integer.parseInt(ctx.INTEGER().getText());
        }

        String viewName = ctx.ID().getText();

        ST refreshTemplate = templates.getInstanceOf("refreshCommand");
        refreshTemplate.add("viewName", viewName);
        refreshTemplate.add("delay", delay);
        return refreshTemplate.render();
    }

    @Override
    public String visitWaitCommand(aglParser.WaitCommandContext ctx) {
        ST waitTemplate = templates.getInstanceOf("waitCommand");
        waitTemplate.add("viewName", getVariable(("view")));
        return waitTemplate.render();
    }

    @Override
    public String visitMoveCommand(aglParser.MoveCommandContext ctx) {
        String objectName = ctx.ID().getText();
        String coords = visit(ctx.point());

        String[] coordsArray = coords.replace("(", "").replace(")", "").split(",");
        String x1 = coordsArray[0].trim();
        String y1 = coordsArray[1].trim();

        ST moveTemplate = templates.getInstanceOf("moveCommand");
        moveTemplate.add("viewName", getVariable("view"));
        moveTemplate.add("objectName", objectName);
        moveTemplate.add("dx", x1);
        moveTemplate.add("dy", y1);
        return moveTemplate.render();
    }

    @Override
    public String visitCloseCommand(aglParser.CloseCommandContext ctx) {
        String viewName = ctx.ID().getText();

        ST closeTemplate = templates.getInstanceOf("closeCommand");
        closeTemplate.add("viewName", viewName);
        return closeTemplate.render();
    }

    // @Override
    // public String visitPropertyList(aglParser.PropertyListContext ctx) {
    // StringBuilder properties = new StringBuilder();
    // for (aglParser.PropertyContext propCtx : ctx.property()) {
    // String key = propCtx.ID().getText();
    // String value = propCtx.propertyValue().getText();
    // if (key.equals("background")) {
    // key = "bg"; // Change 'background' to 'bg' for tkinter compatibility
    // }
    // properties.append(key).append("=").append(value).append(", ");
    // }
    // // Remove the trailing comma and space
    // if (properties.length() > 0) {
    // properties.setLength(properties.length() - 2);
    // }
    // return properties.toString();
    // }

    @Override
    public String visitExpression(aglParser.ExpressionContext ctx) {
        if (ctx.primaryExpr() != null) {
            return visitPrimaryExpr(ctx.primaryExpr());
        } else if (ctx.arithmeticExpr() != null) {
            return visitArithmeticExpr(ctx.arithmeticExpr());
        } else if (ctx.booleanExpr() != null) {
            return visitBooleanExpr(ctx.booleanExpr());
        } else if (ctx.stringExpr() != null) {
            return visitStringExpr(ctx.stringExpr());
        } else if (ctx.vector() != null) {
            return visitVector(ctx.vector());
        }
        return "";
    }

    @Override
    public String visitPrimaryExpr(aglParser.PrimaryExprContext ctx) {
        if (ctx.ID() != null) {
            return ctx.ID().getText();
        } else if (ctx.INTEGER() != null) {
            return ctx.INTEGER().getText();
        } else if (ctx.NUMBER() != null) {
            return ctx.NUMBER().getText();
        }
        return "";
    }

    @Override
    public String visitArithmeticExpr(aglParser.ArithmeticExprContext ctx) {
        return ctx.getText(); // quick fix, just temporary
    }

    @Override
    public String visitType(aglParser.TypeContext ctx) {
        return ctx.getText();
    }

    @Override
    public String visitPropertyValue(aglParser.PropertyValueContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public String visitPoint(aglParser.PointContext ctx) {
        return ctx.getText(); // another fix
    }

    @Override
    public String visitVector(aglParser.VectorContext ctx) {
        if (ctx.vectorANDpointExpr() != null) {
            // Caso de coordenadas cartesianas
            return visitVectorANDpointExpr(ctx.vectorANDpointExpr());
        } else if (ctx.polarcoordinates() != null) {
            // Caso de coordenadas polares
            return visitPolarcoordinates(ctx.polarcoordinates());
        }
        return "";
    }

    @Override
    public String visitVectorANDpointExpr(aglParser.VectorANDpointExprContext ctx) {
        String left = visitPrimaryExpr(ctx.primaryExpr(0));
        String right = visitPrimaryExpr(ctx.primaryExpr(1));
        return "(" + left + "," + right + ")";
    }

    @Override
    public String visitPolarcoordinates(aglParser.PolarcoordinatesContext ctx) {
        String polarAngle = visitPrimaryExpr(ctx.polarangle().primaryExpr());
        String angleUnit = ctx.polarangle().getText().replaceAll("[^a-zA-Z]", "");
        String polarLength = visitPrimaryExpr(ctx.polarlength().primaryExpr());

        double angle = 0;
        if (angleUnit.equals("deg")) {
            angle = Double.parseDouble(polarAngle);
            angle = Math.toRadians(angle); // Converter para radianos
        } else if (angleUnit.equals("pi")) {
            angle = Double.parseDouble(polarAngle) * Math.PI; // Converter para radianos
        } else {
            angle = Double.parseDouble(polarAngle);
        }

        double distance = Double.parseDouble(polarLength);
        String left = String.valueOf(distance * Math.cos(angle)); // x = r * cos(theta)
        String right = String.valueOf(distance * Math.sin(angle)); // y = r * sin(theta)

        return "(" + left + "," + right + ")";
    }

    @Override
    public String visitBooleanExpr(aglParser.BooleanExprContext ctx) {

        // Case: ID comparisonOperator BOOLEAN
        if (ctx.ID() != null && ctx.BOOLEAN() != null) {
            String id = ctx.ID().getText();
            String operator = ctx.comparisonOperator().getText();
            String bool = ctx.BOOLEAN().getText().substring(0, 1) + ctx.BOOLEAN().getText().substring(1).toLowerCase();
            return id + " " + operator + " " + bool;
        }

        // Case: ID comparisonOperator primaryExpr
        if (ctx.ID() != null && ctx.primaryExpr() != null) {
            String id = ctx.ID().getText();
            String operator = ctx.comparisonOperator().getText();
            String primary = visit(ctx.primaryExpr());
            return id + " " + operator + " " + primary;
        }

        // Case: ID
        if (ctx.ID() != null) {
            return ctx.ID().getText();
        }

        // Case: BOOLEAN
        if (ctx.BOOLEAN() != null) {
            // Convert from TRUE and FALSE to python booleans (True, False)
            return ctx.BOOLEAN().getText().substring(0, 1) + ctx.BOOLEAN().getText().substring(1).toLowerCase();
        }

        // Case: NOT booleanExpr
        if (ctx.booleanExpr(0) != null) {
            return "NOT " + visit(ctx.booleanExpr(0));
        }

        // Case: booleanExpr comparisonOperator primaryExpr
        if (ctx.booleanExpr().size() == 1 && ctx.primaryExpr() != null) {
            String boolExpr = visit(ctx.booleanExpr(0));
            String operator = ctx.comparisonOperator().getText();
            String primary = visit(ctx.primaryExpr());
            return boolExpr + " " + operator + " " + primary;
        }

        // Case: booleanExpr ('AND' | 'OR') booleanExpr
        if (ctx.booleanExpr().size() == 2) {
            String leftExpr = visit(ctx.booleanExpr(0));
            String operator = ctx.getChild(1).getText(); // This should be 'AND' or 'OR'
            String rightExpr = visit(ctx.booleanExpr(1));
            return leftExpr + " " + operator + " " + rightExpr;
        }

        return "";
    }

    @Override
    public String visitStringExpr(aglParser.StringExprContext ctx) {
        return ctx.getText();
    }

    @Override
    public String visitLoopDeclaration(aglParser.LoopDeclarationContext ctx) {
        String loopVar = ctx.ID(0).getText();
        StringBuilder loopRange = new StringBuilder();

        // Handle different loop range formats
        if (ctx.ID().size() == 1) {
            // Case: for i in 0..4
            int end = Integer.parseInt(ctx.INTEGER(1).getText()) + 1; // Increment end to include the end value
            loopRange.append("range(0, ").append(end).append(")");
        } else {
            // Case: for i in start..end or for i in start..end..step
            String start = ctx.ID(1).getText();
            int end = Integer.parseInt(ctx.INTEGER(1).getText()) + 1; // Increment end to include the end value
            loopRange.append("range(").append(start).append(", ").append(end);

            if (ctx.INTEGER().size() > 1) {
                String step = ctx.INTEGER(1).getText();
                loopRange.append(", ").append(step);
            }

            loopRange.append(")");
        }

        // Construct the loop body
        StringBuilder loopContent = new StringBuilder();
        for (aglParser.StatementContext stmt : ctx.statement()) {
            String stmtContent = visit(stmt); // Call the visit method for each statement
            loopContent.append(stmtContent).append("\n");
        }

        // Remove the trailing newline character if present
        if (loopContent.length() > 0) {
            loopContent.setLength(loopContent.length() - 1);
        }

        // Return the formatted loop in Python syntax
        return String.format("for %s in %s:\n\t%s", loopVar, loopRange.toString(),
                loopContent.toString().replace("\n", "\n\t"));
    }

    @Override
    public String visitWhileLoop(aglParser.WhileLoopContext ctx) {
        String condition = "";
        if (ctx.booleanExpr() != null) {
            condition = visit(ctx.booleanExpr());
        }

        StringBuilder body = new StringBuilder();
        for (aglParser.StatementContext stmt : ctx.statement()) {
            body.append(visit(stmt)).append("\n");
        }

        ST whileTemplate = templates.getInstanceOf("whileLoop");
        whileTemplate.add("condition", condition);
        whileTemplate.add("body", body.toString());
        return whileTemplate.render();

    }

    @Override
    public String visitConditionalStatement(aglParser.ConditionalStatementContext ctx) {
        String condition = visit(ctx.booleanExpr());

        StringBuilder ifBody = new StringBuilder();
        for (aglParser.StatementContext stmt : ctx.statement()) {
            ifBody.append(visit(stmt)).append("\n");
        }

        StringBuilder elseIfClauses = new StringBuilder();
        for (aglParser.ElseIfClauseContext elseIfCtx : ctx.elseIfClause()) {
            String elseIfCondition = visit(elseIfCtx.booleanExpr());
            StringBuilder elseIfBody = new StringBuilder();
            for (aglParser.StatementContext stmt : elseIfCtx.statement()) {
                elseIfBody.append(visit(stmt)).append("\n");
            }
            ST elseIfTemplate = templates.getInstanceOf("elseIfClause");
            elseIfTemplate.add("condition", elseIfCondition);
            elseIfTemplate.add("body", elseIfBody.toString());
            elseIfClauses.append(elseIfTemplate.render()).append("\n");
        }

        StringBuilder elseBody = new StringBuilder();
        if (ctx.elseClause() != null) {
            for (aglParser.StatementContext stmt : ctx.elseClause().statement()) {
                elseBody.append(visit(stmt)).append("\n");
            }
        }

        ST ifTemplate = templates.getInstanceOf("conditionalStatement");
        ifTemplate.add("condition", condition);
        ifTemplate.add("ifBody", ifBody.toString());
        ifTemplate.add("elseIfClauses", elseIfClauses.toString());
        ifTemplate.add("elseBody", elseBody.toString());
        return ifTemplate.render();
    }

    @Override
    public String visitListDeclaration(aglParser.ListDeclarationContext ctx) {
        String listName = ctx.ID().getText();
        StringBuilder elements = new StringBuilder();
        for (aglParser.ExpressionContext exprCtx : ctx.expression()) {
            elements.append(visit(exprCtx)).append(", ");
        }
        if (elements.length() > 0) {
            elements.setLength(elements.length() - 2);
        }

        addVariable(listName, elements.toString());

        ST listTemplate = templates.getInstanceOf("listDeclaration");
        listTemplate.add("listName", listName);
        listTemplate.add("elements", elements.toString());
        return listTemplate.render();
    }

    @Override
    public String visitListElementAssignment(aglParser.ListElementAssignmentContext ctx) {
        String listName = ctx.ID().getText();
        String index = visit(ctx.primaryExpr());
        String value = visit(ctx.expression());

        ST listElementAssignmentTemplate = templates.getInstanceOf("listElementAssignment");
        listElementAssignmentTemplate.add("listName", listName);
        listElementAssignmentTemplate.add("index", index);
        listElementAssignmentTemplate.add("value", value);
        return listElementAssignmentTemplate.render();
    }

    @Override
    public String visitListElementAccess(aglParser.ListElementAccessContext ctx) {
        String listName = ctx.ID().getText();
        String index = visit(ctx.primaryExpr());

        ST listElementAccessTemplate = templates.getInstanceOf("listElementAccess");
        listElementAccessTemplate.add("listName", listName);
        listElementAccessTemplate.add("index", index);
        return listElementAccessTemplate.render();
    }

    // @Override
    // public String visitScriptDeclaration(aglParser.ScriptDeclarationContext ctx) {
    //     String scriptName = ctx.ID().getText();
    //     String scriptSource = ctx.scriptSource().getText();
    //     System.out.println("Source: " + scriptSource);
    //     if (scriptSource.startsWith("load")) {
    //         scriptSource = scriptSource.substring(4);

    //         ST scriptTemplate = templates.getInstanceOf("scriptDeclaration");
    //         scriptTemplate.add("filepath", scriptSource.toString());
    //         return scriptTemplate.render();
    //     } else {
    //         scriptSource = scriptSource.substring(5);
    //         Random rand = new Random();
    //         int randomNum = rand.nextInt(1000);
    //         String filepath = "userInputScript" + randomNum + ".xagl";
    //         ST scriptInputTemplate = templates.getInstanceOf("scriptInput");

    //         scriptInputTemplate.add("scriptName", scriptName);
    //         scriptInputTemplate.add("filepath", filepath);
    //         scriptInputTemplate.add("scriptSource", scriptSource);
    //         return scriptInputTemplate.render();
    //     }
    // }

    // @Override
    // public String visitPlayCommand(aglParser.PlayCommandContext ctx) {
    //     String scriptName = ctx.ID().getText();
    //     String scriptVars = "";

    //     for (aglParser.ScriptAssignmentContext scriptCtx : ctx.scriptAssignment()) {
    //         String scriptVar = visit(scriptCtx);
    //         if (scriptVar != null && getVariable(scriptVar) != null) {
    //             if (scriptVars.equals("")) {
    //                 scriptVars = scriptVar;
    //             } else {
    //                 scriptVars += scriptVar + ", ";
    //             }
    //         }
    //     }
    //     System.out.println("ScriptVars: " + scriptVars);

    //     ST playTemplate = templates.getInstanceOf("playCommand");
    //     playTemplate.add("scriptName", scriptName);
    //     playTemplate.add("scriptVars", scriptVars);
    //     return playTemplate.render();
    // }

    @Override
    public String visitScriptDeclaration(aglParser.ScriptDeclarationContext ctx) {
        String scriptName = ctx.ID().getText();
        String scriptSource = ctx.scriptSource().getText();
        System.out.println("Source: " + scriptSource);
        if (scriptSource.startsWith("load")) {
            scriptSource = scriptSource.substring(4);

            ST scriptTemplate = templates.getInstanceOf("scriptDeclaration");
            scriptTemplate.add("filename", scriptName.toString());

            scriptTemplate.add("filepath", scriptSource.toString());
            return scriptTemplate.render();
        } else {
            scriptSource = scriptSource.substring(5);
            Random rand = new Random();
            int randomNum = rand.nextInt(1000);
            String filepath = "userInputScript" + randomNum + ".xagl";
            ST scriptInputTemplate = templates.getInstanceOf("scriptInput");

            scriptInputTemplate.add("scriptName", scriptName);
            scriptInputTemplate.add("filepath", filepath);
            scriptInputTemplate.add("scriptSource", scriptSource);
            return scriptInputTemplate.render();
        }
    }
    @Override
    public String visitPlayCommand(aglParser.PlayCommandContext ctx) {
        String scriptName = ctx.ID().getText();
        StringBuilder scriptVars = new StringBuilder(); // Inicialize como um StringBuilder para concatenar strings
    
        System.out.println("oiii");
        System.out.println("Visiting play command for script: " + scriptName);
    
        for (aglParser.ScriptAssignmentContext scriptCtx : ctx.scriptAssignment()) {
            String scriptVar = visit(scriptCtx);
            System.out.println("Visited script assignment: " + scriptVar);
    
            if (scriptVar != null) {
                Object variable = getVariable(scriptVar);
                System.out.println("Retrieved variable for " + scriptVar + ": " + variable);
    
                if (variable != null) {
                    if (scriptVars.length() > 0) {
                        scriptVars.append(", "); // Adicione uma vírgula e espaço se não for o primeiro item
                    }
                    scriptVars.append(scriptVar); // Adicione a variável à string
                }
            }
        }
    
        System.out.println("ScriptVars: " + scriptVars);
    
        ST playTemplate = templates.getInstanceOf("playCommand");
        playTemplate.add("scriptName", scriptName);
        playTemplate.add("scriptVars", scriptVars.toString()); // Converta StringBuilder para string
        return playTemplate.render();
    }
    

    @Override
    public String visitScriptAssignment(aglParser.ScriptAssignmentContext ctx) {
        String scriptAssignment = ctx.ID(1).getText(); // Supondo que o primeiro ID é o nome da variável
        return scriptAssignment;
    }


}