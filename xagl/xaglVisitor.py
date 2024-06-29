# Generated from xagl.g4 by ANTLR 4.13.1
from antlr4 import *
if "." in __name__:
    from .xaglParser import xaglParser
else:
    from xaglParser import xaglParser

# This class defines a complete generic visitor for a parse tree produced by xaglParser.

class xaglVisitor(ParseTreeVisitor):

    # Visit a parse tree produced by xaglParser#program.
    def visitProgram(self, ctx:xaglParser.ProgramContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by xaglParser#point.
    def visitPoint(self, ctx:xaglParser.PointContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by xaglParser#statement.
    def visitStatement(self, ctx:xaglParser.StatementContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by xaglParser#refreshCommand.
    def visitRefreshCommand(self, ctx:xaglParser.RefreshCommandContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by xaglParser#moveCommand.
    def visitMoveCommand(self, ctx:xaglParser.MoveCommandContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by xaglParser#loopStatement.
    def visitLoopStatement(self, ctx:xaglParser.LoopStatementContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by xaglParser#expression.
    def visitExpression(self, ctx:xaglParser.ExpressionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by xaglParser#timeUnit.
    def visitTimeUnit(self, ctx:xaglParser.TimeUnitContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by xaglParser#vector.
    def visitVector(self, ctx:xaglParser.VectorContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by xaglParser#stateChange.
    def visitStateChange(self, ctx:xaglParser.StateChangeContext):
        return self.visitChildren(ctx)



del xaglParser