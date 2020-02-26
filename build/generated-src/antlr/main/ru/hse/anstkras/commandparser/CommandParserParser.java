// Generated from CommandParser.g4 by ANTLR 4.7
package ru.hse.anstkras.commandparser;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CommandParserParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, GREP=3, CAT=4, ECHO=5, WC=6, PWD=7, EXIT=8, CD=9, LS=10, 
		STRING=11, UNKNOWN=12, WS=13;
	public static final int
		RULE_line = 0, RULE_command = 1, RULE_assignment = 2, RULE_echoCommand = 3, 
		RULE_catCommand = 4, RULE_wcCommand = 5, RULE_pwdCommand = 6, RULE_exitCommand = 7, 
		RULE_variable = 8, RULE_value = 9, RULE_grepCommand = 10, RULE_cdCommand = 11, 
		RULE_lsCommand = 12, RULE_unknown = 13;
	public static final String[] ruleNames = {
		"line", "command", "assignment", "echoCommand", "catCommand", "wcCommand", 
		"pwdCommand", "exitCommand", "variable", "value", "grepCommand", "cdCommand", 
		"lsCommand", "unknown"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'|'", "'='", null, "'cat '", "'echo '", null, "'pwd'", "'exit'", 
		"'cd'", "'ls'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, "GREP", "CAT", "ECHO", "WC", "PWD", "EXIT", "CD", "LS", 
		"STRING", "UNKNOWN", "WS"
	};
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
	public String getGrammarFileName() { return "CommandParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public CommandParserParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class LineContext extends ParserRuleContext {
		public CommandContext command() {
			return getRuleContext(CommandContext.class,0);
		}
		public List<LineContext> line() {
			return getRuleContexts(LineContext.class);
		}
		public LineContext line(int i) {
			return getRuleContext(LineContext.class,i);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public LineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_line; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CommandParserListener ) ((CommandParserListener)listener).enterLine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CommandParserListener ) ((CommandParserListener)listener).exitLine(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CommandParserVisitor ) return ((CommandParserVisitor<? extends T>)visitor).visitLine(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LineContext line() throws RecognitionException {
		LineContext _localctx = new LineContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_line);
		try {
			int _alt;
			setState(37);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(28);
				command();
				setState(33);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(29);
						match(T__0);
						setState(30);
						line();
						}
						} 
					}
					setState(35);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(36);
				assignment();
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

	public static class CommandContext extends ParserRuleContext {
		public EchoCommandContext echoCommand() {
			return getRuleContext(EchoCommandContext.class,0);
		}
		public CatCommandContext catCommand() {
			return getRuleContext(CatCommandContext.class,0);
		}
		public WcCommandContext wcCommand() {
			return getRuleContext(WcCommandContext.class,0);
		}
		public PwdCommandContext pwdCommand() {
			return getRuleContext(PwdCommandContext.class,0);
		}
		public ExitCommandContext exitCommand() {
			return getRuleContext(ExitCommandContext.class,0);
		}
		public GrepCommandContext grepCommand() {
			return getRuleContext(GrepCommandContext.class,0);
		}
		public UnknownContext unknown() {
			return getRuleContext(UnknownContext.class,0);
		}
		public CdCommandContext cdCommand() {
			return getRuleContext(CdCommandContext.class,0);
		}
		public LsCommandContext lsCommand() {
			return getRuleContext(LsCommandContext.class,0);
		}
		public CommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_command; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CommandParserListener ) ((CommandParserListener)listener).enterCommand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CommandParserListener ) ((CommandParserListener)listener).exitCommand(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CommandParserVisitor ) return ((CommandParserVisitor<? extends T>)visitor).visitCommand(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CommandContext command() throws RecognitionException {
		CommandContext _localctx = new CommandContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_command);
		try {
			setState(48);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ECHO:
				enterOuterAlt(_localctx, 1);
				{
				setState(39);
				echoCommand();
				}
				break;
			case CAT:
				enterOuterAlt(_localctx, 2);
				{
				setState(40);
				catCommand();
				}
				break;
			case WC:
				enterOuterAlt(_localctx, 3);
				{
				setState(41);
				wcCommand();
				}
				break;
			case PWD:
				enterOuterAlt(_localctx, 4);
				{
				setState(42);
				pwdCommand();
				}
				break;
			case EXIT:
				enterOuterAlt(_localctx, 5);
				{
				setState(43);
				exitCommand();
				}
				break;
			case GREP:
				enterOuterAlt(_localctx, 6);
				{
				setState(44);
				grepCommand();
				}
				break;
			case STRING:
			case UNKNOWN:
				enterOuterAlt(_localctx, 7);
				{
				setState(45);
				unknown();
				}
				break;
			case CD:
				enterOuterAlt(_localctx, 8);
				{
				setState(46);
				cdCommand();
				}
				break;
			case LS:
				enterOuterAlt(_localctx, 9);
				{
				setState(47);
				lsCommand();
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

	public static class AssignmentContext extends ParserRuleContext {
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CommandParserListener ) ((CommandParserListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CommandParserListener ) ((CommandParserListener)listener).exitAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CommandParserVisitor ) return ((CommandParserVisitor<? extends T>)visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(50);
			variable();
			setState(51);
			match(T__1);
			setState(52);
			value();
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

	public static class EchoCommandContext extends ParserRuleContext {
		public Token STRING;
		public List<Token> strings = new ArrayList<Token>();
		public TerminalNode ECHO() { return getToken(CommandParserParser.ECHO, 0); }
		public List<TerminalNode> STRING() { return getTokens(CommandParserParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(CommandParserParser.STRING, i);
		}
		public EchoCommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_echoCommand; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CommandParserListener ) ((CommandParserListener)listener).enterEchoCommand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CommandParserListener ) ((CommandParserListener)listener).exitEchoCommand(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CommandParserVisitor ) return ((CommandParserVisitor<? extends T>)visitor).visitEchoCommand(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EchoCommandContext echoCommand() throws RecognitionException {
		EchoCommandContext _localctx = new EchoCommandContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_echoCommand);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(54);
			match(ECHO);
			setState(56); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(55);
				((EchoCommandContext)_localctx).STRING = match(STRING);
				((EchoCommandContext)_localctx).strings.add(((EchoCommandContext)_localctx).STRING);
				}
				}
				setState(58); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==STRING );
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

	public static class CatCommandContext extends ParserRuleContext {
		public TerminalNode CAT() { return getToken(CommandParserParser.CAT, 0); }
		public TerminalNode STRING() { return getToken(CommandParserParser.STRING, 0); }
		public CatCommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_catCommand; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CommandParserListener ) ((CommandParserListener)listener).enterCatCommand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CommandParserListener ) ((CommandParserListener)listener).exitCatCommand(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CommandParserVisitor ) return ((CommandParserVisitor<? extends T>)visitor).visitCatCommand(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CatCommandContext catCommand() throws RecognitionException {
		CatCommandContext _localctx = new CatCommandContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_catCommand);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(60);
			match(CAT);
			setState(61);
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

	public static class WcCommandContext extends ParserRuleContext {
		public TerminalNode WC() { return getToken(CommandParserParser.WC, 0); }
		public TerminalNode STRING() { return getToken(CommandParserParser.STRING, 0); }
		public WcCommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_wcCommand; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CommandParserListener ) ((CommandParserListener)listener).enterWcCommand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CommandParserListener ) ((CommandParserListener)listener).exitWcCommand(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CommandParserVisitor ) return ((CommandParserVisitor<? extends T>)visitor).visitWcCommand(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WcCommandContext wcCommand() throws RecognitionException {
		WcCommandContext _localctx = new WcCommandContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_wcCommand);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(63);
			match(WC);
			setState(65);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STRING) {
				{
				setState(64);
				match(STRING);
				}
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

	public static class PwdCommandContext extends ParserRuleContext {
		public TerminalNode PWD() { return getToken(CommandParserParser.PWD, 0); }
		public PwdCommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pwdCommand; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CommandParserListener ) ((CommandParserListener)listener).enterPwdCommand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CommandParserListener ) ((CommandParserListener)listener).exitPwdCommand(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CommandParserVisitor ) return ((CommandParserVisitor<? extends T>)visitor).visitPwdCommand(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PwdCommandContext pwdCommand() throws RecognitionException {
		PwdCommandContext _localctx = new PwdCommandContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_pwdCommand);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(67);
			match(PWD);
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

	public static class ExitCommandContext extends ParserRuleContext {
		public TerminalNode EXIT() { return getToken(CommandParserParser.EXIT, 0); }
		public ExitCommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exitCommand; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CommandParserListener ) ((CommandParserListener)listener).enterExitCommand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CommandParserListener ) ((CommandParserListener)listener).exitExitCommand(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CommandParserVisitor ) return ((CommandParserVisitor<? extends T>)visitor).visitExitCommand(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExitCommandContext exitCommand() throws RecognitionException {
		ExitCommandContext _localctx = new ExitCommandContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_exitCommand);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(69);
			match(EXIT);
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

	public static class VariableContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(CommandParserParser.STRING, 0); }
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CommandParserListener ) ((CommandParserListener)listener).enterVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CommandParserListener ) ((CommandParserListener)listener).exitVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CommandParserVisitor ) return ((CommandParserVisitor<? extends T>)visitor).visitVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_variable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(71);
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

	public static class ValueContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(CommandParserParser.STRING, 0); }
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CommandParserListener ) ((CommandParserListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CommandParserListener ) ((CommandParserListener)listener).exitValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CommandParserVisitor ) return ((CommandParserVisitor<? extends T>)visitor).visitValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_value);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(73);
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

	public static class GrepCommandContext extends ParserRuleContext {
		public TerminalNode GREP() { return getToken(CommandParserParser.GREP, 0); }
		public GrepCommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_grepCommand; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CommandParserListener ) ((CommandParserListener)listener).enterGrepCommand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CommandParserListener ) ((CommandParserListener)listener).exitGrepCommand(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CommandParserVisitor ) return ((CommandParserVisitor<? extends T>)visitor).visitGrepCommand(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GrepCommandContext grepCommand() throws RecognitionException {
		GrepCommandContext _localctx = new GrepCommandContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_grepCommand);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(75);
			match(GREP);
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

	public static class CdCommandContext extends ParserRuleContext {
		public TerminalNode CD() { return getToken(CommandParserParser.CD, 0); }
		public TerminalNode STRING() { return getToken(CommandParserParser.STRING, 0); }
		public CdCommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cdCommand; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CommandParserListener ) ((CommandParserListener)listener).enterCdCommand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CommandParserListener ) ((CommandParserListener)listener).exitCdCommand(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CommandParserVisitor ) return ((CommandParserVisitor<? extends T>)visitor).visitCdCommand(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CdCommandContext cdCommand() throws RecognitionException {
		CdCommandContext _localctx = new CdCommandContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_cdCommand);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(77);
			match(CD);
			setState(79);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STRING) {
				{
				setState(78);
				match(STRING);
				}
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

	public static class LsCommandContext extends ParserRuleContext {
		public TerminalNode LS() { return getToken(CommandParserParser.LS, 0); }
		public TerminalNode STRING() { return getToken(CommandParserParser.STRING, 0); }
		public LsCommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lsCommand; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CommandParserListener ) ((CommandParserListener)listener).enterLsCommand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CommandParserListener ) ((CommandParserListener)listener).exitLsCommand(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CommandParserVisitor ) return ((CommandParserVisitor<? extends T>)visitor).visitLsCommand(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LsCommandContext lsCommand() throws RecognitionException {
		LsCommandContext _localctx = new LsCommandContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_lsCommand);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(81);
			match(LS);
			setState(83);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STRING) {
				{
				setState(82);
				match(STRING);
				}
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

	public static class UnknownContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(CommandParserParser.STRING, 0); }
		public TerminalNode UNKNOWN() { return getToken(CommandParserParser.UNKNOWN, 0); }
		public UnknownContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unknown; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CommandParserListener ) ((CommandParserListener)listener).enterUnknown(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CommandParserListener ) ((CommandParserListener)listener).exitUnknown(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CommandParserVisitor ) return ((CommandParserVisitor<? extends T>)visitor).visitUnknown(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnknownContext unknown() throws RecognitionException {
		UnknownContext _localctx = new UnknownContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_unknown);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(85);
			_la = _input.LA(1);
			if ( !(_la==STRING || _la==UNKNOWN) ) {
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\17Z\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4"+
		"\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\3\2\3\2\3\2\7\2\"\n\2\f\2\16\2%\13"+
		"\2\3\2\5\2(\n\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3\63\n\3\3\4\3\4"+
		"\3\4\3\4\3\5\3\5\6\5;\n\5\r\5\16\5<\3\6\3\6\3\6\3\7\3\7\5\7D\n\7\3\b\3"+
		"\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\5\rR\n\r\3\16\3\16\5\16V"+
		"\n\16\3\17\3\17\3\17\2\2\20\2\4\6\b\n\f\16\20\22\24\26\30\32\34\2\3\3"+
		"\2\r\16\2Y\2\'\3\2\2\2\4\62\3\2\2\2\6\64\3\2\2\2\b8\3\2\2\2\n>\3\2\2\2"+
		"\fA\3\2\2\2\16E\3\2\2\2\20G\3\2\2\2\22I\3\2\2\2\24K\3\2\2\2\26M\3\2\2"+
		"\2\30O\3\2\2\2\32S\3\2\2\2\34W\3\2\2\2\36#\5\4\3\2\37 \7\3\2\2 \"\5\2"+
		"\2\2!\37\3\2\2\2\"%\3\2\2\2#!\3\2\2\2#$\3\2\2\2$(\3\2\2\2%#\3\2\2\2&("+
		"\5\6\4\2\'\36\3\2\2\2\'&\3\2\2\2(\3\3\2\2\2)\63\5\b\5\2*\63\5\n\6\2+\63"+
		"\5\f\7\2,\63\5\16\b\2-\63\5\20\t\2.\63\5\26\f\2/\63\5\34\17\2\60\63\5"+
		"\30\r\2\61\63\5\32\16\2\62)\3\2\2\2\62*\3\2\2\2\62+\3\2\2\2\62,\3\2\2"+
		"\2\62-\3\2\2\2\62.\3\2\2\2\62/\3\2\2\2\62\60\3\2\2\2\62\61\3\2\2\2\63"+
		"\5\3\2\2\2\64\65\5\22\n\2\65\66\7\4\2\2\66\67\5\24\13\2\67\7\3\2\2\28"+
		":\7\7\2\29;\7\r\2\2:9\3\2\2\2;<\3\2\2\2<:\3\2\2\2<=\3\2\2\2=\t\3\2\2\2"+
		">?\7\6\2\2?@\7\r\2\2@\13\3\2\2\2AC\7\b\2\2BD\7\r\2\2CB\3\2\2\2CD\3\2\2"+
		"\2D\r\3\2\2\2EF\7\t\2\2F\17\3\2\2\2GH\7\n\2\2H\21\3\2\2\2IJ\7\r\2\2J\23"+
		"\3\2\2\2KL\7\r\2\2L\25\3\2\2\2MN\7\5\2\2N\27\3\2\2\2OQ\7\13\2\2PR\7\r"+
		"\2\2QP\3\2\2\2QR\3\2\2\2R\31\3\2\2\2SU\7\f\2\2TV\7\r\2\2UT\3\2\2\2UV\3"+
		"\2\2\2V\33\3\2\2\2WX\t\2\2\2X\35\3\2\2\2\t#\'\62<CQU";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}