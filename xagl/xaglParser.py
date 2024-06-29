# Generated from xagl.g4 by ANTLR 4.13.1
# encoding: utf-8
from antlr4 import *
from io import StringIO
import sys
if sys.version_info[1] > 5:
	from typing import TextIO
else:
	from typing.io import TextIO

def serializedATN():
    return [
        4,1,25,93,2,0,7,0,2,1,7,1,2,2,7,2,2,3,7,3,2,4,7,4,2,5,7,5,2,6,7,
        6,2,7,7,7,2,8,7,8,2,9,7,9,1,0,5,0,22,8,0,10,0,12,0,25,9,0,1,0,1,
        0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,3,1,36,8,1,1,2,1,2,1,2,1,2,3,2,42,
        8,2,1,3,1,3,1,3,1,3,1,3,3,3,49,8,3,1,3,1,3,1,4,1,4,1,4,1,4,1,4,1,
        4,1,5,1,5,1,5,1,5,1,5,1,5,1,5,1,5,1,5,4,5,68,8,5,11,5,12,5,69,1,
        5,1,5,1,6,1,6,1,7,1,7,1,8,1,8,1,8,1,8,1,8,1,8,1,9,1,9,1,9,3,9,87,
        8,9,1,9,1,9,1,9,1,9,1,9,0,0,10,0,2,4,6,8,10,12,14,16,18,0,2,1,0,
        20,24,1,0,14,15,90,0,23,1,0,0,0,2,35,1,0,0,0,4,41,1,0,0,0,6,43,1,
        0,0,0,8,52,1,0,0,0,10,58,1,0,0,0,12,73,1,0,0,0,14,75,1,0,0,0,16,
        77,1,0,0,0,18,83,1,0,0,0,20,22,3,4,2,0,21,20,1,0,0,0,22,25,1,0,0,
        0,23,21,1,0,0,0,23,24,1,0,0,0,24,26,1,0,0,0,25,23,1,0,0,0,26,27,
        5,0,0,1,27,1,1,0,0,0,28,29,5,1,0,0,29,30,3,12,6,0,30,31,5,2,0,0,
        31,32,3,12,6,0,32,33,5,3,0,0,33,36,1,0,0,0,34,36,5,20,0,0,35,28,
        1,0,0,0,35,34,1,0,0,0,36,3,1,0,0,0,37,42,3,6,3,0,38,42,3,8,4,0,39,
        42,3,10,5,0,40,42,3,18,9,0,41,37,1,0,0,0,41,38,1,0,0,0,41,39,1,0,
        0,0,41,40,1,0,0,0,42,5,1,0,0,0,43,44,5,4,0,0,44,48,5,20,0,0,45,46,
        5,5,0,0,46,47,5,21,0,0,47,49,3,14,7,0,48,45,1,0,0,0,48,49,1,0,0,
        0,49,50,1,0,0,0,50,51,5,25,0,0,51,7,1,0,0,0,52,53,5,6,0,0,53,54,
        5,20,0,0,54,55,5,7,0,0,55,56,3,16,8,0,56,57,5,25,0,0,57,9,1,0,0,
        0,58,59,5,8,0,0,59,60,5,20,0,0,60,61,5,9,0,0,61,62,5,21,0,0,62,63,
        5,10,0,0,63,64,5,21,0,0,64,65,5,11,0,0,65,67,5,12,0,0,66,68,3,4,
        2,0,67,66,1,0,0,0,68,69,1,0,0,0,69,67,1,0,0,0,69,70,1,0,0,0,70,71,
        1,0,0,0,71,72,5,13,0,0,72,11,1,0,0,0,73,74,7,0,0,0,74,13,1,0,0,0,
        75,76,7,1,0,0,76,15,1,0,0,0,77,78,5,1,0,0,78,79,3,12,6,0,79,80,5,
        2,0,0,80,81,3,12,6,0,81,82,5,3,0,0,82,17,1,0,0,0,83,86,5,20,0,0,
        84,85,5,16,0,0,85,87,5,20,0,0,86,84,1,0,0,0,86,87,1,0,0,0,87,88,
        1,0,0,0,88,89,5,17,0,0,89,90,5,20,0,0,90,91,5,25,0,0,91,19,1,0,0,
        0,6,23,35,41,48,69,86
    ]

