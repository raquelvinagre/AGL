// Generated from agl.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class aglParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, T__39=40, T__40=41, T__41=42, T__42=43, T__43=44, T__44=45, 
		T__45=46, T__46=47, T__47=48, T__48=49, T__49=50, T__50=51, T__51=52, 
		T__52=53, T__53=54, T__54=55, T__55=56, T__56=57, T__57=58, T__58=59, 
		T__59=60, SPACES=61, COMMENT=62, MULTILINE_COMMENT=63, ObjectID=64, ColorID=65, 
		PropertyID=66, ID=67, INTEGER=68, NUMBER=69, STRING=70, BOOLEAN=71, STOP=72, 
		ModelID=73, EnumID=74;
	public static final int
		RULE_program = 0, RULE_point = 1, RULE_vector = 2, RULE_vectorANDpointExpr = 3, 
		RULE_polarcoordinates = 4, RULE_polarangle = 5, RULE_polarlength = 6, 
		RULE_statement = 7, RULE_viewDeclaration = 8, RULE_variableDeclaration = 9, 
		RULE_loopDeclaration = 10, RULE_whileLoop = 11, RULE_objectInstantiation = 12, 
		RULE_objectUpdate = 13, RULE_modelInstantiation = 14, RULE_propertyAssignment = 15, 
		RULE_variableUpdate = 16, RULE_multiplePropertyAssignment = 17, RULE_printStatement = 18, 
		RULE_conditionalStatement = 19, RULE_elseIfClause = 20, RULE_elseClause = 21, 
		RULE_listDeclaration = 22, RULE_listElementAssignment = 23, RULE_listElementAccess = 24, 
		RULE_command = 25, RULE_waitCommand = 26, RULE_closeCommand = 27, RULE_refreshCommand = 28, 
		RULE_moveCommand = 29, RULE_propertyValue = 30, RULE_propertyList = 31, 
		RULE_expression = 32, RULE_primaryExpr = 33, RULE_arithmeticExpr = 34, 
		RULE_booleanExpr = 35, RULE_stringExpr = 36, RULE_comparisonOperator = 37, 
		RULE_type = 38, RULE_scriptDeclaration = 39, RULE_scriptSource = 40, RULE_playCommand = 41, 
		RULE_scriptAssignment = 42, RULE_modelDeclaration = 43, RULE_modelBody = 44, 
		RULE_modelElement = 45, RULE_enumDeclaration = 46, RULE_enumValues = 47, 
		RULE_actionOnEnum = 48, RULE_enumActionBody = 49, RULE_enumCase = 50, 
		RULE_conditionalEnumStatement = 51, RULE_elseIfEnumClause = 52, RULE_elseEnumClause = 53, 
		RULE_propertyEnumAssignment = 54;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "point", "vector", "vectorANDpointExpr", "polarcoordinates", 
			"polarangle", "polarlength", "statement", "viewDeclaration", "variableDeclaration", 
			"loopDeclaration", "whileLoop", "objectInstantiation", "objectUpdate", 
			"modelInstantiation", "propertyAssignment", "variableUpdate", "multiplePropertyAssignment", 
			"printStatement", "conditionalStatement", "elseIfClause", "elseClause", 
			"listDeclaration", "listElementAssignment", "listElementAccess", "command", 
			"waitCommand", "closeCommand", "refreshCommand", "moveCommand", "propertyValue", 
			"propertyList", "expression", "primaryExpr", "arithmeticExpr", "booleanExpr", 
			"stringExpr", "comparisonOperator", "type", "scriptDeclaration", "scriptSource", 
			"playCommand", "scriptAssignment", "modelDeclaration", "modelBody", "modelElement", 
			"enumDeclaration", "enumValues", "actionOnEnum", "enumActionBody", "enumCase", 
			"conditionalEnumStatement", "elseIfEnumClause", "elseEnumClause", "propertyEnumAssignment"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "','", "':'", "'pi'", "'deg'", "'View'", "'='", "'for'", 
			"'in'", "'..'", "'do'", "'{'", "'}'", "'while'", "'at'", "'with'", "'.'", 
			"'print'", "'if'", "'else if'", "'else'", "'List'", "'<'", "'>'", "'['", 
			"']'", "'wait mouse click'", "'close'", "'refresh'", "'after'", "'ms'", 
			"'move'", "'by'", "'-'", "'*'", "'/'", "'+'", "'NOT'", "'AND'", "'OR'", 
			"'<='", "'>='", "'=='", "'!='", "'Number'", "'Integer'", "'String'", 
			"'Point'", "'Vector'", "'Time'", "'Boolean'", "'Script'", "'load'", "'input'", 
			"'play'", "'::'", "'Model'", "'Enum'", "'action on'", null, null, null, 
			null, null, null, null, null, null, null, null, "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, "SPACES", "COMMENT", "MULTILINE_COMMENT", "ObjectID", "ColorID", 
			"PropertyID", "ID", "INTEGER", "NUMBER", "STRING", "BOOLEAN", "STOP", 
			"ModelID", "EnumID"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "agl.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public aglParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(aglParser.EOF, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof aglListener ) ((aglListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof aglListener ) ((aglListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof aglVisitor ) return ((aglVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(113);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1224979109115494912L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 525L) != 0)) {
				{
				{
				setState(110);
				statement();
				}
				}
				setState(115);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(116);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PointContext extends ParserRuleContext {
		public VectorContext vector() {
			return getRuleContext(VectorContext.class,0);
		}
		public TerminalNode ID() { return getToken(aglParser.ID, 0); }
		public PointContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_point; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof aglListener ) ((aglListener)listener).enterPoint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof aglListener ) ((aglListener)listener).exitPoint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof aglVisitor ) return ((aglVisitor<? extends T>)visitor).visitPoint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PointContext point() throws RecognitionException {
		PointContext _localctx = new PointContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_point);
		try {
			setState(120);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				enterOuterAlt(_localctx, 1);
				{
				setState(118);
				vector();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(119);
				match(ID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class VectorContext extends ParserRuleContext {
		public PolarcoordinatesContext polarcoordinates() {
			return getRuleContext(PolarcoordinatesContext.class,0);
		}
		public VectorANDpointExprContext vectorANDpointExpr() {
			return getRuleContext(VectorANDpointExprContext.class,0);
		}
		public VectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vector; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof aglListener ) ((aglListener)listener).enterVector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof aglListener ) ((aglListener)listener).exitVector(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof aglVisitor ) return ((aglVisitor<? extends T>)visitor).visitVector(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VectorContext vector() throws RecognitionException {
		VectorContext _localctx = new VectorContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_vector);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(122);
			match(T__0);
			setState(125);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(123);
				polarcoordinates();
				}
				break;
			case 2:
				{
				setState(124);
				vectorANDpointExpr();
				}
				break;
			}
			setState(127);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class VectorANDpointExprContext extends ParserRuleContext {
		public List<PrimaryExprContext> primaryExpr() {
			return getRuleContexts(PrimaryExprContext.class);
		}
		public PrimaryExprContext primaryExpr(int i) {
			return getRuleContext(PrimaryExprContext.class,i);
		}
		public VectorANDpointExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vectorANDpointExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof aglListener ) ((aglListener)listener).enterVectorANDpointExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof aglListener ) ((aglListener)listener).exitVectorANDpointExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof aglVisitor ) return ((aglVisitor<? extends T>)visitor).visitVectorANDpointExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VectorANDpointExprContext vectorANDpointExpr() throws RecognitionException {
		VectorANDpointExprContext _localctx = new VectorANDpointExprContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_vectorANDpointExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(129);
			primaryExpr();
			setState(130);
			match(T__2);
			setState(131);
			primaryExpr();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PolarcoordinatesContext extends ParserRuleContext {
		public PolarangleContext polarangle() {
			return getRuleContext(PolarangleContext.class,0);
		}
		public PolarlengthContext polarlength() {
			return getRuleContext(PolarlengthContext.class,0);
		}
		public PolarcoordinatesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_polarcoordinates; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof aglListener ) ((aglListener)listener).enterPolarcoordinates(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof aglListener ) ((aglListener)listener).exitPolarcoordinates(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof aglVisitor ) return ((aglVisitor<? extends T>)visitor).visitPolarcoordinates(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PolarcoordinatesContext polarcoordinates() throws RecognitionException {
		PolarcoordinatesContext _localctx = new PolarcoordinatesContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_polarcoordinates);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(133);
			polarangle();
			setState(134);
			match(T__3);
			setState(135);
			polarlength();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PolarangleContext extends ParserRuleContext {
		public PrimaryExprContext primaryExpr() {
			return getRuleContext(PrimaryExprContext.class,0);
		}
		public TerminalNode ID() { return getToken(aglParser.ID, 0); }
		public PolarangleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_polarangle; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof aglListener ) ((aglListener)listener).enterPolarangle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof aglListener ) ((aglListener)listener).exitPolarangle(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof aglVisitor ) return ((aglVisitor<? extends T>)visitor).visitPolarangle(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PolarangleContext polarangle() throws RecognitionException {
		PolarangleContext _localctx = new PolarangleContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_polarangle);
		int _la;
		try {
			setState(141);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(137);
				primaryExpr();
				setState(138);
				_la = _input.LA(1);
				if ( !(_la==T__4 || _la==T__5) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(140);
				match(ID);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PolarlengthContext extends ParserRuleContext {
		public PrimaryExprContext primaryExpr() {
			return getRuleContext(PrimaryExprContext.class,0);
		}
		public TerminalNode ID() { return getToken(aglParser.ID, 0); }
		public PolarlengthContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_polarlength; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof aglListener ) ((aglListener)listener).enterPolarlength(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof aglListener ) ((aglListener)listener).exitPolarlength(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof aglVisitor ) return ((aglVisitor<? extends T>)visitor).visitPolarlength(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PolarlengthContext polarlength() throws RecognitionException {
		PolarlengthContext _localctx = new PolarlengthContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_polarlength);
		try {
			setState(145);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(143);
				primaryExpr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(144);
				match(ID);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StatementContext extends ParserRuleContext {
		public ViewDeclarationContext viewDeclaration() {
			return getRuleContext(ViewDeclarationContext.class,0);
		}
		public LoopDeclarationContext loopDeclaration() {
			return getRuleContext(LoopDeclarationContext.class,0);
		}
		public VariableDeclarationContext variableDeclaration() {
			return getRuleContext(VariableDeclarationContext.class,0);
		}
		public ObjectInstantiationContext objectInstantiation() {
			return getRuleContext(ObjectInstantiationContext.class,0);
		}
		public ModelInstantiationContext modelInstantiation() {
			return getRuleContext(ModelInstantiationContext.class,0);
		}
		public PropertyAssignmentContext propertyAssignment() {
			return getRuleContext(PropertyAssignmentContext.class,0);
		}
		public PropertyEnumAssignmentContext propertyEnumAssignment() {
			return getRuleContext(PropertyEnumAssignmentContext.class,0);
		}
		public VariableUpdateContext variableUpdate() {
			return getRuleContext(VariableUpdateContext.class,0);
		}
		public ObjectUpdateContext objectUpdate() {
			return getRuleContext(ObjectUpdateContext.class,0);
		}
		public MultiplePropertyAssignmentContext multiplePropertyAssignment() {
			return getRuleContext(MultiplePropertyAssignmentContext.class,0);
		}
		public CommandContext command() {
			return getRuleContext(CommandContext.class,0);
		}
		public PrintStatementContext printStatement() {
			return getRuleContext(PrintStatementContext.class,0);
		}
		public ConditionalStatementContext conditionalStatement() {
			return getRuleContext(ConditionalStatementContext.class,0);
		}
		public ListDeclarationContext listDeclaration() {
			return getRuleContext(ListDeclarationContext.class,0);
		}
		public ListElementAssignmentContext listElementAssignment() {
			return getRuleContext(ListElementAssignmentContext.class,0);
		}
		public ListElementAccessContext listElementAccess() {
			return getRuleContext(ListElementAccessContext.class,0);
		}
		public WhileLoopContext whileLoop() {
			return getRuleContext(WhileLoopContext.class,0);
		}
		public ScriptDeclarationContext scriptDeclaration() {
			return getRuleContext(ScriptDeclarationContext.class,0);
		}
		public PlayCommandContext playCommand() {
			return getRuleContext(PlayCommandContext.class,0);
		}
		public ModelDeclarationContext modelDeclaration() {
			return getRuleContext(ModelDeclarationContext.class,0);
		}
		public EnumDeclarationContext enumDeclaration() {
			return getRuleContext(EnumDeclarationContext.class,0);
		}
		public ConditionalEnumStatementContext conditionalEnumStatement() {
			return getRuleContext(ConditionalEnumStatementContext.class,0);
		}
		public ActionOnEnumContext actionOnEnum() {
			return getRuleContext(ActionOnEnumContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof aglListener ) ((aglListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof aglListener ) ((aglListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof aglVisitor ) return ((aglVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_statement);
		try {
			setState(170);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(147);
				viewDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(148);
				loopDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(149);
				variableDeclaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(150);
				objectInstantiation();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(151);
				modelInstantiation();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(152);
				propertyAssignment();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(153);
				propertyEnumAssignment();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(154);
				variableUpdate();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(155);
				objectUpdate();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(156);
				multiplePropertyAssignment();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(157);
				command();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(158);
				printStatement();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(159);
				conditionalStatement();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(160);
				listDeclaration();
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(161);
				listElementAssignment();
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(162);
				listElementAccess();
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(163);
				whileLoop();
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(164);
				scriptDeclaration();
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(165);
				playCommand();
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(166);
				modelDeclaration();
				}
				break;
			case 21:
				enterOuterAlt(_localctx, 21);
				{
				setState(167);
				enumDeclaration();
				}
				break;
			case 22:
				enterOuterAlt(_localctx, 22);
				{
				setState(168);
				conditionalEnumStatement();
				}
				break;
			case 23:
				enterOuterAlt(_localctx, 23);
				{
				setState(169);
				actionOnEnum();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ViewDeclarationContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(aglParser.ID, 0); }
		public MultiplePropertyAssignmentContext multiplePropertyAssignment() {
			return getRuleContext(MultiplePropertyAssignmentContext.class,0);
		}
		public ViewDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_viewDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof aglListener ) ((aglListener)listener).enterViewDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof aglListener ) ((aglListener)listener).exitViewDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof aglVisitor ) return ((aglVisitor<? extends T>)visitor).visitViewDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ViewDeclarationContext viewDeclaration() throws RecognitionException {
		ViewDeclarationContext _localctx = new ViewDeclarationContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_viewDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(172);
			match(ID);
			setState(173);
			match(T__3);
			setState(174);
			match(T__6);
			setState(175);
			multiplePropertyAssignment();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class VariableDeclarationContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(aglParser.ID, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode STOP() { return getToken(aglParser.STOP, 0); }
		public ObjectInstantiationContext objectInstantiation() {
			return getRuleContext(ObjectInstantiationContext.class,0);
		}
		public WaitCommandContext waitCommand() {
			return getRuleContext(WaitCommandContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public VariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof aglListener ) ((aglListener)listener).enterVariableDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof aglListener ) ((aglListener)listener).exitVariableDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof aglVisitor ) return ((aglVisitor<? extends T>)visitor).visitVariableDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclarationContext variableDeclaration() throws RecognitionException {
		VariableDeclarationContext _localctx = new VariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_variableDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(177);
			match(ID);
			setState(178);
			match(T__3);
			setState(188);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__22:
			case T__45:
			case T__46:
			case T__47:
			case T__48:
			case T__49:
			case T__50:
			case T__51:
			case T__52:
				{
				setState(179);
				type();
				setState(180);
				match(T__7);
				setState(183);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__27:
					{
					setState(181);
					waitCommand();
					}
					break;
				case T__0:
				case T__34:
				case T__38:
				case ID:
				case INTEGER:
				case NUMBER:
				case STRING:
				case BOOLEAN:
				case ModelID:
					{
					setState(182);
					expression();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(185);
				match(STOP);
				}
				break;
			case ObjectID:
				{
				setState(187);
				objectInstantiation();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LoopDeclarationContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(aglParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(aglParser.ID, i);
		}
		public List<TerminalNode> INTEGER() { return getTokens(aglParser.INTEGER); }
		public TerminalNode INTEGER(int i) {
			return getToken(aglParser.INTEGER, i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public LoopDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loopDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof aglListener ) ((aglListener)listener).enterLoopDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof aglListener ) ((aglListener)listener).exitLoopDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof aglVisitor ) return ((aglVisitor<? extends T>)visitor).visitLoopDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LoopDeclarationContext loopDeclaration() throws RecognitionException {
		LoopDeclarationContext _localctx = new LoopDeclarationContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_loopDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(190);
			match(T__8);
			setState(191);
			match(ID);
			setState(192);
			match(T__9);
			setState(201);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				{
				setState(193);
				match(ID);
				}
				break;
			case INTEGER:
				{
				setState(194);
				match(INTEGER);
				setState(195);
				match(T__10);
				setState(196);
				match(INTEGER);
				setState(199);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__10) {
					{
					setState(197);
					match(T__10);
					setState(198);
					match(INTEGER);
					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(203);
			match(T__11);
			setState(204);
			match(T__12);
			setState(206); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(205);
				statement();
				}
				}
				setState(208); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 1224979109115494912L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 525L) != 0) );
			setState(210);
			match(T__13);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class WhileLoopContext extends ParserRuleContext {
		public BooleanExprContext booleanExpr() {
			return getRuleContext(BooleanExprContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public WhileLoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileLoop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof aglListener ) ((aglListener)listener).enterWhileLoop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof aglListener ) ((aglListener)listener).exitWhileLoop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof aglVisitor ) return ((aglVisitor<? extends T>)visitor).visitWhileLoop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileLoopContext whileLoop() throws RecognitionException {
		WhileLoopContext _localctx = new WhileLoopContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_whileLoop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(212);
			match(T__14);
			setState(213);
			booleanExpr(0);
			setState(214);
			match(T__11);
			setState(215);
			match(T__12);
			setState(217); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(216);
				statement();
				}
				}
				setState(219); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 1224979109115494912L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 525L) != 0) );
			setState(221);
			match(T__13);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ObjectInstantiationContext extends ParserRuleContext {
		public TerminalNode ObjectID() { return getToken(aglParser.ObjectID, 0); }
		public PointContext point() {
			return getRuleContext(PointContext.class,0);
		}
		public MultiplePropertyAssignmentContext multiplePropertyAssignment() {
			return getRuleContext(MultiplePropertyAssignmentContext.class,0);
		}
		public ObjectInstantiationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objectInstantiation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof aglListener ) ((aglListener)listener).enterObjectInstantiation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof aglListener ) ((aglListener)listener).exitObjectInstantiation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof aglVisitor ) return ((aglVisitor<? extends T>)visitor).visitObjectInstantiation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ObjectInstantiationContext objectInstantiation() throws RecognitionException {
		ObjectInstantiationContext _localctx = new ObjectInstantiationContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_objectInstantiation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(223);
			match(ObjectID);
			setState(224);
			match(T__15);
			setState(225);
			point();
			setState(226);
			multiplePropertyAssignment();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ObjectUpdateContext extends ParserRuleContext {
		public PropertyListContext propertyList() {
			return getRuleContext(PropertyListContext.class,0);
		}
		public List<TerminalNode> ID() { return getTokens(aglParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(aglParser.ID, i);
		}
		public ObjectUpdateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objectUpdate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof aglListener ) ((aglListener)listener).enterObjectUpdate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof aglListener ) ((aglListener)listener).exitObjectUpdate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof aglVisitor ) return ((aglVisitor<? extends T>)visitor).visitObjectUpdate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ObjectUpdateContext objectUpdate() throws RecognitionException {
		ObjectUpdateContext _localctx = new ObjectUpdateContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_objectUpdate);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(228);
			match(T__16);
			{
			setState(229);
			match(ID);
			setState(232);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__17) {
				{
				setState(230);
				match(T__17);
				setState(231);
				match(ID);
				}
			}

			setState(234);
			match(T__11);
			}
			setState(236);
			match(T__12);
			setState(237);
			propertyList();
			setState(238);
			match(T__13);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ModelInstantiationContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(aglParser.ID, 0); }
		public TerminalNode ModelID() { return getToken(aglParser.ModelID, 0); }
		public PointContext point() {
			return getRuleContext(PointContext.class,0);
		}
		public TerminalNode STOP() { return getToken(aglParser.STOP, 0); }
		public ModelInstantiationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modelInstantiation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof aglListener ) ((aglListener)listener).enterModelInstantiation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof aglListener ) ((aglListener)listener).exitModelInstantiation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof aglVisitor ) return ((aglVisitor<? extends T>)visitor).visitModelInstantiation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ModelInstantiationContext modelInstantiation() throws RecognitionException {
		ModelInstantiationContext _localctx = new ModelInstantiationContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_modelInstantiation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(240);
			match(ID);
			setState(241);
			match(T__3);
			setState(242);
			match(ModelID);
			setState(243);
			match(T__15);
			setState(244);
			point();
			setState(245);
			match(STOP);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PropertyAssignmentContext extends ParserRuleContext {
		public TerminalNode PropertyID() { return getToken(aglParser.PropertyID, 0); }
		public PropertyValueContext propertyValue() {
			return getRuleContext(PropertyValueContext.class,0);
		}
		public TerminalNode STOP() { return getToken(aglParser.STOP, 0); }
		public TerminalNode ID() { return getToken(aglParser.ID, 0); }
		public PropertyAssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propertyAssignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof aglListener ) ((aglListener)listener).enterPropertyAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof aglListener ) ((aglListener)listener).exitPropertyAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof aglVisitor ) return ((aglVisitor<? extends T>)visitor).visitPropertyAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropertyAssignmentContext propertyAssignment() throws RecognitionException {
		PropertyAssignmentContext _localctx = new PropertyAssignmentContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_propertyAssignment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(249);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(247);
				match(ID);
				setState(248);
				match(T__17);
				}
			}

			setState(251);
			match(PropertyID);
			setState(252);
			match(T__7);
			setState(253);
			propertyValue();
			setState(254);
			match(STOP);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class VariableUpdateContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(aglParser.ID, 0); }
		public TerminalNode STOP() { return getToken(aglParser.STOP, 0); }
		public WaitCommandContext waitCommand() {
			return getRuleContext(WaitCommandContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public VariableUpdateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableUpdate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof aglListener ) ((aglListener)listener).enterVariableUpdate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof aglListener ) ((aglListener)listener).exitVariableUpdate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof aglVisitor ) return ((aglVisitor<? extends T>)visitor).visitVariableUpdate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableUpdateContext variableUpdate() throws RecognitionException {
		VariableUpdateContext _localctx = new VariableUpdateContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_variableUpdate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(256);
			match(ID);
			setState(257);
			match(T__7);
			setState(260);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__27:
				{
				setState(258);
				waitCommand();
				}
				break;
			case T__0:
			case T__34:
			case T__38:
			case ID:
			case INTEGER:
			case NUMBER:
			case STRING:
			case BOOLEAN:
			case ModelID:
				{
				setState(259);
				expression();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(262);
			match(STOP);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MultiplePropertyAssignmentContext extends ParserRuleContext {
		public PropertyListContext propertyList() {
			return getRuleContext(PropertyListContext.class,0);
		}
		public MultiplePropertyAssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplePropertyAssignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof aglListener ) ((aglListener)listener).enterMultiplePropertyAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof aglListener ) ((aglListener)listener).exitMultiplePropertyAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof aglVisitor ) return ((aglVisitor<? extends T>)visitor).visitMultiplePropertyAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultiplePropertyAssignmentContext multiplePropertyAssignment() throws RecognitionException {
		MultiplePropertyAssignmentContext _localctx = new MultiplePropertyAssignmentContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_multiplePropertyAssignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(264);
			match(T__16);
			setState(265);
			match(T__12);
			setState(266);
			propertyList();
			setState(267);
			match(T__13);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PrintStatementContext extends ParserRuleContext {
		public TerminalNode STOP() { return getToken(aglParser.STOP, 0); }
		public TerminalNode STRING() { return getToken(aglParser.STRING, 0); }
		public TerminalNode ID() { return getToken(aglParser.ID, 0); }
		public ListElementAccessContext listElementAccess() {
			return getRuleContext(ListElementAccessContext.class,0);
		}
		public PrintStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof aglListener ) ((aglListener)listener).enterPrintStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof aglListener ) ((aglListener)listener).exitPrintStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof aglVisitor ) return ((aglVisitor<? extends T>)visitor).visitPrintStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintStatementContext printStatement() throws RecognitionException {
		PrintStatementContext _localctx = new PrintStatementContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_printStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(269);
			match(T__18);
			setState(273);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				setState(270);
				match(STRING);
				}
				break;
			case 2:
				{
				setState(271);
				match(ID);
				}
				break;
			case 3:
				{
				setState(272);
				listElementAccess();
				}
				break;
			}
			setState(275);
			match(STOP);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ConditionalStatementContext extends ParserRuleContext {
		public BooleanExprContext booleanExpr() {
			return getRuleContext(BooleanExprContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<ElseIfClauseContext> elseIfClause() {
			return getRuleContexts(ElseIfClauseContext.class);
		}
		public ElseIfClauseContext elseIfClause(int i) {
			return getRuleContext(ElseIfClauseContext.class,i);
		}
		public ElseClauseContext elseClause() {
			return getRuleContext(ElseClauseContext.class,0);
		}
		public ConditionalStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionalStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof aglListener ) ((aglListener)listener).enterConditionalStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof aglListener ) ((aglListener)listener).exitConditionalStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof aglVisitor ) return ((aglVisitor<? extends T>)visitor).visitConditionalStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionalStatementContext conditionalStatement() throws RecognitionException {
		ConditionalStatementContext _localctx = new ConditionalStatementContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_conditionalStatement);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(277);
			match(T__19);
			setState(278);
			booleanExpr(0);
			setState(279);
			match(T__12);
			setState(281); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(280);
				statement();
				}
				}
				setState(283); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 1224979109115494912L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 525L) != 0) );
			setState(285);
			match(T__13);
			setState(289);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(286);
					elseIfClause();
					}
					} 
				}
				setState(291);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			}
			setState(293);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				{
				setState(292);
				elseClause();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ElseIfClauseContext extends ParserRuleContext {
		public BooleanExprContext booleanExpr() {
			return getRuleContext(BooleanExprContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ElseIfClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseIfClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof aglListener ) ((aglListener)listener).enterElseIfClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof aglListener ) ((aglListener)listener).exitElseIfClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof aglVisitor ) return ((aglVisitor<? extends T>)visitor).visitElseIfClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElseIfClauseContext elseIfClause() throws RecognitionException {
		ElseIfClauseContext _localctx = new ElseIfClauseContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_elseIfClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(295);
			match(T__20);
			setState(296);
			booleanExpr(0);
			setState(297);
			match(T__12);
			setState(299); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(298);
				statement();
				}
				}
				setState(301); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 1224979109115494912L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 525L) != 0) );
			setState(303);
			match(T__13);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ElseClauseContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ElseClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof aglListener ) ((aglListener)listener).enterElseClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof aglListener ) ((aglListener)listener).exitElseClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof aglVisitor ) return ((aglVisitor<? extends T>)visitor).visitElseClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElseClauseContext elseClause() throws RecognitionException {
		ElseClauseContext _localctx = new ElseClauseContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_elseClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(305);
			match(T__21);
			setState(306);
			match(T__12);
			setState(308); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(307);
				statement();
				}
				}
				setState(310); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 1224979109115494912L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 525L) != 0) );
			setState(312);
			match(T__13);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ListDeclarationContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(aglParser.ID, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode STOP() { return getToken(aglParser.STOP, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ListDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof aglListener ) ((aglListener)listener).enterListDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof aglListener ) ((aglListener)listener).exitListDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof aglVisitor ) return ((aglVisitor<? extends T>)visitor).visitListDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListDeclarationContext listDeclaration() throws RecognitionException {
		ListDeclarationContext _localctx = new ListDeclarationContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_listDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(314);
			match(ID);
			setState(315);
			match(T__3);
			setState(316);
			match(T__22);
			setState(317);
			match(T__23);
			setState(318);
			type();
			setState(319);
			match(T__24);
			setState(320);
			match(T__7);
			setState(321);
			match(T__25);
			setState(330);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 584115552258L) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & 95L) != 0)) {
				{
				setState(322);
				expression();
				setState(327);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(323);
					match(T__2);
					setState(324);
					expression();
					}
					}
					setState(329);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(332);
			match(T__26);
			setState(333);
			match(STOP);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ListElementAssignmentContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(aglParser.ID, 0); }
		public PrimaryExprContext primaryExpr() {
			return getRuleContext(PrimaryExprContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode STOP() { return getToken(aglParser.STOP, 0); }
		public ListElementAssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listElementAssignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof aglListener ) ((aglListener)listener).enterListElementAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof aglListener ) ((aglListener)listener).exitListElementAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof aglVisitor ) return ((aglVisitor<? extends T>)visitor).visitListElementAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListElementAssignmentContext listElementAssignment() throws RecognitionException {
		ListElementAssignmentContext _localctx = new ListElementAssignmentContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_listElementAssignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(335);
			match(ID);
			setState(336);
			match(T__25);
			setState(337);
			primaryExpr();
			setState(338);
			match(T__26);
			setState(339);
			match(T__7);
			setState(340);
			expression();
			setState(341);
			match(STOP);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ListElementAccessContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(aglParser.ID, 0); }
		public PrimaryExprContext primaryExpr() {
			return getRuleContext(PrimaryExprContext.class,0);
		}
		public ListElementAccessContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listElementAccess; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof aglListener ) ((aglListener)listener).enterListElementAccess(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof aglListener ) ((aglListener)listener).exitListElementAccess(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof aglVisitor ) return ((aglVisitor<? extends T>)visitor).visitListElementAccess(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListElementAccessContext listElementAccess() throws RecognitionException {
		ListElementAccessContext _localctx = new ListElementAccessContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_listElementAccess);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(343);
			match(ID);
			setState(344);
			match(T__25);
			setState(345);
			primaryExpr();
			setState(346);
			match(T__26);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CommandContext extends ParserRuleContext {
		public WaitCommandContext waitCommand() {
			return getRuleContext(WaitCommandContext.class,0);
		}
		public CloseCommandContext closeCommand() {
			return getRuleContext(CloseCommandContext.class,0);
		}
		public RefreshCommandContext refreshCommand() {
			return getRuleContext(RefreshCommandContext.class,0);
		}
		public MoveCommandContext moveCommand() {
			return getRuleContext(MoveCommandContext.class,0);
		}
		public CommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_command; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof aglListener ) ((aglListener)listener).enterCommand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof aglListener ) ((aglListener)listener).exitCommand(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof aglVisitor ) return ((aglVisitor<? extends T>)visitor).visitCommand(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CommandContext command() throws RecognitionException {
		CommandContext _localctx = new CommandContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_command);
		try {
			setState(352);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__27:
				enterOuterAlt(_localctx, 1);
				{
				setState(348);
				waitCommand();
				}
				break;
			case T__28:
				enterOuterAlt(_localctx, 2);
				{
				setState(349);
				closeCommand();
				}
				break;
			case T__29:
				enterOuterAlt(_localctx, 3);
				{
				setState(350);
				refreshCommand();
				}
				break;
			case T__32:
				enterOuterAlt(_localctx, 4);
				{
				setState(351);
				moveCommand();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class WaitCommandContext extends ParserRuleContext {
		public WaitCommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_waitCommand; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof aglListener ) ((aglListener)listener).enterWaitCommand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof aglListener ) ((aglListener)listener).exitWaitCommand(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof aglVisitor ) return ((aglVisitor<? extends T>)visitor).visitWaitCommand(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WaitCommandContext waitCommand() throws RecognitionException {
		WaitCommandContext _localctx = new WaitCommandContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_waitCommand);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(354);
			match(T__27);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CloseCommandContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(aglParser.ID, 0); }
		public TerminalNode STOP() { return getToken(aglParser.STOP, 0); }
		public CloseCommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_closeCommand; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof aglListener ) ((aglListener)listener).enterCloseCommand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof aglListener ) ((aglListener)listener).exitCloseCommand(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof aglVisitor ) return ((aglVisitor<? extends T>)visitor).visitCloseCommand(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CloseCommandContext closeCommand() throws RecognitionException {
		CloseCommandContext _localctx = new CloseCommandContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_closeCommand);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(356);
			match(T__28);
			setState(357);
			match(ID);
			setState(358);
			match(STOP);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RefreshCommandContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(aglParser.ID, 0); }
		public TerminalNode STOP() { return getToken(aglParser.STOP, 0); }
		public TerminalNode INTEGER() { return getToken(aglParser.INTEGER, 0); }
		public RefreshCommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_refreshCommand; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof aglListener ) ((aglListener)listener).enterRefreshCommand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof aglListener ) ((aglListener)listener).exitRefreshCommand(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof aglVisitor ) return ((aglVisitor<? extends T>)visitor).visitRefreshCommand(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RefreshCommandContext refreshCommand() throws RecognitionException {
		RefreshCommandContext _localctx = new RefreshCommandContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_refreshCommand);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(360);
			match(T__29);
			setState(361);
			match(ID);
			setState(365);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__30) {
				{
				setState(362);
				match(T__30);
				setState(363);
				match(INTEGER);
				setState(364);
				match(T__31);
				}
			}

			setState(367);
			match(STOP);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MoveCommandContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(aglParser.ID, 0); }
		public PointContext point() {
			return getRuleContext(PointContext.class,0);
		}
		public TerminalNode STOP() { return getToken(aglParser.STOP, 0); }
		public MoveCommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_moveCommand; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof aglListener ) ((aglListener)listener).enterMoveCommand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof aglListener ) ((aglListener)listener).exitMoveCommand(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof aglVisitor ) return ((aglVisitor<? extends T>)visitor).visitMoveCommand(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MoveCommandContext moveCommand() throws RecognitionException {
		MoveCommandContext _localctx = new MoveCommandContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_moveCommand);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(369);
			match(T__32);
			setState(370);
			match(ID);
			setState(371);
			match(T__33);
			setState(372);
			point();
			setState(373);
			match(STOP);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PropertyValueContext extends ParserRuleContext {
		public TerminalNode INTEGER() { return getToken(aglParser.INTEGER, 0); }
		public TerminalNode NUMBER() { return getToken(aglParser.NUMBER, 0); }
		public TerminalNode ColorID() { return getToken(aglParser.ColorID, 0); }
		public TerminalNode BOOLEAN() { return getToken(aglParser.BOOLEAN, 0); }
		public TerminalNode STRING() { return getToken(aglParser.STRING, 0); }
		public PointContext point() {
			return getRuleContext(PointContext.class,0);
		}
		public PropertyValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propertyValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof aglListener ) ((aglListener)listener).enterPropertyValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof aglListener ) ((aglListener)listener).exitPropertyValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof aglVisitor ) return ((aglVisitor<? extends T>)visitor).visitPropertyValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropertyValueContext propertyValue() throws RecognitionException {
		PropertyValueContext _localctx = new PropertyValueContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_propertyValue);
		try {
			setState(381);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTEGER:
				enterOuterAlt(_localctx, 1);
				{
				setState(375);
				match(INTEGER);
				}
				break;
			case NUMBER:
				enterOuterAlt(_localctx, 2);
				{
				setState(376);
				match(NUMBER);
				}
				break;
			case ColorID:
				enterOuterAlt(_localctx, 3);
				{
				setState(377);
				match(ColorID);
				}
				break;
			case BOOLEAN:
				enterOuterAlt(_localctx, 4);
				{
				setState(378);
				match(BOOLEAN);
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 5);
				{
				setState(379);
				match(STRING);
				}
				break;
			case T__0:
			case ID:
				enterOuterAlt(_localctx, 6);
				{
				setState(380);
				point();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PropertyListContext extends ParserRuleContext {
		public List<PropertyAssignmentContext> propertyAssignment() {
			return getRuleContexts(PropertyAssignmentContext.class);
		}
		public PropertyAssignmentContext propertyAssignment(int i) {
			return getRuleContext(PropertyAssignmentContext.class,i);
		}
		public PropertyListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propertyList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof aglListener ) ((aglListener)listener).enterPropertyList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof aglListener ) ((aglListener)listener).exitPropertyList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof aglVisitor ) return ((aglVisitor<? extends T>)visitor).visitPropertyList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropertyListContext propertyList() throws RecognitionException {
		PropertyListContext _localctx = new PropertyListContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_propertyList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(384); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(383);
				propertyAssignment();
				}
				}
				setState(386); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==PropertyID || _la==ID );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionContext extends ParserRuleContext {
		public PrimaryExprContext primaryExpr() {
			return getRuleContext(PrimaryExprContext.class,0);
		}
		public ArithmeticExprContext arithmeticExpr() {
			return getRuleContext(ArithmeticExprContext.class,0);
		}
		public BooleanExprContext booleanExpr() {
			return getRuleContext(BooleanExprContext.class,0);
		}
		public VectorContext vector() {
			return getRuleContext(VectorContext.class,0);
		}
		public StringExprContext stringExpr() {
			return getRuleContext(StringExprContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof aglListener ) ((aglListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof aglListener ) ((aglListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof aglVisitor ) return ((aglVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_expression);
		try {
			setState(393);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(388);
				primaryExpr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(389);
				arithmeticExpr(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(390);
				booleanExpr(0);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(391);
				vector();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(392);
				stringExpr();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PrimaryExprContext extends ParserRuleContext {
		public TerminalNode INTEGER() { return getToken(aglParser.INTEGER, 0); }
		public TerminalNode NUMBER() { return getToken(aglParser.NUMBER, 0); }
		public TerminalNode ID() { return getToken(aglParser.ID, 0); }
		public TerminalNode ModelID() { return getToken(aglParser.ModelID, 0); }
		public ListElementAccessContext listElementAccess() {
			return getRuleContext(ListElementAccessContext.class,0);
		}
		public PrimaryExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof aglListener ) ((aglListener)listener).enterPrimaryExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof aglListener ) ((aglListener)listener).exitPrimaryExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof aglVisitor ) return ((aglVisitor<? extends T>)visitor).visitPrimaryExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryExprContext primaryExpr() throws RecognitionException {
		PrimaryExprContext _localctx = new PrimaryExprContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_primaryExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(396);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__34) {
				{
				setState(395);
				match(T__34);
				}
			}

			setState(403);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				{
				setState(398);
				match(INTEGER);
				}
				break;
			case 2:
				{
				setState(399);
				match(NUMBER);
				}
				break;
			case 3:
				{
				setState(400);
				match(ID);
				}
				break;
			case 4:
				{
				setState(401);
				match(ModelID);
				}
				break;
			case 5:
				{
				setState(402);
				listElementAccess();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ArithmeticExprContext extends ParserRuleContext {
		public PrimaryExprContext primaryExpr() {
			return getRuleContext(PrimaryExprContext.class,0);
		}
		public ArithmeticExprContext arithmeticExpr() {
			return getRuleContext(ArithmeticExprContext.class,0);
		}
		public ArithmeticExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arithmeticExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof aglListener ) ((aglListener)listener).enterArithmeticExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof aglListener ) ((aglListener)listener).exitArithmeticExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof aglVisitor ) return ((aglVisitor<? extends T>)visitor).visitArithmeticExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArithmeticExprContext arithmeticExpr() throws RecognitionException {
		return arithmeticExpr(0);
	}

	private ArithmeticExprContext arithmeticExpr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ArithmeticExprContext _localctx = new ArithmeticExprContext(_ctx, _parentState);
		ArithmeticExprContext _prevctx = _localctx;
		int _startState = 68;
		enterRecursionRule(_localctx, 68, RULE_arithmeticExpr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(406);
			primaryExpr();
			}
			_ctx.stop = _input.LT(-1);
			setState(413);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ArithmeticExprContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_arithmeticExpr);
					setState(408);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(409);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 515396075520L) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(410);
					primaryExpr();
					}
					} 
				}
				setState(415);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BooleanExprContext extends ParserRuleContext {
		public TerminalNode BOOLEAN() { return getToken(aglParser.BOOLEAN, 0); }
		public TerminalNode ID() { return getToken(aglParser.ID, 0); }
		public ComparisonOperatorContext comparisonOperator() {
			return getRuleContext(ComparisonOperatorContext.class,0);
		}
		public PrimaryExprContext primaryExpr() {
			return getRuleContext(PrimaryExprContext.class,0);
		}
		public List<BooleanExprContext> booleanExpr() {
			return getRuleContexts(BooleanExprContext.class);
		}
		public BooleanExprContext booleanExpr(int i) {
			return getRuleContext(BooleanExprContext.class,i);
		}
		public BooleanExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof aglListener ) ((aglListener)listener).enterBooleanExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof aglListener ) ((aglListener)listener).exitBooleanExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof aglVisitor ) return ((aglVisitor<? extends T>)visitor).visitBooleanExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BooleanExprContext booleanExpr() throws RecognitionException {
		return booleanExpr(0);
	}

	private BooleanExprContext booleanExpr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		BooleanExprContext _localctx = new BooleanExprContext(_ctx, _parentState);
		BooleanExprContext _prevctx = _localctx;
		int _startState = 70;
		enterRecursionRule(_localctx, 70, RULE_booleanExpr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(427);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				{
				setState(417);
				match(BOOLEAN);
				}
				break;
			case 2:
				{
				setState(418);
				match(ID);
				setState(419);
				comparisonOperator();
				setState(422);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__34:
				case ID:
				case INTEGER:
				case NUMBER:
				case ModelID:
					{
					setState(420);
					primaryExpr();
					}
					break;
				case BOOLEAN:
					{
					setState(421);
					match(BOOLEAN);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 3:
				{
				setState(424);
				match(ID);
				}
				break;
			case 4:
				{
				setState(425);
				match(T__38);
				setState(426);
				booleanExpr(3);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(438);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(436);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
					case 1:
						{
						_localctx = new BooleanExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_booleanExpr);
						setState(429);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(430);
						_la = _input.LA(1);
						if ( !(_la==T__39 || _la==T__40) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(431);
						booleanExpr(2);
						}
						break;
					case 2:
						{
						_localctx = new BooleanExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_booleanExpr);
						setState(432);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(433);
						comparisonOperator();
						setState(434);
						primaryExpr();
						}
						break;
					}
					} 
				}
				setState(440);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StringExprContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(aglParser.STRING, 0); }
		public StringExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof aglListener ) ((aglListener)listener).enterStringExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof aglListener ) ((aglListener)listener).exitStringExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof aglVisitor ) return ((aglVisitor<? extends T>)visitor).visitStringExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringExprContext stringExpr() throws RecognitionException {
		StringExprContext _localctx = new StringExprContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_stringExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(441);
			match(STRING);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ComparisonOperatorContext extends ParserRuleContext {
		public ComparisonOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparisonOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof aglListener ) ((aglListener)listener).enterComparisonOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof aglListener ) ((aglListener)listener).exitComparisonOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof aglVisitor ) return ((aglVisitor<? extends T>)visitor).visitComparisonOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComparisonOperatorContext comparisonOperator() throws RecognitionException {
		ComparisonOperatorContext _localctx = new ComparisonOperatorContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_comparisonOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(443);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 65970747998208L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TypeContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof aglListener ) ((aglListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof aglListener ) ((aglListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof aglVisitor ) return ((aglVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_type);
		try {
			setState(458);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__45:
				enterOuterAlt(_localctx, 1);
				{
				setState(445);
				match(T__45);
				}
				break;
			case T__46:
				enterOuterAlt(_localctx, 2);
				{
				setState(446);
				match(T__46);
				}
				break;
			case T__47:
				enterOuterAlt(_localctx, 3);
				{
				setState(447);
				match(T__47);
				}
				break;
			case T__48:
				enterOuterAlt(_localctx, 4);
				{
				setState(448);
				match(T__48);
				}
				break;
			case T__49:
				enterOuterAlt(_localctx, 5);
				{
				setState(449);
				match(T__49);
				}
				break;
			case T__50:
				enterOuterAlt(_localctx, 6);
				{
				setState(450);
				match(T__50);
				}
				break;
			case T__51:
				enterOuterAlt(_localctx, 7);
				{
				setState(451);
				match(T__51);
				}
				break;
			case T__22:
				enterOuterAlt(_localctx, 8);
				{
				setState(452);
				match(T__22);
				setState(453);
				match(T__23);
				setState(454);
				type();
				setState(455);
				match(T__24);
				}
				break;
			case T__52:
				enterOuterAlt(_localctx, 9);
				{
				setState(457);
				match(T__52);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ScriptDeclarationContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(aglParser.ID, 0); }
		public ScriptSourceContext scriptSource() {
			return getRuleContext(ScriptSourceContext.class,0);
		}
		public TerminalNode STOP() { return getToken(aglParser.STOP, 0); }
		public ScriptDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scriptDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof aglListener ) ((aglListener)listener).enterScriptDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof aglListener ) ((aglListener)listener).exitScriptDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof aglVisitor ) return ((aglVisitor<? extends T>)visitor).visitScriptDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ScriptDeclarationContext scriptDeclaration() throws RecognitionException {
		ScriptDeclarationContext _localctx = new ScriptDeclarationContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_scriptDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(460);
			match(ID);
			setState(461);
			match(T__3);
			setState(462);
			match(T__52);
			setState(463);
			match(T__7);
			setState(464);
			scriptSource();
			setState(465);
			match(STOP);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ScriptSourceContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(aglParser.STRING, 0); }
		public ScriptSourceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scriptSource; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof aglListener ) ((aglListener)listener).enterScriptSource(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof aglListener ) ((aglListener)listener).exitScriptSource(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof aglVisitor ) return ((aglVisitor<? extends T>)visitor).visitScriptSource(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ScriptSourceContext scriptSource() throws RecognitionException {
		ScriptSourceContext _localctx = new ScriptSourceContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_scriptSource);
		try {
			setState(471);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__53:
				enterOuterAlt(_localctx, 1);
				{
				setState(467);
				match(T__53);
				setState(468);
				match(STRING);
				}
				break;
			case T__54:
				enterOuterAlt(_localctx, 2);
				{
				setState(469);
				match(T__54);
				setState(470);
				match(STRING);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PlayCommandContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(aglParser.ID, 0); }
		public List<ScriptAssignmentContext> scriptAssignment() {
			return getRuleContexts(ScriptAssignmentContext.class);
		}
		public ScriptAssignmentContext scriptAssignment(int i) {
			return getRuleContext(ScriptAssignmentContext.class,i);
		}
		public PlayCommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_playCommand; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof aglListener ) ((aglListener)listener).enterPlayCommand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof aglListener ) ((aglListener)listener).exitPlayCommand(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof aglVisitor ) return ((aglVisitor<? extends T>)visitor).visitPlayCommand(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PlayCommandContext playCommand() throws RecognitionException {
		PlayCommandContext _localctx = new PlayCommandContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_playCommand);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(473);
			match(T__55);
			setState(474);
			match(ID);
			setState(475);
			match(T__16);
			setState(476);
			match(T__12);
			setState(478); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(477);
				scriptAssignment();
				}
				}
				setState(480); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==ID );
			setState(482);
			match(T__13);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ScriptAssignmentContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(aglParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(aglParser.ID, i);
		}
		public TerminalNode STOP() { return getToken(aglParser.STOP, 0); }
		public ScriptAssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scriptAssignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof aglListener ) ((aglListener)listener).enterScriptAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof aglListener ) ((aglListener)listener).exitScriptAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof aglVisitor ) return ((aglVisitor<? extends T>)visitor).visitScriptAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ScriptAssignmentContext scriptAssignment() throws RecognitionException {
		ScriptAssignmentContext _localctx = new ScriptAssignmentContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_scriptAssignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(484);
			match(ID);
			setState(485);
			match(T__7);
			setState(486);
			match(ID);
			setState(487);
			match(STOP);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ModelDeclarationContext extends ParserRuleContext {
		public TerminalNode ModelID() { return getToken(aglParser.ModelID, 0); }
		public ModelBodyContext modelBody() {
			return getRuleContext(ModelBodyContext.class,0);
		}
		public ModelDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modelDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof aglListener ) ((aglListener)listener).enterModelDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof aglListener ) ((aglListener)listener).exitModelDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof aglVisitor ) return ((aglVisitor<? extends T>)visitor).visitModelDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ModelDeclarationContext modelDeclaration() throws RecognitionException {
		ModelDeclarationContext _localctx = new ModelDeclarationContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_modelDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(489);
			match(ModelID);
			setState(490);
			match(T__56);
			setState(491);
			match(T__57);
			setState(492);
			match(T__12);
			setState(493);
			modelBody();
			setState(494);
			match(T__13);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ModelBodyContext extends ParserRuleContext {
		public List<ModelElementContext> modelElement() {
			return getRuleContexts(ModelElementContext.class);
		}
		public ModelElementContext modelElement(int i) {
			return getRuleContext(ModelElementContext.class,i);
		}
		public ModelBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modelBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof aglListener ) ((aglListener)listener).enterModelBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof aglListener ) ((aglListener)listener).exitModelBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof aglVisitor ) return ((aglVisitor<? extends T>)visitor).visitModelBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ModelBodyContext modelBody() throws RecognitionException {
		ModelBodyContext _localctx = new ModelBodyContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_modelBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(499);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 60)) & ~0x3f) == 0 && ((1L << (_la - 60)) & 145L) != 0)) {
				{
				{
				setState(496);
				modelElement();
				}
				}
				setState(501);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ModelElementContext extends ParserRuleContext {
		public VariableDeclarationContext variableDeclaration() {
			return getRuleContext(VariableDeclarationContext.class,0);
		}
		public ObjectInstantiationContext objectInstantiation() {
			return getRuleContext(ObjectInstantiationContext.class,0);
		}
		public EnumDeclarationContext enumDeclaration() {
			return getRuleContext(EnumDeclarationContext.class,0);
		}
		public ActionOnEnumContext actionOnEnum() {
			return getRuleContext(ActionOnEnumContext.class,0);
		}
		public ModelElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modelElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof aglListener ) ((aglListener)listener).enterModelElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof aglListener ) ((aglListener)listener).exitModelElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof aglVisitor ) return ((aglVisitor<? extends T>)visitor).visitModelElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ModelElementContext modelElement() throws RecognitionException {
		ModelElementContext _localctx = new ModelElementContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_modelElement);
		try {
			setState(506);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(502);
				variableDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(503);
				objectInstantiation();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(504);
				enumDeclaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(505);
				actionOnEnum();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class EnumDeclarationContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(aglParser.ID, 0); }
		public EnumValuesContext enumValues() {
			return getRuleContext(EnumValuesContext.class,0);
		}
		public EnumDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof aglListener ) ((aglListener)listener).enterEnumDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof aglListener ) ((aglListener)listener).exitEnumDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof aglVisitor ) return ((aglVisitor<? extends T>)visitor).visitEnumDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumDeclarationContext enumDeclaration() throws RecognitionException {
		EnumDeclarationContext _localctx = new EnumDeclarationContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_enumDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(508);
			match(ID);
			setState(509);
			match(T__3);
			setState(510);
			match(T__58);
			setState(511);
			match(T__9);
			setState(512);
			match(T__12);
			setState(513);
			enumValues();
			setState(514);
			match(T__13);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class EnumValuesContext extends ParserRuleContext {
		public List<TerminalNode> ModelID() { return getTokens(aglParser.ModelID); }
		public TerminalNode ModelID(int i) {
			return getToken(aglParser.ModelID, i);
		}
		public EnumValuesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumValues; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof aglListener ) ((aglListener)listener).enterEnumValues(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof aglListener ) ((aglListener)listener).exitEnumValues(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof aglVisitor ) return ((aglVisitor<? extends T>)visitor).visitEnumValues(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumValuesContext enumValues() throws RecognitionException {
		EnumValuesContext _localctx = new EnumValuesContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_enumValues);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(516);
			match(ModelID);
			setState(521);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(517);
				match(T__2);
				setState(518);
				match(ModelID);
				}
				}
				setState(523);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ActionOnEnumContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(aglParser.ID, 0); }
		public EnumActionBodyContext enumActionBody() {
			return getRuleContext(EnumActionBodyContext.class,0);
		}
		public ActionOnEnumContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_actionOnEnum; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof aglListener ) ((aglListener)listener).enterActionOnEnum(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof aglListener ) ((aglListener)listener).exitActionOnEnum(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof aglVisitor ) return ((aglVisitor<? extends T>)visitor).visitActionOnEnum(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ActionOnEnumContext actionOnEnum() throws RecognitionException {
		ActionOnEnumContext _localctx = new ActionOnEnumContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_actionOnEnum);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(524);
			match(T__59);
			setState(525);
			match(ID);
			setState(526);
			match(T__12);
			setState(527);
			enumActionBody();
			setState(528);
			match(T__13);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class EnumActionBodyContext extends ParserRuleContext {
		public List<EnumCaseContext> enumCase() {
			return getRuleContexts(EnumCaseContext.class);
		}
		public EnumCaseContext enumCase(int i) {
			return getRuleContext(EnumCaseContext.class,i);
		}
		public EnumActionBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumActionBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof aglListener ) ((aglListener)listener).enterEnumActionBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof aglListener ) ((aglListener)listener).exitEnumActionBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof aglVisitor ) return ((aglVisitor<? extends T>)visitor).visitEnumActionBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumActionBodyContext enumActionBody() throws RecognitionException {
		EnumActionBodyContext _localctx = new EnumActionBodyContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_enumActionBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(531); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(530);
				enumCase();
				}
				}
				setState(533); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__19 );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class EnumCaseContext extends ParserRuleContext {
		public ConditionalEnumStatementContext conditionalEnumStatement() {
			return getRuleContext(ConditionalEnumStatementContext.class,0);
		}
		public EnumCaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumCase; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof aglListener ) ((aglListener)listener).enterEnumCase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof aglListener ) ((aglListener)listener).exitEnumCase(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof aglVisitor ) return ((aglVisitor<? extends T>)visitor).visitEnumCase(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumCaseContext enumCase() throws RecognitionException {
		EnumCaseContext _localctx = new EnumCaseContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_enumCase);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(535);
			conditionalEnumStatement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ConditionalEnumStatementContext extends ParserRuleContext {
		public BooleanExprContext booleanExpr() {
			return getRuleContext(BooleanExprContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<ElseIfEnumClauseContext> elseIfEnumClause() {
			return getRuleContexts(ElseIfEnumClauseContext.class);
		}
		public ElseIfEnumClauseContext elseIfEnumClause(int i) {
			return getRuleContext(ElseIfEnumClauseContext.class,i);
		}
		public ElseEnumClauseContext elseEnumClause() {
			return getRuleContext(ElseEnumClauseContext.class,0);
		}
		public ConditionalEnumStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionalEnumStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof aglListener ) ((aglListener)listener).enterConditionalEnumStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof aglListener ) ((aglListener)listener).exitConditionalEnumStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof aglVisitor ) return ((aglVisitor<? extends T>)visitor).visitConditionalEnumStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionalEnumStatementContext conditionalEnumStatement() throws RecognitionException {
		ConditionalEnumStatementContext _localctx = new ConditionalEnumStatementContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_conditionalEnumStatement);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(537);
			match(T__19);
			setState(538);
			booleanExpr(0);
			setState(539);
			match(T__11);
			setState(541); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(540);
					statement();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(543); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(548);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,43,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(545);
					elseIfEnumClause();
					}
					} 
				}
				setState(550);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,43,_ctx);
			}
			setState(552);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
			case 1:
				{
				setState(551);
				elseEnumClause();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ElseIfEnumClauseContext extends ParserRuleContext {
		public BooleanExprContext booleanExpr() {
			return getRuleContext(BooleanExprContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ElseIfEnumClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseIfEnumClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof aglListener ) ((aglListener)listener).enterElseIfEnumClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof aglListener ) ((aglListener)listener).exitElseIfEnumClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof aglVisitor ) return ((aglVisitor<? extends T>)visitor).visitElseIfEnumClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElseIfEnumClauseContext elseIfEnumClause() throws RecognitionException {
		ElseIfEnumClauseContext _localctx = new ElseIfEnumClauseContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_elseIfEnumClause);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(554);
			match(T__20);
			setState(555);
			booleanExpr(0);
			setState(556);
			match(T__11);
			setState(558); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(557);
					statement();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(560); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,45,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ElseEnumClauseContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ElseEnumClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseEnumClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof aglListener ) ((aglListener)listener).enterElseEnumClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof aglListener ) ((aglListener)listener).exitElseEnumClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof aglVisitor ) return ((aglVisitor<? extends T>)visitor).visitElseEnumClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElseEnumClauseContext elseEnumClause() throws RecognitionException {
		ElseEnumClauseContext _localctx = new ElseEnumClauseContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_elseEnumClause);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(562);
			match(T__21);
			setState(563);
			match(T__11);
			setState(565); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(564);
					statement();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(567); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,46,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PropertyEnumAssignmentContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(aglParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(aglParser.ID, i);
		}
		public TerminalNode ModelID() { return getToken(aglParser.ModelID, 0); }
		public TerminalNode STOP() { return getToken(aglParser.STOP, 0); }
		public PropertyEnumAssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propertyEnumAssignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof aglListener ) ((aglListener)listener).enterPropertyEnumAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof aglListener ) ((aglListener)listener).exitPropertyEnumAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof aglVisitor ) return ((aglVisitor<? extends T>)visitor).visitPropertyEnumAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropertyEnumAssignmentContext propertyEnumAssignment() throws RecognitionException {
		PropertyEnumAssignmentContext _localctx = new PropertyEnumAssignmentContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_propertyEnumAssignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(569);
			match(ID);
			setState(570);
			match(T__17);
			setState(571);
			match(ID);
			setState(572);
			match(T__7);
			setState(573);
			match(ModelID);
			setState(574);
			match(STOP);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 34:
			return arithmeticExpr_sempred((ArithmeticExprContext)_localctx, predIndex);
		case 35:
			return booleanExpr_sempred((BooleanExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean arithmeticExpr_sempred(ArithmeticExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean booleanExpr_sempred(BooleanExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 1);
		case 2:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001J\u0241\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007\"\u0002"+
		"#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0002\'\u0007\'\u0002"+
		"(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007+\u0002,\u0007,\u0002"+
		"-\u0007-\u0002.\u0007.\u0002/\u0007/\u00020\u00070\u00021\u00071\u0002"+
		"2\u00072\u00023\u00073\u00024\u00074\u00025\u00075\u00026\u00076\u0001"+
		"\u0000\u0005\u0000p\b\u0000\n\u0000\f\u0000s\t\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0001\u0001\u0001\u0003\u0001y\b\u0001\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0003\u0002~\b\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003"+
		"\u0005\u008e\b\u0005\u0001\u0006\u0001\u0006\u0003\u0006\u0092\b\u0006"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007"+
		"\u00ab\b\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t"+
		"\u0001\t\u0001\t\u0001\t\u0001\t\u0003\t\u00b8\b\t\u0001\t\u0001\t\u0001"+
		"\t\u0003\t\u00bd\b\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0003\n\u00c8\b\n\u0003\n\u00ca\b\n\u0001\n\u0001\n"+
		"\u0001\n\u0004\n\u00cf\b\n\u000b\n\f\n\u00d0\u0001\n\u0001\n\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0004\u000b\u00da\b\u000b"+
		"\u000b\u000b\f\u000b\u00db\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r\u0003\r\u00e9\b\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001"+
		"\u000f\u0003\u000f\u00fa\b\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0003"+
		"\u0010\u0105\b\u0010\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0003\u0012\u0112\b\u0012\u0001\u0012\u0001\u0012\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0004\u0013\u011a\b\u0013\u000b\u0013\f"+
		"\u0013\u011b\u0001\u0013\u0001\u0013\u0005\u0013\u0120\b\u0013\n\u0013"+
		"\f\u0013\u0123\t\u0013\u0001\u0013\u0003\u0013\u0126\b\u0013\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0004\u0014\u012c\b\u0014\u000b\u0014"+
		"\f\u0014\u012d\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0004\u0015\u0135\b\u0015\u000b\u0015\f\u0015\u0136\u0001\u0015\u0001"+
		"\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0005"+
		"\u0016\u0146\b\u0016\n\u0016\f\u0016\u0149\t\u0016\u0003\u0016\u014b\b"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0001"+
		"\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0019\u0001"+
		"\u0019\u0001\u0019\u0001\u0019\u0003\u0019\u0161\b\u0019\u0001\u001a\u0001"+
		"\u001a\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001c\u0001"+
		"\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0003\u001c\u016e\b\u001c\u0001"+
		"\u001c\u0001\u001c\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001"+
		"\u001d\u0001\u001d\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001"+
		"\u001e\u0001\u001e\u0003\u001e\u017e\b\u001e\u0001\u001f\u0004\u001f\u0181"+
		"\b\u001f\u000b\u001f\f\u001f\u0182\u0001 \u0001 \u0001 \u0001 \u0001 "+
		"\u0003 \u018a\b \u0001!\u0003!\u018d\b!\u0001!\u0001!\u0001!\u0001!\u0001"+
		"!\u0003!\u0194\b!\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0005"+
		"\"\u019c\b\"\n\"\f\"\u019f\t\"\u0001#\u0001#\u0001#\u0001#\u0001#\u0001"+
		"#\u0003#\u01a7\b#\u0001#\u0001#\u0001#\u0003#\u01ac\b#\u0001#\u0001#\u0001"+
		"#\u0001#\u0001#\u0001#\u0001#\u0005#\u01b5\b#\n#\f#\u01b8\t#\u0001$\u0001"+
		"$\u0001%\u0001%\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001"+
		"&\u0001&\u0001&\u0001&\u0001&\u0001&\u0003&\u01cb\b&\u0001\'\u0001\'\u0001"+
		"\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001(\u0001(\u0001(\u0001(\u0003("+
		"\u01d8\b(\u0001)\u0001)\u0001)\u0001)\u0001)\u0004)\u01df\b)\u000b)\f"+
		")\u01e0\u0001)\u0001)\u0001*\u0001*\u0001*\u0001*\u0001*\u0001+\u0001"+
		"+\u0001+\u0001+\u0001+\u0001+\u0001+\u0001,\u0005,\u01f2\b,\n,\f,\u01f5"+
		"\t,\u0001-\u0001-\u0001-\u0001-\u0003-\u01fb\b-\u0001.\u0001.\u0001.\u0001"+
		".\u0001.\u0001.\u0001.\u0001.\u0001/\u0001/\u0001/\u0005/\u0208\b/\n/"+
		"\f/\u020b\t/\u00010\u00010\u00010\u00010\u00010\u00010\u00011\u00041\u0214"+
		"\b1\u000b1\f1\u0215\u00012\u00012\u00013\u00013\u00013\u00013\u00043\u021e"+
		"\b3\u000b3\f3\u021f\u00013\u00053\u0223\b3\n3\f3\u0226\t3\u00013\u0003"+
		"3\u0229\b3\u00014\u00014\u00014\u00014\u00044\u022f\b4\u000b4\f4\u0230"+
		"\u00015\u00015\u00015\u00045\u0236\b5\u000b5\f5\u0237\u00016\u00016\u0001"+
		"6\u00016\u00016\u00016\u00016\u00016\u0000\u0002DF7\u0000\u0002\u0004"+
		"\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \""+
		"$&(*,.02468:<>@BDFHJLNPRTVXZ\\^`bdfhjl\u0000\u0004\u0001\u0000\u0005\u0006"+
		"\u0001\u0000#&\u0001\u0000()\u0002\u0000\u0018\u0019*-\u0265\u0000q\u0001"+
		"\u0000\u0000\u0000\u0002x\u0001\u0000\u0000\u0000\u0004z\u0001\u0000\u0000"+
		"\u0000\u0006\u0081\u0001\u0000\u0000\u0000\b\u0085\u0001\u0000\u0000\u0000"+
		"\n\u008d\u0001\u0000\u0000\u0000\f\u0091\u0001\u0000\u0000\u0000\u000e"+
		"\u00aa\u0001\u0000\u0000\u0000\u0010\u00ac\u0001\u0000\u0000\u0000\u0012"+
		"\u00b1\u0001\u0000\u0000\u0000\u0014\u00be\u0001\u0000\u0000\u0000\u0016"+
		"\u00d4\u0001\u0000\u0000\u0000\u0018\u00df\u0001\u0000\u0000\u0000\u001a"+
		"\u00e4\u0001\u0000\u0000\u0000\u001c\u00f0\u0001\u0000\u0000\u0000\u001e"+
		"\u00f9\u0001\u0000\u0000\u0000 \u0100\u0001\u0000\u0000\u0000\"\u0108"+
		"\u0001\u0000\u0000\u0000$\u010d\u0001\u0000\u0000\u0000&\u0115\u0001\u0000"+
		"\u0000\u0000(\u0127\u0001\u0000\u0000\u0000*\u0131\u0001\u0000\u0000\u0000"+
		",\u013a\u0001\u0000\u0000\u0000.\u014f\u0001\u0000\u0000\u00000\u0157"+
		"\u0001\u0000\u0000\u00002\u0160\u0001\u0000\u0000\u00004\u0162\u0001\u0000"+
		"\u0000\u00006\u0164\u0001\u0000\u0000\u00008\u0168\u0001\u0000\u0000\u0000"+
		":\u0171\u0001\u0000\u0000\u0000<\u017d\u0001\u0000\u0000\u0000>\u0180"+
		"\u0001\u0000\u0000\u0000@\u0189\u0001\u0000\u0000\u0000B\u018c\u0001\u0000"+
		"\u0000\u0000D\u0195\u0001\u0000\u0000\u0000F\u01ab\u0001\u0000\u0000\u0000"+
		"H\u01b9\u0001\u0000\u0000\u0000J\u01bb\u0001\u0000\u0000\u0000L\u01ca"+
		"\u0001\u0000\u0000\u0000N\u01cc\u0001\u0000\u0000\u0000P\u01d7\u0001\u0000"+
		"\u0000\u0000R\u01d9\u0001\u0000\u0000\u0000T\u01e4\u0001\u0000\u0000\u0000"+
		"V\u01e9\u0001\u0000\u0000\u0000X\u01f3\u0001\u0000\u0000\u0000Z\u01fa"+
		"\u0001\u0000\u0000\u0000\\\u01fc\u0001\u0000\u0000\u0000^\u0204\u0001"+
		"\u0000\u0000\u0000`\u020c\u0001\u0000\u0000\u0000b\u0213\u0001\u0000\u0000"+
		"\u0000d\u0217\u0001\u0000\u0000\u0000f\u0219\u0001\u0000\u0000\u0000h"+
		"\u022a\u0001\u0000\u0000\u0000j\u0232\u0001\u0000\u0000\u0000l\u0239\u0001"+
		"\u0000\u0000\u0000np\u0003\u000e\u0007\u0000on\u0001\u0000\u0000\u0000"+
		"ps\u0001\u0000\u0000\u0000qo\u0001\u0000\u0000\u0000qr\u0001\u0000\u0000"+
		"\u0000rt\u0001\u0000\u0000\u0000sq\u0001\u0000\u0000\u0000tu\u0005\u0000"+
		"\u0000\u0001u\u0001\u0001\u0000\u0000\u0000vy\u0003\u0004\u0002\u0000"+
		"wy\u0005C\u0000\u0000xv\u0001\u0000\u0000\u0000xw\u0001\u0000\u0000\u0000"+
		"y\u0003\u0001\u0000\u0000\u0000z}\u0005\u0001\u0000\u0000{~\u0003\b\u0004"+
		"\u0000|~\u0003\u0006\u0003\u0000}{\u0001\u0000\u0000\u0000}|\u0001\u0000"+
		"\u0000\u0000~\u007f\u0001\u0000\u0000\u0000\u007f\u0080\u0005\u0002\u0000"+
		"\u0000\u0080\u0005\u0001\u0000\u0000\u0000\u0081\u0082\u0003B!\u0000\u0082"+
		"\u0083\u0005\u0003\u0000\u0000\u0083\u0084\u0003B!\u0000\u0084\u0007\u0001"+
		"\u0000\u0000\u0000\u0085\u0086\u0003\n\u0005\u0000\u0086\u0087\u0005\u0004"+
		"\u0000\u0000\u0087\u0088\u0003\f\u0006\u0000\u0088\t\u0001\u0000\u0000"+
		"\u0000\u0089\u008a\u0003B!\u0000\u008a\u008b\u0007\u0000\u0000\u0000\u008b"+
		"\u008e\u0001\u0000\u0000\u0000\u008c\u008e\u0005C\u0000\u0000\u008d\u0089"+
		"\u0001\u0000\u0000\u0000\u008d\u008c\u0001\u0000\u0000\u0000\u008e\u000b"+
		"\u0001\u0000\u0000\u0000\u008f\u0092\u0003B!\u0000\u0090\u0092\u0005C"+
		"\u0000\u0000\u0091\u008f\u0001\u0000\u0000\u0000\u0091\u0090\u0001\u0000"+
		"\u0000\u0000\u0092\r\u0001\u0000\u0000\u0000\u0093\u00ab\u0003\u0010\b"+
		"\u0000\u0094\u00ab\u0003\u0014\n\u0000\u0095\u00ab\u0003\u0012\t\u0000"+
		"\u0096\u00ab\u0003\u0018\f\u0000\u0097\u00ab\u0003\u001c\u000e\u0000\u0098"+
		"\u00ab\u0003\u001e\u000f\u0000\u0099\u00ab\u0003l6\u0000\u009a\u00ab\u0003"+
		" \u0010\u0000\u009b\u00ab\u0003\u001a\r\u0000\u009c\u00ab\u0003\"\u0011"+
		"\u0000\u009d\u00ab\u00032\u0019\u0000\u009e\u00ab\u0003$\u0012\u0000\u009f"+
		"\u00ab\u0003&\u0013\u0000\u00a0\u00ab\u0003,\u0016\u0000\u00a1\u00ab\u0003"+
		".\u0017\u0000\u00a2\u00ab\u00030\u0018\u0000\u00a3\u00ab\u0003\u0016\u000b"+
		"\u0000\u00a4\u00ab\u0003N\'\u0000\u00a5\u00ab\u0003R)\u0000\u00a6\u00ab"+
		"\u0003V+\u0000\u00a7\u00ab\u0003\\.\u0000\u00a8\u00ab\u0003f3\u0000\u00a9"+
		"\u00ab\u0003`0\u0000\u00aa\u0093\u0001\u0000\u0000\u0000\u00aa\u0094\u0001"+
		"\u0000\u0000\u0000\u00aa\u0095\u0001\u0000\u0000\u0000\u00aa\u0096\u0001"+
		"\u0000\u0000\u0000\u00aa\u0097\u0001\u0000\u0000\u0000\u00aa\u0098\u0001"+
		"\u0000\u0000\u0000\u00aa\u0099\u0001\u0000\u0000\u0000\u00aa\u009a\u0001"+
		"\u0000\u0000\u0000\u00aa\u009b\u0001\u0000\u0000\u0000\u00aa\u009c\u0001"+
		"\u0000\u0000\u0000\u00aa\u009d\u0001\u0000\u0000\u0000\u00aa\u009e\u0001"+
		"\u0000\u0000\u0000\u00aa\u009f\u0001\u0000\u0000\u0000\u00aa\u00a0\u0001"+
		"\u0000\u0000\u0000\u00aa\u00a1\u0001\u0000\u0000\u0000\u00aa\u00a2\u0001"+
		"\u0000\u0000\u0000\u00aa\u00a3\u0001\u0000\u0000\u0000\u00aa\u00a4\u0001"+
		"\u0000\u0000\u0000\u00aa\u00a5\u0001\u0000\u0000\u0000\u00aa\u00a6\u0001"+
		"\u0000\u0000\u0000\u00aa\u00a7\u0001\u0000\u0000\u0000\u00aa\u00a8\u0001"+
		"\u0000\u0000\u0000\u00aa\u00a9\u0001\u0000\u0000\u0000\u00ab\u000f\u0001"+
		"\u0000\u0000\u0000\u00ac\u00ad\u0005C\u0000\u0000\u00ad\u00ae\u0005\u0004"+
		"\u0000\u0000\u00ae\u00af\u0005\u0007\u0000\u0000\u00af\u00b0\u0003\"\u0011"+
		"\u0000\u00b0\u0011\u0001\u0000\u0000\u0000\u00b1\u00b2\u0005C\u0000\u0000"+
		"\u00b2\u00bc\u0005\u0004\u0000\u0000\u00b3\u00b4\u0003L&\u0000\u00b4\u00b7"+
		"\u0005\b\u0000\u0000\u00b5\u00b8\u00034\u001a\u0000\u00b6\u00b8\u0003"+
		"@ \u0000\u00b7\u00b5\u0001\u0000\u0000\u0000\u00b7\u00b6\u0001\u0000\u0000"+
		"\u0000\u00b8\u00b9\u0001\u0000\u0000\u0000\u00b9\u00ba\u0005H\u0000\u0000"+
		"\u00ba\u00bd\u0001\u0000\u0000\u0000\u00bb\u00bd\u0003\u0018\f\u0000\u00bc"+
		"\u00b3\u0001\u0000\u0000\u0000\u00bc\u00bb\u0001\u0000\u0000\u0000\u00bd"+
		"\u0013\u0001\u0000\u0000\u0000\u00be\u00bf\u0005\t\u0000\u0000\u00bf\u00c0"+
		"\u0005C\u0000\u0000\u00c0\u00c9\u0005\n\u0000\u0000\u00c1\u00ca\u0005"+
		"C\u0000\u0000\u00c2\u00c3\u0005D\u0000\u0000\u00c3\u00c4\u0005\u000b\u0000"+
		"\u0000\u00c4\u00c7\u0005D\u0000\u0000\u00c5\u00c6\u0005\u000b\u0000\u0000"+
		"\u00c6\u00c8\u0005D\u0000\u0000\u00c7\u00c5\u0001\u0000\u0000\u0000\u00c7"+
		"\u00c8\u0001\u0000\u0000\u0000\u00c8\u00ca\u0001\u0000\u0000\u0000\u00c9"+
		"\u00c1\u0001\u0000\u0000\u0000\u00c9\u00c2\u0001\u0000\u0000\u0000\u00ca"+
		"\u00cb\u0001\u0000\u0000\u0000\u00cb\u00cc\u0005\f\u0000\u0000\u00cc\u00ce"+
		"\u0005\r\u0000\u0000\u00cd\u00cf\u0003\u000e\u0007\u0000\u00ce\u00cd\u0001"+
		"\u0000\u0000\u0000\u00cf\u00d0\u0001\u0000\u0000\u0000\u00d0\u00ce\u0001"+
		"\u0000\u0000\u0000\u00d0\u00d1\u0001\u0000\u0000\u0000\u00d1\u00d2\u0001"+
		"\u0000\u0000\u0000\u00d2\u00d3\u0005\u000e\u0000\u0000\u00d3\u0015\u0001"+
		"\u0000\u0000\u0000\u00d4\u00d5\u0005\u000f\u0000\u0000\u00d5\u00d6\u0003"+
		"F#\u0000\u00d6\u00d7\u0005\f\u0000\u0000\u00d7\u00d9\u0005\r\u0000\u0000"+
		"\u00d8\u00da\u0003\u000e\u0007\u0000\u00d9\u00d8\u0001\u0000\u0000\u0000"+
		"\u00da\u00db\u0001\u0000\u0000\u0000\u00db\u00d9\u0001\u0000\u0000\u0000"+
		"\u00db\u00dc\u0001\u0000\u0000\u0000\u00dc\u00dd\u0001\u0000\u0000\u0000"+
		"\u00dd\u00de\u0005\u000e\u0000\u0000\u00de\u0017\u0001\u0000\u0000\u0000"+
		"\u00df\u00e0\u0005@\u0000\u0000\u00e0\u00e1\u0005\u0010\u0000\u0000\u00e1"+
		"\u00e2\u0003\u0002\u0001\u0000\u00e2\u00e3\u0003\"\u0011\u0000\u00e3\u0019"+
		"\u0001\u0000\u0000\u0000\u00e4\u00e5\u0005\u0011\u0000\u0000\u00e5\u00e8"+
		"\u0005C\u0000\u0000\u00e6\u00e7\u0005\u0012\u0000\u0000\u00e7\u00e9\u0005"+
		"C\u0000\u0000\u00e8\u00e6\u0001\u0000\u0000\u0000\u00e8\u00e9\u0001\u0000"+
		"\u0000\u0000\u00e9\u00ea\u0001\u0000\u0000\u0000\u00ea\u00eb\u0005\f\u0000"+
		"\u0000\u00eb\u00ec\u0001\u0000\u0000\u0000\u00ec\u00ed\u0005\r\u0000\u0000"+
		"\u00ed\u00ee\u0003>\u001f\u0000\u00ee\u00ef\u0005\u000e\u0000\u0000\u00ef"+
		"\u001b\u0001\u0000\u0000\u0000\u00f0\u00f1\u0005C\u0000\u0000\u00f1\u00f2"+
		"\u0005\u0004\u0000\u0000\u00f2\u00f3\u0005I\u0000\u0000\u00f3\u00f4\u0005"+
		"\u0010\u0000\u0000\u00f4\u00f5\u0003\u0002\u0001\u0000\u00f5\u00f6\u0005"+
		"H\u0000\u0000\u00f6\u001d\u0001\u0000\u0000\u0000\u00f7\u00f8\u0005C\u0000"+
		"\u0000\u00f8\u00fa\u0005\u0012\u0000\u0000\u00f9\u00f7\u0001\u0000\u0000"+
		"\u0000\u00f9\u00fa\u0001\u0000\u0000\u0000\u00fa\u00fb\u0001\u0000\u0000"+
		"\u0000\u00fb\u00fc\u0005B\u0000\u0000\u00fc\u00fd\u0005\b\u0000\u0000"+
		"\u00fd\u00fe\u0003<\u001e\u0000\u00fe\u00ff\u0005H\u0000\u0000\u00ff\u001f"+
		"\u0001\u0000\u0000\u0000\u0100\u0101\u0005C\u0000\u0000\u0101\u0104\u0005"+
		"\b\u0000\u0000\u0102\u0105\u00034\u001a\u0000\u0103\u0105\u0003@ \u0000"+
		"\u0104\u0102\u0001\u0000\u0000\u0000\u0104\u0103\u0001\u0000\u0000\u0000"+
		"\u0105\u0106\u0001\u0000\u0000\u0000\u0106\u0107\u0005H\u0000\u0000\u0107"+
		"!\u0001\u0000\u0000\u0000\u0108\u0109\u0005\u0011\u0000\u0000\u0109\u010a"+
		"\u0005\r\u0000\u0000\u010a\u010b\u0003>\u001f\u0000\u010b\u010c\u0005"+
		"\u000e\u0000\u0000\u010c#\u0001\u0000\u0000\u0000\u010d\u0111\u0005\u0013"+
		"\u0000\u0000\u010e\u0112\u0005F\u0000\u0000\u010f\u0112\u0005C\u0000\u0000"+
		"\u0110\u0112\u00030\u0018\u0000\u0111\u010e\u0001\u0000\u0000\u0000\u0111"+
		"\u010f\u0001\u0000\u0000\u0000\u0111\u0110\u0001\u0000\u0000\u0000\u0112"+
		"\u0113\u0001\u0000\u0000\u0000\u0113\u0114\u0005H\u0000\u0000\u0114%\u0001"+
		"\u0000\u0000\u0000\u0115\u0116\u0005\u0014\u0000\u0000\u0116\u0117\u0003"+
		"F#\u0000\u0117\u0119\u0005\r\u0000\u0000\u0118\u011a\u0003\u000e\u0007"+
		"\u0000\u0119\u0118\u0001\u0000\u0000\u0000\u011a\u011b\u0001\u0000\u0000"+
		"\u0000\u011b\u0119\u0001\u0000\u0000\u0000\u011b\u011c\u0001\u0000\u0000"+
		"\u0000\u011c\u011d\u0001\u0000\u0000\u0000\u011d\u0121\u0005\u000e\u0000"+
		"\u0000\u011e\u0120\u0003(\u0014\u0000\u011f\u011e\u0001\u0000\u0000\u0000"+
		"\u0120\u0123\u0001\u0000\u0000\u0000\u0121\u011f\u0001\u0000\u0000\u0000"+
		"\u0121\u0122\u0001\u0000\u0000\u0000\u0122\u0125\u0001\u0000\u0000\u0000"+
		"\u0123\u0121\u0001\u0000\u0000\u0000\u0124\u0126\u0003*\u0015\u0000\u0125"+
		"\u0124\u0001\u0000\u0000\u0000\u0125\u0126\u0001\u0000\u0000\u0000\u0126"+
		"\'\u0001\u0000\u0000\u0000\u0127\u0128\u0005\u0015\u0000\u0000\u0128\u0129"+
		"\u0003F#\u0000\u0129\u012b\u0005\r\u0000\u0000\u012a\u012c\u0003\u000e"+
		"\u0007\u0000\u012b\u012a\u0001\u0000\u0000\u0000\u012c\u012d\u0001\u0000"+
		"\u0000\u0000\u012d\u012b\u0001\u0000\u0000\u0000\u012d\u012e\u0001\u0000"+
		"\u0000\u0000\u012e\u012f\u0001\u0000\u0000\u0000\u012f\u0130\u0005\u000e"+
		"\u0000\u0000\u0130)\u0001\u0000\u0000\u0000\u0131\u0132\u0005\u0016\u0000"+
		"\u0000\u0132\u0134\u0005\r\u0000\u0000\u0133\u0135\u0003\u000e\u0007\u0000"+
		"\u0134\u0133\u0001\u0000\u0000\u0000\u0135\u0136\u0001\u0000\u0000\u0000"+
		"\u0136\u0134\u0001\u0000\u0000\u0000\u0136\u0137\u0001\u0000\u0000\u0000"+
		"\u0137\u0138\u0001\u0000\u0000\u0000\u0138\u0139\u0005\u000e\u0000\u0000"+
		"\u0139+\u0001\u0000\u0000\u0000\u013a\u013b\u0005C\u0000\u0000\u013b\u013c"+
		"\u0005\u0004\u0000\u0000\u013c\u013d\u0005\u0017\u0000\u0000\u013d\u013e"+
		"\u0005\u0018\u0000\u0000\u013e\u013f\u0003L&\u0000\u013f\u0140\u0005\u0019"+
		"\u0000\u0000\u0140\u0141\u0005\b\u0000\u0000\u0141\u014a\u0005\u001a\u0000"+
		"\u0000\u0142\u0147\u0003@ \u0000\u0143\u0144\u0005\u0003\u0000\u0000\u0144"+
		"\u0146\u0003@ \u0000\u0145\u0143\u0001\u0000\u0000\u0000\u0146\u0149\u0001"+
		"\u0000\u0000\u0000\u0147\u0145\u0001\u0000\u0000\u0000\u0147\u0148\u0001"+
		"\u0000\u0000\u0000\u0148\u014b\u0001\u0000\u0000\u0000\u0149\u0147\u0001"+
		"\u0000\u0000\u0000\u014a\u0142\u0001\u0000\u0000\u0000\u014a\u014b\u0001"+
		"\u0000\u0000\u0000\u014b\u014c\u0001\u0000\u0000\u0000\u014c\u014d\u0005"+
		"\u001b\u0000\u0000\u014d\u014e\u0005H\u0000\u0000\u014e-\u0001\u0000\u0000"+
		"\u0000\u014f\u0150\u0005C\u0000\u0000\u0150\u0151\u0005\u001a\u0000\u0000"+
		"\u0151\u0152\u0003B!\u0000\u0152\u0153\u0005\u001b\u0000\u0000\u0153\u0154"+
		"\u0005\b\u0000\u0000\u0154\u0155\u0003@ \u0000\u0155\u0156\u0005H\u0000"+
		"\u0000\u0156/\u0001\u0000\u0000\u0000\u0157\u0158\u0005C\u0000\u0000\u0158"+
		"\u0159\u0005\u001a\u0000\u0000\u0159\u015a\u0003B!\u0000\u015a\u015b\u0005"+
		"\u001b\u0000\u0000\u015b1\u0001\u0000\u0000\u0000\u015c\u0161\u00034\u001a"+
		"\u0000\u015d\u0161\u00036\u001b\u0000\u015e\u0161\u00038\u001c\u0000\u015f"+
		"\u0161\u0003:\u001d\u0000\u0160\u015c\u0001\u0000\u0000\u0000\u0160\u015d"+
		"\u0001\u0000\u0000\u0000\u0160\u015e\u0001\u0000\u0000\u0000\u0160\u015f"+
		"\u0001\u0000\u0000\u0000\u01613\u0001\u0000\u0000\u0000\u0162\u0163\u0005"+
		"\u001c\u0000\u0000\u01635\u0001\u0000\u0000\u0000\u0164\u0165\u0005\u001d"+
		"\u0000\u0000\u0165\u0166\u0005C\u0000\u0000\u0166\u0167\u0005H\u0000\u0000"+
		"\u01677\u0001\u0000\u0000\u0000\u0168\u0169\u0005\u001e\u0000\u0000\u0169"+
		"\u016d\u0005C\u0000\u0000\u016a\u016b\u0005\u001f\u0000\u0000\u016b\u016c"+
		"\u0005D\u0000\u0000\u016c\u016e\u0005 \u0000\u0000\u016d\u016a\u0001\u0000"+
		"\u0000\u0000\u016d\u016e\u0001\u0000\u0000\u0000\u016e\u016f\u0001\u0000"+
		"\u0000\u0000\u016f\u0170\u0005H\u0000\u0000\u01709\u0001\u0000\u0000\u0000"+
		"\u0171\u0172\u0005!\u0000\u0000\u0172\u0173\u0005C\u0000\u0000\u0173\u0174"+
		"\u0005\"\u0000\u0000\u0174\u0175\u0003\u0002\u0001\u0000\u0175\u0176\u0005"+
		"H\u0000\u0000\u0176;\u0001\u0000\u0000\u0000\u0177\u017e\u0005D\u0000"+
		"\u0000\u0178\u017e\u0005E\u0000\u0000\u0179\u017e\u0005A\u0000\u0000\u017a"+
		"\u017e\u0005G\u0000\u0000\u017b\u017e\u0005F\u0000\u0000\u017c\u017e\u0003"+
		"\u0002\u0001\u0000\u017d\u0177\u0001\u0000\u0000\u0000\u017d\u0178\u0001"+
		"\u0000\u0000\u0000\u017d\u0179\u0001\u0000\u0000\u0000\u017d\u017a\u0001"+
		"\u0000\u0000\u0000\u017d\u017b\u0001\u0000\u0000\u0000\u017d\u017c\u0001"+
		"\u0000\u0000\u0000\u017e=\u0001\u0000\u0000\u0000\u017f\u0181\u0003\u001e"+
		"\u000f\u0000\u0180\u017f\u0001\u0000\u0000\u0000\u0181\u0182\u0001\u0000"+
		"\u0000\u0000\u0182\u0180\u0001\u0000\u0000\u0000\u0182\u0183\u0001\u0000"+
		"\u0000\u0000\u0183?\u0001\u0000\u0000\u0000\u0184\u018a\u0003B!\u0000"+
		"\u0185\u018a\u0003D\"\u0000\u0186\u018a\u0003F#\u0000\u0187\u018a\u0003"+
		"\u0004\u0002\u0000\u0188\u018a\u0003H$\u0000\u0189\u0184\u0001\u0000\u0000"+
		"\u0000\u0189\u0185\u0001\u0000\u0000\u0000\u0189\u0186\u0001\u0000\u0000"+
		"\u0000\u0189\u0187\u0001\u0000\u0000\u0000\u0189\u0188\u0001\u0000\u0000"+
		"\u0000\u018aA\u0001\u0000\u0000\u0000\u018b\u018d\u0005#\u0000\u0000\u018c"+
		"\u018b\u0001\u0000\u0000\u0000\u018c\u018d\u0001\u0000\u0000\u0000\u018d"+
		"\u0193\u0001\u0000\u0000\u0000\u018e\u0194\u0005D\u0000\u0000\u018f\u0194"+
		"\u0005E\u0000\u0000\u0190\u0194\u0005C\u0000\u0000\u0191\u0194\u0005I"+
		"\u0000\u0000\u0192\u0194\u00030\u0018\u0000\u0193\u018e\u0001\u0000\u0000"+
		"\u0000\u0193\u018f\u0001\u0000\u0000\u0000\u0193\u0190\u0001\u0000\u0000"+
		"\u0000\u0193\u0191\u0001\u0000\u0000\u0000\u0193\u0192\u0001\u0000\u0000"+
		"\u0000\u0194C\u0001\u0000\u0000\u0000\u0195\u0196\u0006\"\uffff\uffff"+
		"\u0000\u0196\u0197\u0003B!\u0000\u0197\u019d\u0001\u0000\u0000\u0000\u0198"+
		"\u0199\n\u0002\u0000\u0000\u0199\u019a\u0007\u0001\u0000\u0000\u019a\u019c"+
		"\u0003B!\u0000\u019b\u0198\u0001\u0000\u0000\u0000\u019c\u019f\u0001\u0000"+
		"\u0000\u0000\u019d\u019b\u0001\u0000\u0000\u0000\u019d\u019e\u0001\u0000"+
		"\u0000\u0000\u019eE\u0001\u0000\u0000\u0000\u019f\u019d\u0001\u0000\u0000"+
		"\u0000\u01a0\u01a1\u0006#\uffff\uffff\u0000\u01a1\u01ac\u0005G\u0000\u0000"+
		"\u01a2\u01a3\u0005C\u0000\u0000\u01a3\u01a6\u0003J%\u0000\u01a4\u01a7"+
		"\u0003B!\u0000\u01a5\u01a7\u0005G\u0000\u0000\u01a6\u01a4\u0001\u0000"+
		"\u0000\u0000\u01a6\u01a5\u0001\u0000\u0000\u0000\u01a7\u01ac\u0001\u0000"+
		"\u0000\u0000\u01a8\u01ac\u0005C\u0000\u0000\u01a9\u01aa\u0005\'\u0000"+
		"\u0000\u01aa\u01ac\u0003F#\u0003\u01ab\u01a0\u0001\u0000\u0000\u0000\u01ab"+
		"\u01a2\u0001\u0000\u0000\u0000\u01ab\u01a8\u0001\u0000\u0000\u0000\u01ab"+
		"\u01a9\u0001\u0000\u0000\u0000\u01ac\u01b6\u0001\u0000\u0000\u0000\u01ad"+
		"\u01ae\n\u0001\u0000\u0000\u01ae\u01af\u0007\u0002\u0000\u0000\u01af\u01b5"+
		"\u0003F#\u0002\u01b0\u01b1\n\u0002\u0000\u0000\u01b1\u01b2\u0003J%\u0000"+
		"\u01b2\u01b3\u0003B!\u0000\u01b3\u01b5\u0001\u0000\u0000\u0000\u01b4\u01ad"+
		"\u0001\u0000\u0000\u0000\u01b4\u01b0\u0001\u0000\u0000\u0000\u01b5\u01b8"+
		"\u0001\u0000\u0000\u0000\u01b6\u01b4\u0001\u0000\u0000\u0000\u01b6\u01b7"+
		"\u0001\u0000\u0000\u0000\u01b7G\u0001\u0000\u0000\u0000\u01b8\u01b6\u0001"+
		"\u0000\u0000\u0000\u01b9\u01ba\u0005F\u0000\u0000\u01baI\u0001\u0000\u0000"+
		"\u0000\u01bb\u01bc\u0007\u0003\u0000\u0000\u01bcK\u0001\u0000\u0000\u0000"+
		"\u01bd\u01cb\u0005.\u0000\u0000\u01be\u01cb\u0005/\u0000\u0000\u01bf\u01cb"+
		"\u00050\u0000\u0000\u01c0\u01cb\u00051\u0000\u0000\u01c1\u01cb\u00052"+
		"\u0000\u0000\u01c2\u01cb\u00053\u0000\u0000\u01c3\u01cb\u00054\u0000\u0000"+
		"\u01c4\u01c5\u0005\u0017\u0000\u0000\u01c5\u01c6\u0005\u0018\u0000\u0000"+
		"\u01c6\u01c7\u0003L&\u0000\u01c7\u01c8\u0005\u0019\u0000\u0000\u01c8\u01cb"+
		"\u0001\u0000\u0000\u0000\u01c9\u01cb\u00055\u0000\u0000\u01ca\u01bd\u0001"+
		"\u0000\u0000\u0000\u01ca\u01be\u0001\u0000\u0000\u0000\u01ca\u01bf\u0001"+
		"\u0000\u0000\u0000\u01ca\u01c0\u0001\u0000\u0000\u0000\u01ca\u01c1\u0001"+
		"\u0000\u0000\u0000\u01ca\u01c2\u0001\u0000\u0000\u0000\u01ca\u01c3\u0001"+
		"\u0000\u0000\u0000\u01ca\u01c4\u0001\u0000\u0000\u0000\u01ca\u01c9\u0001"+
		"\u0000\u0000\u0000\u01cbM\u0001\u0000\u0000\u0000\u01cc\u01cd\u0005C\u0000"+
		"\u0000\u01cd\u01ce\u0005\u0004\u0000\u0000\u01ce\u01cf\u00055\u0000\u0000"+
		"\u01cf\u01d0\u0005\b\u0000\u0000\u01d0\u01d1\u0003P(\u0000\u01d1\u01d2"+
		"\u0005H\u0000\u0000\u01d2O\u0001\u0000\u0000\u0000\u01d3\u01d4\u00056"+
		"\u0000\u0000\u01d4\u01d8\u0005F\u0000\u0000\u01d5\u01d6\u00057\u0000\u0000"+
		"\u01d6\u01d8\u0005F\u0000\u0000\u01d7\u01d3\u0001\u0000\u0000\u0000\u01d7"+
		"\u01d5\u0001\u0000\u0000\u0000\u01d8Q\u0001\u0000\u0000\u0000\u01d9\u01da"+
		"\u00058\u0000\u0000\u01da\u01db\u0005C\u0000\u0000\u01db\u01dc\u0005\u0011"+
		"\u0000\u0000\u01dc\u01de\u0005\r\u0000\u0000\u01dd\u01df\u0003T*\u0000"+
		"\u01de\u01dd\u0001\u0000\u0000\u0000\u01df\u01e0\u0001\u0000\u0000\u0000"+
		"\u01e0\u01de\u0001\u0000\u0000\u0000\u01e0\u01e1\u0001\u0000\u0000\u0000"+
		"\u01e1\u01e2\u0001\u0000\u0000\u0000\u01e2\u01e3\u0005\u000e\u0000\u0000"+
		"\u01e3S\u0001\u0000\u0000\u0000\u01e4\u01e5\u0005C\u0000\u0000\u01e5\u01e6"+
		"\u0005\b\u0000\u0000\u01e6\u01e7\u0005C\u0000\u0000\u01e7\u01e8\u0005"+
		"H\u0000\u0000\u01e8U\u0001\u0000\u0000\u0000\u01e9\u01ea\u0005I\u0000"+
		"\u0000\u01ea\u01eb\u00059\u0000\u0000\u01eb\u01ec\u0005:\u0000\u0000\u01ec"+
		"\u01ed\u0005\r\u0000\u0000\u01ed\u01ee\u0003X,\u0000\u01ee\u01ef\u0005"+
		"\u000e\u0000\u0000\u01efW\u0001\u0000\u0000\u0000\u01f0\u01f2\u0003Z-"+
		"\u0000\u01f1\u01f0\u0001\u0000\u0000\u0000\u01f2\u01f5\u0001\u0000\u0000"+
		"\u0000\u01f3\u01f1\u0001\u0000\u0000\u0000\u01f3\u01f4\u0001\u0000\u0000"+
		"\u0000\u01f4Y\u0001\u0000\u0000\u0000\u01f5\u01f3\u0001\u0000\u0000\u0000"+
		"\u01f6\u01fb\u0003\u0012\t\u0000\u01f7\u01fb\u0003\u0018\f\u0000\u01f8"+
		"\u01fb\u0003\\.\u0000\u01f9\u01fb\u0003`0\u0000\u01fa\u01f6\u0001\u0000"+
		"\u0000\u0000\u01fa\u01f7\u0001\u0000\u0000\u0000\u01fa\u01f8\u0001\u0000"+
		"\u0000\u0000\u01fa\u01f9\u0001\u0000\u0000\u0000\u01fb[\u0001\u0000\u0000"+
		"\u0000\u01fc\u01fd\u0005C\u0000\u0000\u01fd\u01fe\u0005\u0004\u0000\u0000"+
		"\u01fe\u01ff\u0005;\u0000\u0000\u01ff\u0200\u0005\n\u0000\u0000\u0200"+
		"\u0201\u0005\r\u0000\u0000\u0201\u0202\u0003^/\u0000\u0202\u0203\u0005"+
		"\u000e\u0000\u0000\u0203]\u0001\u0000\u0000\u0000\u0204\u0209\u0005I\u0000"+
		"\u0000\u0205\u0206\u0005\u0003\u0000\u0000\u0206\u0208\u0005I\u0000\u0000"+
		"\u0207\u0205\u0001\u0000\u0000\u0000\u0208\u020b\u0001\u0000\u0000\u0000"+
		"\u0209\u0207\u0001\u0000\u0000\u0000\u0209\u020a\u0001\u0000\u0000\u0000"+
		"\u020a_\u0001\u0000\u0000\u0000\u020b\u0209\u0001\u0000\u0000\u0000\u020c"+
		"\u020d\u0005<\u0000\u0000\u020d\u020e\u0005C\u0000\u0000\u020e\u020f\u0005"+
		"\r\u0000\u0000\u020f\u0210\u0003b1\u0000\u0210\u0211\u0005\u000e\u0000"+
		"\u0000\u0211a\u0001\u0000\u0000\u0000\u0212\u0214\u0003d2\u0000\u0213"+
		"\u0212\u0001\u0000\u0000\u0000\u0214\u0215\u0001\u0000\u0000\u0000\u0215"+
		"\u0213\u0001\u0000\u0000\u0000\u0215\u0216\u0001\u0000\u0000\u0000\u0216"+
		"c\u0001\u0000\u0000\u0000\u0217\u0218\u0003f3\u0000\u0218e\u0001\u0000"+
		"\u0000\u0000\u0219\u021a\u0005\u0014\u0000\u0000\u021a\u021b\u0003F#\u0000"+
		"\u021b\u021d\u0005\f\u0000\u0000\u021c\u021e\u0003\u000e\u0007\u0000\u021d"+
		"\u021c\u0001\u0000\u0000\u0000\u021e\u021f\u0001\u0000\u0000\u0000\u021f"+
		"\u021d\u0001\u0000\u0000\u0000\u021f\u0220\u0001\u0000\u0000\u0000\u0220"+
		"\u0224\u0001\u0000\u0000\u0000\u0221\u0223\u0003h4\u0000\u0222\u0221\u0001"+
		"\u0000\u0000\u0000\u0223\u0226\u0001\u0000\u0000\u0000\u0224\u0222\u0001"+
		"\u0000\u0000\u0000\u0224\u0225\u0001\u0000\u0000\u0000\u0225\u0228\u0001"+
		"\u0000\u0000\u0000\u0226\u0224\u0001\u0000\u0000\u0000\u0227\u0229\u0003"+
		"j5\u0000\u0228\u0227\u0001\u0000\u0000\u0000\u0228\u0229\u0001\u0000\u0000"+
		"\u0000\u0229g\u0001\u0000\u0000\u0000\u022a\u022b\u0005\u0015\u0000\u0000"+
		"\u022b\u022c\u0003F#\u0000\u022c\u022e\u0005\f\u0000\u0000\u022d\u022f"+
		"\u0003\u000e\u0007\u0000\u022e\u022d\u0001\u0000\u0000\u0000\u022f\u0230"+
		"\u0001\u0000\u0000\u0000\u0230\u022e\u0001\u0000\u0000\u0000\u0230\u0231"+
		"\u0001\u0000\u0000\u0000\u0231i\u0001\u0000\u0000\u0000\u0232\u0233\u0005"+
		"\u0016\u0000\u0000\u0233\u0235\u0005\f\u0000\u0000\u0234\u0236\u0003\u000e"+
		"\u0007\u0000\u0235\u0234\u0001\u0000\u0000\u0000\u0236\u0237\u0001\u0000"+
		"\u0000\u0000\u0237\u0235\u0001\u0000\u0000\u0000\u0237\u0238\u0001\u0000"+
		"\u0000\u0000\u0238k\u0001\u0000\u0000\u0000\u0239\u023a\u0005C\u0000\u0000"+
		"\u023a\u023b\u0005\u0012\u0000\u0000\u023b\u023c\u0005C\u0000\u0000\u023c"+
		"\u023d\u0005\b\u0000\u0000\u023d\u023e\u0005I\u0000\u0000\u023e\u023f"+
		"\u0005H\u0000\u0000\u023fm\u0001\u0000\u0000\u0000/qx}\u008d\u0091\u00aa"+
		"\u00b7\u00bc\u00c7\u00c9\u00d0\u00db\u00e8\u00f9\u0104\u0111\u011b\u0121"+
		"\u0125\u012d\u0136\u0147\u014a\u0160\u016d\u017d\u0182\u0189\u018c\u0193"+
		"\u019d\u01a6\u01ab\u01b4\u01b6\u01ca\u01d7\u01e0\u01f3\u01fa\u0209\u0215"+
		"\u021f\u0224\u0228\u0230\u0237";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}