// Generated from agl.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link aglParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface aglVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link aglParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(aglParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link aglParser#point}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPoint(aglParser.PointContext ctx);
	/**
	 * Visit a parse tree produced by {@link aglParser#vector}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVector(aglParser.VectorContext ctx);
	/**
	 * Visit a parse tree produced by {@link aglParser#vectorANDpointExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVectorANDpointExpr(aglParser.VectorANDpointExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link aglParser#polarcoordinates}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPolarcoordinates(aglParser.PolarcoordinatesContext ctx);
	/**
	 * Visit a parse tree produced by {@link aglParser#polarangle}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPolarangle(aglParser.PolarangleContext ctx);
	/**
	 * Visit a parse tree produced by {@link aglParser#polarlength}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPolarlength(aglParser.PolarlengthContext ctx);
	/**
	 * Visit a parse tree produced by {@link aglParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(aglParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link aglParser#viewDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitViewDeclaration(aglParser.ViewDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link aglParser#variableDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclaration(aglParser.VariableDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link aglParser#loopDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoopDeclaration(aglParser.LoopDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link aglParser#whileLoop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileLoop(aglParser.WhileLoopContext ctx);
	/**
	 * Visit a parse tree produced by {@link aglParser#objectInstantiation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjectInstantiation(aglParser.ObjectInstantiationContext ctx);
	/**
	 * Visit a parse tree produced by {@link aglParser#objectUpdate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjectUpdate(aglParser.ObjectUpdateContext ctx);
	/**
	 * Visit a parse tree produced by {@link aglParser#modelInstantiation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModelInstantiation(aglParser.ModelInstantiationContext ctx);
	/**
	 * Visit a parse tree produced by {@link aglParser#propertyAssignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPropertyAssignment(aglParser.PropertyAssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link aglParser#variableUpdate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableUpdate(aglParser.VariableUpdateContext ctx);
	/**
	 * Visit a parse tree produced by {@link aglParser#multiplePropertyAssignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplePropertyAssignment(aglParser.MultiplePropertyAssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link aglParser#printStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintStatement(aglParser.PrintStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link aglParser#conditionalStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionalStatement(aglParser.ConditionalStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link aglParser#elseIfClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElseIfClause(aglParser.ElseIfClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link aglParser#elseClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElseClause(aglParser.ElseClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link aglParser#listDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListDeclaration(aglParser.ListDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link aglParser#listElementAssignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListElementAssignment(aglParser.ListElementAssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link aglParser#listElementAccess}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListElementAccess(aglParser.ListElementAccessContext ctx);
	/**
	 * Visit a parse tree produced by {@link aglParser#command}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommand(aglParser.CommandContext ctx);
	/**
	 * Visit a parse tree produced by {@link aglParser#waitCommand}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWaitCommand(aglParser.WaitCommandContext ctx);
	/**
	 * Visit a parse tree produced by {@link aglParser#closeCommand}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCloseCommand(aglParser.CloseCommandContext ctx);
	/**
	 * Visit a parse tree produced by {@link aglParser#refreshCommand}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRefreshCommand(aglParser.RefreshCommandContext ctx);
	/**
	 * Visit a parse tree produced by {@link aglParser#moveCommand}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMoveCommand(aglParser.MoveCommandContext ctx);
	/**
	 * Visit a parse tree produced by {@link aglParser#propertyValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPropertyValue(aglParser.PropertyValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link aglParser#propertyList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPropertyList(aglParser.PropertyListContext ctx);
	/**
	 * Visit a parse tree produced by {@link aglParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(aglParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link aglParser#primaryExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryExpr(aglParser.PrimaryExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link aglParser#arithmeticExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArithmeticExpr(aglParser.ArithmeticExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link aglParser#booleanExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanExpr(aglParser.BooleanExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link aglParser#stringExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringExpr(aglParser.StringExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link aglParser#comparisonOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparisonOperator(aglParser.ComparisonOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link aglParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(aglParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link aglParser#scriptDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScriptDeclaration(aglParser.ScriptDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link aglParser#scriptSource}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScriptSource(aglParser.ScriptSourceContext ctx);
	/**
	 * Visit a parse tree produced by {@link aglParser#playCommand}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPlayCommand(aglParser.PlayCommandContext ctx);
	/**
	 * Visit a parse tree produced by {@link aglParser#scriptAssignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScriptAssignment(aglParser.ScriptAssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link aglParser#modelDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModelDeclaration(aglParser.ModelDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link aglParser#modelBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModelBody(aglParser.ModelBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link aglParser#modelElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModelElement(aglParser.ModelElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link aglParser#enumDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumDeclaration(aglParser.EnumDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link aglParser#enumValues}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumValues(aglParser.EnumValuesContext ctx);
	/**
	 * Visit a parse tree produced by {@link aglParser#actionOnEnum}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitActionOnEnum(aglParser.ActionOnEnumContext ctx);
	/**
	 * Visit a parse tree produced by {@link aglParser#enumActionBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumActionBody(aglParser.EnumActionBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link aglParser#enumCase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumCase(aglParser.EnumCaseContext ctx);
	/**
	 * Visit a parse tree produced by {@link aglParser#conditionalEnumStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionalEnumStatement(aglParser.ConditionalEnumStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link aglParser#elseIfEnumClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElseIfEnumClause(aglParser.ElseIfEnumClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link aglParser#elseEnumClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElseEnumClause(aglParser.ElseEnumClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link aglParser#propertyEnumAssignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPropertyEnumAssignment(aglParser.PropertyEnumAssignmentContext ctx);
}