class xaglParser ( Parser ):

    grammarFileName = "xagl.g4"

    atn = ATNDeserializer().deserialize(serializedATN())

    decisionsToDFA = [ DFA(ds, i) for i, ds in enumerate(atn.decisionToState) ]

    sharedContextCache = PredictionContextCache()

    literalNames = [ "<INVALID>", "'('", "','", "')'", "'refresh'", "'after'", 
                     "'move'", "'by'", "'for'", "'in'", "'..'", "'do'", 
                     "'{'", "'}'", "'ms'", "'s'", "'.'", "'='", "<INVALID>", 
                     "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                     "<INVALID>", "<INVALID>", "';'" ]

    symbolicNames = [ "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                      "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                      "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                      "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                      "<INVALID>", "<INVALID>", "SPACES", "COMMENT", "ID", 
                      "INTEGER", "NUMBER", "STRING", "BOOLEAN", "STOP" ]

    RULE_program = 0
    RULE_point = 1
    RULE_statement = 2
    RULE_refreshCommand = 3
    RULE_moveCommand = 4
    RULE_loopStatement = 5
    RULE_expression = 6
    RULE_timeUnit = 7
    RULE_vector = 8
    RULE_stateChange = 9

    ruleNames =  [ "program", "point", "statement", "refreshCommand", "moveCommand", 
                   "loopStatement", "expression", "timeUnit", "vector", 
                   "stateChange" ]

    EOF = Token.EOF
    T__0=1
    T__1=2
    T__2=3
    T__3=4
    T__4=5
    T__5=6
    T__6=7
    T__7=8
    T__8=9
    T__9=10
    T__10=11
    T__11=12
    T__12=13
    T__13=14
    T__14=15
    T__15=16
    T__16=17
    SPACES=18
    COMMENT=19
    ID=20
    INTEGER=21
    NUMBER=22
    STRING=23
    BOOLEAN=24
    STOP=25

    def __init__(self, input:TokenStream, output:TextIO = sys.stdout):
        super().__init__(input, output)
        self.checkVersion("4.13.1")
        self._interp = ParserATNSimulator(self, self.atn, self.decisionsToDFA, self.sharedContextCache)
        self._predicates = None




    class ProgramContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def EOF(self):
            return self.getToken(xaglParser.EOF, 0)

        def statement(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(xaglParser.StatementContext)
            else:
                return self.getTypedRuleContext(xaglParser.StatementContext,i)


        def getRuleIndex(self):
            return xaglParser.RULE_program

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterProgram" ):
                listener.enterProgram(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitProgram" ):
                listener.exitProgram(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitProgram" ):
                return visitor.visitProgram(self)
            else:
                return visitor.visitChildren(self)




    def program(self):

        localctx = xaglParser.ProgramContext(self, self._ctx, self.state)
        self.enterRule(localctx, 0, self.RULE_program)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 23
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while (((_la) & ~0x3f) == 0 and ((1 << _la) & 1048912) != 0):
                self.state = 20
                self.statement()
                self.state = 25
                self._errHandler.sync(self)
                _la = self._input.LA(1)

            self.state = 26
            self.match(xaglParser.EOF)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class PointContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def expression(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(xaglParser.ExpressionContext)
            else:
                return self.getTypedRuleContext(xaglParser.ExpressionContext,i)


        def ID(self):
            return self.getToken(xaglParser.ID, 0)

        def getRuleIndex(self):
            return xaglParser.RULE_point

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterPoint" ):
                listener.enterPoint(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitPoint" ):
                listener.exitPoint(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitPoint" ):
                return visitor.visitPoint(self)
            else:
                return visitor.visitChildren(self)




    def point(self):

        localctx = xaglParser.PointContext(self, self._ctx, self.state)
        self.enterRule(localctx, 2, self.RULE_point)
        try:
            self.state = 35
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [1]:
                self.enterOuterAlt(localctx, 1)
                self.state = 28
                self.match(xaglParser.T__0)
                self.state = 29
                self.expression()
                self.state = 30
                self.match(xaglParser.T__1)
                self.state = 31
                self.expression()
                self.state = 32
                self.match(xaglParser.T__2)
                pass
            elif token in [20]:
                self.enterOuterAlt(localctx, 2)
                self.state = 34
                self.match(xaglParser.ID)
                pass
            else:
                raise NoViableAltException(self)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class StatementContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def refreshCommand(self):
            return self.getTypedRuleContext(xaglParser.RefreshCommandContext,0)


        def moveCommand(self):
            return self.getTypedRuleContext(xaglParser.MoveCommandContext,0)


        def loopStatement(self):
            return self.getTypedRuleContext(xaglParser.LoopStatementContext,0)


        def stateChange(self):
            return self.getTypedRuleContext(xaglParser.StateChangeContext,0)


        def getRuleIndex(self):
            return xaglParser.RULE_statement

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterStatement" ):
                listener.enterStatement(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitStatement" ):
                listener.exitStatement(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitStatement" ):
                return visitor.visitStatement(self)
            else:
                return visitor.visitChildren(self)




    def statement(self):

        localctx = xaglParser.StatementContext(self, self._ctx, self.state)
        self.enterRule(localctx, 4, self.RULE_statement)
        try:
            self.state = 41
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [4]:
                self.enterOuterAlt(localctx, 1)
                self.state = 37
                self.refreshCommand()
                pass
            elif token in [6]:
                self.enterOuterAlt(localctx, 2)
                self.state = 38
                self.moveCommand()
                pass
            elif token in [8]:
                self.enterOuterAlt(localctx, 3)
                self.state = 39
                self.loopStatement()
                pass
            elif token in [20]:
                self.enterOuterAlt(localctx, 4)
                self.state = 40
                self.stateChange()
                pass
            else:
                raise NoViableAltException(self)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class RefreshCommandContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def ID(self):
            return self.getToken(xaglParser.ID, 0)

        def STOP(self):
            return self.getToken(xaglParser.STOP, 0)

        def INTEGER(self):
            return self.getToken(xaglParser.INTEGER, 0)

        def timeUnit(self):
            return self.getTypedRuleContext(xaglParser.TimeUnitContext,0)


        def getRuleIndex(self):
            return xaglParser.RULE_refreshCommand

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterRefreshCommand" ):
                listener.enterRefreshCommand(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitRefreshCommand" ):
                listener.exitRefreshCommand(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitRefreshCommand" ):
                return visitor.visitRefreshCommand(self)
            else:
                return visitor.visitChildren(self)




    def refreshCommand(self):

        localctx = xaglParser.RefreshCommandContext(self, self._ctx, self.state)
        self.enterRule(localctx, 6, self.RULE_refreshCommand)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 43
            self.match(xaglParser.T__3)
            self.state = 44
            self.match(xaglParser.ID)
            self.state = 48
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            if _la==5:
                self.state = 45
                self.match(xaglParser.T__4)
                self.state = 46
                self.match(xaglParser.INTEGER)
                self.state = 47
                self.timeUnit()


            self.state = 50
            self.match(xaglParser.STOP)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class MoveCommandContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def ID(self):
            return self.getToken(xaglParser.ID, 0)

        def vector(self):
            return self.getTypedRuleContext(xaglParser.VectorContext,0)


        def STOP(self):
            return self.getToken(xaglParser.STOP, 0)

        def getRuleIndex(self):
            return xaglParser.RULE_moveCommand

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterMoveCommand" ):
                listener.enterMoveCommand(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitMoveCommand" ):
                listener.exitMoveCommand(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitMoveCommand" ):
                return visitor.visitMoveCommand(self)
            else:
                return visitor.visitChildren(self)




    def moveCommand(self):

        localctx = xaglParser.MoveCommandContext(self, self._ctx, self.state)
        self.enterRule(localctx, 8, self.RULE_moveCommand)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 52
            self.match(xaglParser.T__5)
            self.state = 53
            self.match(xaglParser.ID)
            self.state = 54
            self.match(xaglParser.T__6)
            self.state = 55
            self.vector()
            self.state = 56
            self.match(xaglParser.STOP)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class LoopStatementContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def ID(self):
            return self.getToken(xaglParser.ID, 0)

        def INTEGER(self, i:int=None):
            if i is None:
                return self.getTokens(xaglParser.INTEGER)
            else:
                return self.getToken(xaglParser.INTEGER, i)

        def statement(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(xaglParser.StatementContext)
            else:
                return self.getTypedRuleContext(xaglParser.StatementContext,i)


        def getRuleIndex(self):
            return xaglParser.RULE_loopStatement

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterLoopStatement" ):
                listener.enterLoopStatement(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitLoopStatement" ):
                listener.exitLoopStatement(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitLoopStatement" ):
                return visitor.visitLoopStatement(self)
            else:
                return visitor.visitChildren(self)




    def loopStatement(self):

        localctx = xaglParser.LoopStatementContext(self, self._ctx, self.state)
        self.enterRule(localctx, 10, self.RULE_loopStatement)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 58
            self.match(xaglParser.T__7)
            self.state = 59
            self.match(xaglParser.ID)
            self.state = 60
            self.match(xaglParser.T__8)
            self.state = 61
            self.match(xaglParser.INTEGER)
            self.state = 62
            self.match(xaglParser.T__9)
            self.state = 63
            self.match(xaglParser.INTEGER)
            self.state = 64
            self.match(xaglParser.T__10)
            self.state = 65
            self.match(xaglParser.T__11)
            self.state = 67 
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while True:
                self.state = 66
                self.statement()
                self.state = 69 
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                if not ((((_la) & ~0x3f) == 0 and ((1 << _la) & 1048912) != 0)):
                    break

            self.state = 71
            self.match(xaglParser.T__12)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class ExpressionContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def INTEGER(self):
            return self.getToken(xaglParser.INTEGER, 0)

        def NUMBER(self):
            return self.getToken(xaglParser.NUMBER, 0)

        def BOOLEAN(self):
            return self.getToken(xaglParser.BOOLEAN, 0)

        def STRING(self):
            return self.getToken(xaglParser.STRING, 0)

        def ID(self):
            return self.getToken(xaglParser.ID, 0)

        def getRuleIndex(self):
            return xaglParser.RULE_expression

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterExpression" ):
                listener.enterExpression(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitExpression" ):
                listener.exitExpression(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitExpression" ):
                return visitor.visitExpression(self)
            else:
                return visitor.visitChildren(self)




    def expression(self):

        localctx = xaglParser.ExpressionContext(self, self._ctx, self.state)
        self.enterRule(localctx, 12, self.RULE_expression)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 73
            _la = self._input.LA(1)
            if not((((_la) & ~0x3f) == 0 and ((1 << _la) & 32505856) != 0)):
                self._errHandler.recoverInline(self)
            else:
                self._errHandler.reportMatch(self)
                self.consume()
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class TimeUnitContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser


        def getRuleIndex(self):
            return xaglParser.RULE_timeUnit

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterTimeUnit" ):
                listener.enterTimeUnit(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitTimeUnit" ):
                listener.exitTimeUnit(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitTimeUnit" ):
                return visitor.visitTimeUnit(self)
            else:
                return visitor.visitChildren(self)




    def timeUnit(self):

        localctx = xaglParser.TimeUnitContext(self, self._ctx, self.state)
        self.enterRule(localctx, 14, self.RULE_timeUnit)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 75
            _la = self._input.LA(1)
            if not(_la==14 or _la==15):
                self._errHandler.recoverInline(self)
            else:
                self._errHandler.reportMatch(self)
                self.consume()
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class VectorContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def expression(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(xaglParser.ExpressionContext)
            else:
                return self.getTypedRuleContext(xaglParser.ExpressionContext,i)


        def getRuleIndex(self):
            return xaglParser.RULE_vector

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterVector" ):
                listener.enterVector(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitVector" ):
                listener.exitVector(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitVector" ):
                return visitor.visitVector(self)
            else:
                return visitor.visitChildren(self)




    def vector(self):

        localctx = xaglParser.VectorContext(self, self._ctx, self.state)
        self.enterRule(localctx, 16, self.RULE_vector)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 77
            self.match(xaglParser.T__0)
            self.state = 78
            self.expression()
            self.state = 79
            self.match(xaglParser.T__1)
            self.state = 80
            self.expression()
            self.state = 81
            self.match(xaglParser.T__2)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class StateChangeContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def ID(self, i:int=None):
            if i is None:
                return self.getTokens(xaglParser.ID)
            else:
                return self.getToken(xaglParser.ID, i)

        def STOP(self):
            return self.getToken(xaglParser.STOP, 0)

        def getRuleIndex(self):
            return xaglParser.RULE_stateChange

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterStateChange" ):
                listener.enterStateChange(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitStateChange" ):
                listener.exitStateChange(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitStateChange" ):
                return visitor.visitStateChange(self)
            else:
                return visitor.visitChildren(self)




    def stateChange(self):

        localctx = xaglParser.StateChangeContext(self, self._ctx, self.state)
        self.enterRule(localctx, 18, self.RULE_stateChange)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 83
            self.match(xaglParser.ID)
            self.state = 86
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            if _la==16:
                self.state = 84
                self.match(xaglParser.T__15)
                self.state = 85
                self.match(xaglParser.ID)


            self.state = 88
            self.match(xaglParser.T__16)
            self.state = 89
            self.match(xaglParser.ID)
            self.state = 90
            self.match(xaglParser.STOP)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx





