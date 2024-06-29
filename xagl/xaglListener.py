# Generated from xagl.g4 by ANTLR 4.13.1
from antlr4 import *
if "." in __name__:
    from .xaglParser import xaglParser
else:
    from xaglParser import xaglParser

# This class defines a complete listener for a parse tree produced by xaglParser.
class xaglListener(ParseTreeListener):

    # Enter a parse tree produced by xaglParser#program.
    def enterProgram(self, ctx:xaglParser.ProgramContext):
        pass

    # Exit a parse tree produced by xaglParser#program.
    def exitProgram(self, ctx:xaglParser.ProgramContext):
        pass


    # Enter a parse tree produced by xaglParser#point.
    def enterPoint(self, ctx:xaglParser.PointContext):
        pass

    # Exit a parse tree produced by xaglParser#point.
    def exitPoint(self, ctx:xaglParser.PointContext):
        pass


    # Enter a parse tree produced by xaglParser#statement.
    def enterStatement(self, ctx:xaglParser.StatementContext):
        pass

    # Exit a parse tree produced by xaglParser#statement.
    def exitStatement(self, ctx:xaglParser.StatementContext):
        pass


    # Enter a parse tree produced by xaglParser#refreshCommand.
    def enterRefreshCommand(self, ctx:xaglParser.RefreshCommandContext):
        pass

    # Exit a parse tree produced by xaglParser#refreshCommand.
    def exitRefreshCommand(self, ctx:xaglParser.RefreshCommandContext):
        pass


    # Enter a parse tree produced by xaglParser#moveCommand.
    def enterMoveCommand(self, ctx:xaglParser.MoveCommandContext):
        pass

    # Exit a parse tree produced by xaglParser#moveCommand.
    def exitMoveCommand(self, ctx:xaglParser.MoveCommandContext):
        pass


    # Enter a parse tree produced by xaglParser#loopStatement.
    def enterLoopStatement(self, ctx:xaglParser.LoopStatementContext):
        pass

    # Exit a parse tree produced by xaglParser#loopStatement.
    def exitLoopStatement(self, ctx:xaglParser.LoopStatementContext):
        pass


    # Enter a parse tree produced by xaglParser#expression.
    def enterExpression(self, ctx:xaglParser.ExpressionContext):
        pass

    # Exit a parse tree produced by xaglParser#expression.
    def exitExpression(self, ctx:xaglParser.ExpressionContext):
        pass


    # Enter a parse tree produced by xaglParser#timeUnit.
    def enterTimeUnit(self, ctx:xaglParser.TimeUnitContext):
        pass

    # Exit a parse tree produced by xaglParser#timeUnit.
    def exitTimeUnit(self, ctx:xaglParser.TimeUnitContext):
        pass


    # Enter a parse tree produced by xaglParser#vector.
    def enterVector(self, ctx:xaglParser.VectorContext):
        pass

    # Exit a parse tree produced by xaglParser#vector.
    def exitVector(self, ctx:xaglParser.VectorContext):
        pass


    # Enter a parse tree produced by xaglParser#stateChange.
    def enterStateChange(self, ctx:xaglParser.StateChangeContext):
        pass

    # Exit a parse tree produced by xaglParser#stateChange.
    def exitStateChange(self, ctx:xaglParser.StateChangeContext):
        pass



del xaglParser