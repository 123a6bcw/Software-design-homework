// Generated from CommandParser.g4 by ANTLR 4.7
package ru.hse.anstkras.commandparser;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CommandParserLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, GREP=3, CAT=4, ECHO=5, WC=6, PWD=7, EXIT=8, CD=9, LS=10, 
		STRING=11, UNKNOWN=12, WS=13;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "GREP", "CAT", "ECHO", "WC", "PWD", "EXIT", "CD", "LS", 
		"STRING", "UNKNOWN", "WS"
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


	public CommandParserLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "CommandParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\17o\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\7\4(\n\4\f\4\16\4+\13\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\5\7>\n\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3"+
		"\n\3\n\3\n\3\13\3\13\3\13\3\f\6\fP\n\f\r\f\16\fQ\3\f\3\f\7\fV\n\f\f\f"+
		"\16\fY\13\f\3\f\3\f\3\f\3\f\5\f_\n\f\3\r\6\rb\n\r\r\r\16\rc\3\r\7\rg\n"+
		"\r\f\r\16\rj\13\r\3\16\3\16\3\16\3\16\4ch\2\17\3\3\5\4\7\5\t\6\13\7\r"+
		"\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\3\2\b\3\2~~\6\2\13\f\17\17\""+
		"\"??\3\2$$\3\2))\6\2\62;C\\aac|\4\2\13\f\"\"\2v\2\3\3\2\2\2\2\5\3\2\2"+
		"\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21"+
		"\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2"+
		"\2\2\3\35\3\2\2\2\5\37\3\2\2\2\7!\3\2\2\2\t,\3\2\2\2\13\61\3\2\2\2\r="+
		"\3\2\2\2\17?\3\2\2\2\21C\3\2\2\2\23H\3\2\2\2\25K\3\2\2\2\27^\3\2\2\2\31"+
		"a\3\2\2\2\33k\3\2\2\2\35\36\7~\2\2\36\4\3\2\2\2\37 \7?\2\2 \6\3\2\2\2"+
		"!\"\7i\2\2\"#\7t\2\2#$\7g\2\2$%\7r\2\2%)\3\2\2\2&(\n\2\2\2\'&\3\2\2\2"+
		"(+\3\2\2\2)\'\3\2\2\2)*\3\2\2\2*\b\3\2\2\2+)\3\2\2\2,-\7e\2\2-.\7c\2\2"+
		"./\7v\2\2/\60\7\"\2\2\60\n\3\2\2\2\61\62\7g\2\2\62\63\7e\2\2\63\64\7j"+
		"\2\2\64\65\7q\2\2\65\66\7\"\2\2\66\f\3\2\2\2\678\7y\2\289\7e\2\29>\7\""+
		"\2\2:;\7\"\2\2;<\7y\2\2<>\7e\2\2=\67\3\2\2\2=:\3\2\2\2>\16\3\2\2\2?@\7"+
		"r\2\2@A\7y\2\2AB\7f\2\2B\20\3\2\2\2CD\7g\2\2DE\7z\2\2EF\7k\2\2FG\7v\2"+
		"\2G\22\3\2\2\2HI\7e\2\2IJ\7f\2\2J\24\3\2\2\2KL\7n\2\2LM\7u\2\2M\26\3\2"+
		"\2\2NP\n\3\2\2ON\3\2\2\2PQ\3\2\2\2QO\3\2\2\2QR\3\2\2\2R_\3\2\2\2SW\7$"+
		"\2\2TV\n\4\2\2UT\3\2\2\2VY\3\2\2\2WU\3\2\2\2WX\3\2\2\2XZ\3\2\2\2YW\3\2"+
		"\2\2Z_\7$\2\2[\\\7)\2\2\\]\n\5\2\2]_\7)\2\2^O\3\2\2\2^S\3\2\2\2^[\3\2"+
		"\2\2_\30\3\2\2\2`b\t\6\2\2a`\3\2\2\2bc\3\2\2\2cd\3\2\2\2ca\3\2\2\2dh\3"+
		"\2\2\2eg\n\2\2\2fe\3\2\2\2gj\3\2\2\2hi\3\2\2\2hf\3\2\2\2i\32\3\2\2\2j"+
		"h\3\2\2\2kl\t\7\2\2lm\3\2\2\2mn\b\16\2\2n\34\3\2\2\2\n\2)=QW^ch\3\b\2"+
		"\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}