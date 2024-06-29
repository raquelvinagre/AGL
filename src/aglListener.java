// Generated from agl.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link aglParser}.
 */
public interface aglListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link aglParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(aglParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link aglParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(aglParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link aglParser#point}.
	 * @param ctx the parse tree
	 */
	void enterPoint(aglParser.PointContext ctx);
	/**
	 * Exit a parse tree produced by {@link aglParser#point}.
	 * @param ctx the parse tree
	 */
	void exitPoint(aglParser.PointContext ctx);
	/**
	 * Enter a parse tree produced by {@link aglParser#vector}.
	 * @param ctx the parse tree
	 */
	void enterVector(aglParser.VectorContext ctx);
	/**
	 * Exit a parse tree produced by {@link aglParser#vector}.
	 * @param ctx the parse tree
	 */
	void exitVector(aglParser.VectorContext ctx);
	/**
	 * Enter a parse tree produced by {@link aglParser#vectorANDpointExpr}.
	 * @param ctx the parse tree
	 */
	void enterVectorANDpointExpr(aglParser.VectorANDpointExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link aglParser#vectorANDpointExpr}.
	 * @param ctx the parse tree
	 */
	void exitVectorANDpointExpr(aglParser.VectorANDpointExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link aglParser#polarcoordinates}.
	 * @param ctx the parse tree
	 */
	void enterPolarcoordinates(aglParser.PolarcoordinatesContext ctx);
	/**
	 * Exit a parse tree produced by {@link aglParser#polarcoordinates}.
	 * @param ctx the parse tree
	 */
	void exitPolarcoordinates(aglParser.PolarcoordinatesContext ctx);
	/**
	 * Enter a parse tree produced by {@link aglParser#polarangle}.
	 * @param ctx the parse tree
	 */
	void enterPolarangle(aglParser.PolarangleContext ctx);
	/**
	 * Exit a parse tree produced by {@link aglParser#polarangle}.
	 * @param ctx the parse tree
	 */
	void exitPolarangle(aglParser.PolarangleContext ctx);
	/**
	 * Enter a parse tree produced by {@link aglParser#polarlength}.
	 * @param ctx the parse tree
	 */
	void enterPolarlength(aglParser.PolarlengthContext ctx);
	/**
	 * Exit a parse tree produced by {@link aglParser#polarlength}.
	 * @param ctx the parse tree
	 */
	void exitPolarlength(aglParser.PolarlengthContext ctx);
	/**
	 * Enter a parse tree produced by {@link aglParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(aglParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link aglParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(aglParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link aglParser#viewDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterViewDeclaration(aglParser.ViewDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link aglParser#viewDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitViewDeclaration(aglParser.ViewDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link aglParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaration(aglParser.VariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link aglParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaration(aglParser.VariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link aglParser#loopDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterLoopDeclaration(aglParser.LoopDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link aglParser#loopDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitLoopDeclaration(aglParser.LoopDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link aglParser#whileLoop}.
	 * @param ctx the parse tree
	 */
	void enterWhileLoop(aglParser.WhileLoopContext ctx);
	/**
	 * Exit a parse tree produced by {@link aglParser#whileLoop}.
	 * @param ctx the parse tree
	 */
	void exitWhileLoop(aglParser.WhileLoopContext ctx);
	/**
	 * Enter a parse tree produced by {@link aglParser#objectInstantiation}.
	 * @param ctx the parse tree
	 */
	void enterObjectInstantiation(aglParser.ObjectInstantiationContext ctx);
	/**
	 * Exit a parse tree produced by {@link aglParser#objectInstantiation}.
	 * @param ctx the parse tree
	 */
	void exitObjectInstantiation(aglParser.ObjectInstantiationContext ctx);
	/**
	 * Enter a parse tree produced by {@link aglParser#objectUpdate}.
	 * @param ctx the parse tree
	 */
	void enterObjectUpdate(aglParser.ObjectUpdateContext ctx);
	/**
	 * Exit a parse tree produced by {@link aglParser#objectUpdate}.
	 * @param ctx the parse tree
	 */
	void exitObjectUpdate(aglParser.ObjectUpdateContext ctx);
	/**
	 * Enter a parse tree produced by {@link aglParser#modelInstantiation}.
	 * @param ctx the parse tree
	 */
	void enterModelInstantiation(aglParser.ModelInstantiationContext ctx);
	/**
	 * Exit a parse tree produced by {@link aglParser#modelInstantiation}.
	 * @param ctx the parse tree
	 */
	void exitModelInstantiation(aglParser.ModelInstantiationContext ctx);
	/**
	 * Enter a parse tree produced by {@link aglParser#propertyAssignment}.
	 * @param ctx the parse tree
	 */
	void enterPropertyAssignment(aglParser.PropertyAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link aglParser#propertyAssignment}.
	 * @param ctx the parse tree
	 */
	void exitPropertyAssignment(aglParser.PropertyAssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link aglParser#variableUpdate}.
	 * @param ctx the parse tree
	 */
	void enterVariableUpdate(aglParser.VariableUpdateContext ctx);
	/**
	 * Exit a parse tree produced by {@link aglParser#variableUpdate}.
	 * @param ctx the parse tree
	 */
	void exitVariableUpdate(aglParser.VariableUpdateContext ctx);
	/**
	 * Enter a parse tree produced by {@link aglParser#multiplePropertyAssignment}.
	 * @param ctx the parse tree
	 */
	void enterMultiplePropertyAssignment(aglParser.MultiplePropertyAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link aglParser#multiplePropertyAssignment}.
	 * @param ctx the parse tree
	 */
	void exitMultiplePropertyAssignment(aglParser.MultiplePropertyAssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link aglParser#printStatement}.
	 * @param ctx the parse tree
	 */
	void enterPrintStatement(aglParser.PrintStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link aglParser#printStatement}.
	 * @param ctx the parse tree
	 */
	void exitPrintStatement(aglParser.PrintStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link aglParser#conditionalStatement}.
	 * @param ctx the parse tree
	 */
	void enterConditionalStatement(aglParser.ConditionalStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link aglParser#conditionalStatement}.
	 * @param ctx the parse tree
	 */
	void exitConditionalStatement(aglParser.ConditionalStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link aglParser#elseIfClause}.
	 * @param ctx the parse tree
	 */
	void enterElseIfClause(aglParser.ElseIfClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link aglParser#elseIfClause}.
	 * @param ctx the parse tree
	 */
	void exitElseIfClause(aglParser.ElseIfClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link aglParser#elseClause}.
	 * @param ctx the parse tree
	 */
	void enterElseClause(aglParser.ElseClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link aglParser#elseClause}.
	 * @param ctx the parse tree
	 */
	void exitElseClause(aglParser.ElseClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link aglParser#listDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterListDeclaration(aglParser.ListDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link aglParser#listDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitListDeclaration(aglParser.ListDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link aglParser#listElementAssignment}.
	 * @param ctx the parse tree
	 */
	void enterListElementAssignment(aglParser.ListElementAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link aglParser#listElementAssignment}.
	 * @param ctx the parse tree
	 */
	void exitListElementAssignment(aglParser.ListElementAssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link aglParser#listElementAccess}.
	 * @param ctx the parse tree
	 */
	void enterListElementAccess(aglParser.ListElementAccessContext ctx);
	/**
	 * Exit a parse tree produced by {@link aglParser#listElementAccess}.
	 * @param ctx the parse tree
	 */
	void exitListElementAccess(aglParser.ListElementAccessContext ctx);
	/**
	 * Enter a parse tree produced by {@link aglParser#command}.
	 * @param ctx the parse tree
	 */
	void enterCommand(aglParser.CommandContext ctx);
	/**
	 * Exit a parse tree produced by {@link aglParser#command}.
	 * @param ctx the parse tree
	 */
	void exitCommand(aglParser.CommandContext ctx);
	/**
	 * Enter a parse tree produced by {@link aglParser#waitCommand}.
	 * @param ctx the parse tree
	 */
	void enterWaitCommand(aglParser.WaitCommandContext ctx);
	/**
	 * Exit a parse tree produced by {@link aglParser#waitCommand}.
	 * @param ctx the parse tree
	 */
	void exitWaitCommand(aglParser.WaitCommandContext ctx);
	/**
	 * Enter a parse tree produced by {@link aglParser#closeCommand}.
	 * @param ctx the parse tree
	 */
	void enterCloseCommand(aglParser.CloseCommandContext ctx);
	/**
	 * Exit a parse tree produced by {@link aglParser#closeCommand}.
	 * @param ctx the parse tree
	 */
	void exitCloseCommand(aglParser.CloseCommandContext ctx);
	/**
	 * Enter a parse tree produced by {@link aglParser#refreshCommand}.
	 * @param ctx the parse tree
	 */
	void enterRefreshCommand(aglParser.RefreshCommandContext ctx);
	/**
	 * Exit a parse tree produced by {@link aglParser#refreshCommand}.
	 * @param ctx the parse tree
	 */
	void exitRefreshCommand(aglParser.RefreshCommandContext ctx);
	/**
	 * Enter a parse tree produced by {@link aglParser#moveCommand}.
	 * @param ctx the parse tree
	 */
	void enterMoveCommand(aglParser.MoveCommandContext ctx);
	/**
	 * Exit a parse tree produced by {@link aglParser#moveCommand}.
	 * @param ctx the parse tree
	 */
	void exitMoveCommand(aglParser.MoveCommandContext ctx);
	/**
	 * Enter a parse tree produced by {@link aglParser#propertyValue}.
	 * @param ctx the parse tree
	 */
	void enterPropertyValue(aglParser.PropertyValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link aglParser#propertyValue}.
	 * @param ctx the parse tree
	 */
	void exitPropertyValue(aglParser.PropertyValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link aglParser#propertyList}.
	 * @param ctx the parse tree
	 */
	void enterPropertyList(aglParser.PropertyListContext ctx);
	/**
	 * Exit a parse tree produced by {@link aglParser#propertyList}.
	 * @param ctx the parse tree
	 */
	void exitPropertyList(aglParser.PropertyListContext ctx);
	/**
	 * Enter a parse tree produced by {@link aglParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(aglParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link aglParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(aglParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link aglParser#primaryExpr}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryExpr(aglParser.PrimaryExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link aglParser#primaryExpr}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryExpr(aglParser.PrimaryExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link aglParser#arithmeticExpr}.
	 * @param ctx the parse tree
	 */
	void enterArithmeticExpr(aglParser.ArithmeticExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link aglParser#arithmeticExpr}.
	 * @param ctx the parse tree
	 */
	void exitArithmeticExpr(aglParser.ArithmeticExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link aglParser#booleanExpr}.
	 * @param ctx the parse tree
	 */
	void enterBooleanExpr(aglParser.BooleanExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link aglParser#booleanExpr}.
	 * @param ctx the parse tree
	 */
	void exitBooleanExpr(aglParser.BooleanExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link aglParser#stringExpr}.
	 * @param ctx the parse tree
	 */
	void enterStringExpr(aglParser.StringExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link aglParser#stringExpr}.
	 * @param ctx the parse tree
	 */
	void exitStringExpr(aglParser.StringExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link aglParser#comparisonOperator}.
	 * @param ctx the parse tree
	 */
	void enterComparisonOperator(aglParser.ComparisonOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link aglParser#comparisonOperator}.
	 * @param ctx the parse tree
	 */
	void exitComparisonOperator(aglParser.ComparisonOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link aglParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(aglParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link aglParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(aglParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link aglParser#scriptDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterScriptDeclaration(aglParser.ScriptDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link aglParser#scriptDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitScriptDeclaration(aglParser.ScriptDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link aglParser#scriptSource}.
	 * @param ctx the parse tree
	 */
	void enterScriptSource(aglParser.ScriptSourceContext ctx);
	/**
	 * Exit a parse tree produced by {@link aglParser#scriptSource}.
	 * @param ctx the parse tree
	 */
	void exitScriptSource(aglParser.ScriptSourceContext ctx);
	/**
	 * Enter a parse tree produced by {@link aglParser#playCommand}.
	 * @param ctx the parse tree
	 */
	void enterPlayCommand(aglParser.PlayCommandContext ctx);
	/**
	 * Exit a parse tree produced by {@link aglParser#playCommand}.
	 * @param ctx the parse tree
	 */
	void exitPlayCommand(aglParser.PlayCommandContext ctx);
	/**
	 * Enter a parse tree produced by {@link aglParser#scriptAssignment}.
	 * @param ctx the parse tree
	 */
	void enterScriptAssignment(aglParser.ScriptAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link aglParser#scriptAssignment}.
	 * @param ctx the parse tree
	 */
	void exitScriptAssignment(aglParser.ScriptAssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link aglParser#modelDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterModelDeclaration(aglParser.ModelDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link aglParser#modelDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitModelDeclaration(aglParser.ModelDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link aglParser#modelBody}.
	 * @param ctx the parse tree
	 */
	void enterModelBody(aglParser.ModelBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link aglParser#modelBody}.
	 * @param ctx the parse tree
	 */
	void exitModelBody(aglParser.ModelBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link aglParser#modelElement}.
	 * @param ctx the parse tree
	 */
	void enterModelElement(aglParser.ModelElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link aglParser#modelElement}.
	 * @param ctx the parse tree
	 */
	void exitModelElement(aglParser.ModelElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link aglParser#enumDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterEnumDeclaration(aglParser.EnumDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link aglParser#enumDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitEnumDeclaration(aglParser.EnumDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link aglParser#enumValues}.
	 * @param ctx the parse tree
	 */
	void enterEnumValues(aglParser.EnumValuesContext ctx);
	/**
	 * Exit a parse tree produced by {@link aglParser#enumValues}.
	 * @param ctx the parse tree
	 */
	void exitEnumValues(aglParser.EnumValuesContext ctx);
	/**
	 * Enter a parse tree produced by {@link aglParser#actionOnEnum}.
	 * @param ctx the parse tree
	 */
	void enterActionOnEnum(aglParser.ActionOnEnumContext ctx);
	/**
	 * Exit a parse tree produced by {@link aglParser#actionOnEnum}.
	 * @param ctx the parse tree
	 */
	void exitActionOnEnum(aglParser.ActionOnEnumContext ctx);
	/**
	 * Enter a parse tree produced by {@link aglParser#enumActionBody}.
	 * @param ctx the parse tree
	 */
	void enterEnumActionBody(aglParser.EnumActionBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link aglParser#enumActionBody}.
	 * @param ctx the parse tree
	 */
	void exitEnumActionBody(aglParser.EnumActionBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link aglParser#enumCase}.
	 * @param ctx the parse tree
	 */
	void enterEnumCase(aglParser.EnumCaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link aglParser#enumCase}.
	 * @param ctx the parse tree
	 */
	void exitEnumCase(aglParser.EnumCaseContext ctx);
	/**
	 * Enter a parse tree produced by {@link aglParser#conditionalEnumStatement}.
	 * @param ctx the parse tree
	 */
	void enterConditionalEnumStatement(aglParser.ConditionalEnumStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link aglParser#conditionalEnumStatement}.
	 * @param ctx the parse tree
	 */
	void exitConditionalEnumStatement(aglParser.ConditionalEnumStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link aglParser#elseIfEnumClause}.
	 * @param ctx the parse tree
	 */
	void enterElseIfEnumClause(aglParser.ElseIfEnumClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link aglParser#elseIfEnumClause}.
	 * @param ctx the parse tree
	 */
	void exitElseIfEnumClause(aglParser.ElseIfEnumClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link aglParser#elseEnumClause}.
	 * @param ctx the parse tree
	 */
	void enterElseEnumClause(aglParser.ElseEnumClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link aglParser#elseEnumClause}.
	 * @param ctx the parse tree
	 */
	void exitElseEnumClause(aglParser.ElseEnumClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link aglParser#propertyEnumAssignment}.
	 * @param ctx the parse tree
	 */
	void enterPropertyEnumAssignment(aglParser.PropertyEnumAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link aglParser#propertyEnumAssignment}.
	 * @param ctx the parse tree
	 */
	void exitPropertyEnumAssignment(aglParser.PropertyEnumAssignmentContext ctx);
}