// Generated from CommandParser.g4 by ANTLR 4.7
package ru.hse.anstkras.commandparser;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CommandParserParser}.
 */
public interface CommandParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CommandParserParser#line}.
	 * @param ctx the parse tree
	 */
	void enterLine(CommandParserParser.LineContext ctx);
	/**
	 * Exit a parse tree produced by {@link CommandParserParser#line}.
	 * @param ctx the parse tree
	 */
	void exitLine(CommandParserParser.LineContext ctx);
	/**
	 * Enter a parse tree produced by {@link CommandParserParser#command}.
	 * @param ctx the parse tree
	 */
	void enterCommand(CommandParserParser.CommandContext ctx);
	/**
	 * Exit a parse tree produced by {@link CommandParserParser#command}.
	 * @param ctx the parse tree
	 */
	void exitCommand(CommandParserParser.CommandContext ctx);
	/**
	 * Enter a parse tree produced by {@link CommandParserParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(CommandParserParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link CommandParserParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(CommandParserParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link CommandParserParser#echoCommand}.
	 * @param ctx the parse tree
	 */
	void enterEchoCommand(CommandParserParser.EchoCommandContext ctx);
	/**
	 * Exit a parse tree produced by {@link CommandParserParser#echoCommand}.
	 * @param ctx the parse tree
	 */
	void exitEchoCommand(CommandParserParser.EchoCommandContext ctx);
	/**
	 * Enter a parse tree produced by {@link CommandParserParser#catCommand}.
	 * @param ctx the parse tree
	 */
	void enterCatCommand(CommandParserParser.CatCommandContext ctx);
	/**
	 * Exit a parse tree produced by {@link CommandParserParser#catCommand}.
	 * @param ctx the parse tree
	 */
	void exitCatCommand(CommandParserParser.CatCommandContext ctx);
	/**
	 * Enter a parse tree produced by {@link CommandParserParser#wcCommand}.
	 * @param ctx the parse tree
	 */
	void enterWcCommand(CommandParserParser.WcCommandContext ctx);
	/**
	 * Exit a parse tree produced by {@link CommandParserParser#wcCommand}.
	 * @param ctx the parse tree
	 */
	void exitWcCommand(CommandParserParser.WcCommandContext ctx);
	/**
	 * Enter a parse tree produced by {@link CommandParserParser#pwdCommand}.
	 * @param ctx the parse tree
	 */
	void enterPwdCommand(CommandParserParser.PwdCommandContext ctx);
	/**
	 * Exit a parse tree produced by {@link CommandParserParser#pwdCommand}.
	 * @param ctx the parse tree
	 */
	void exitPwdCommand(CommandParserParser.PwdCommandContext ctx);
	/**
	 * Enter a parse tree produced by {@link CommandParserParser#exitCommand}.
	 * @param ctx the parse tree
	 */
	void enterExitCommand(CommandParserParser.ExitCommandContext ctx);
	/**
	 * Exit a parse tree produced by {@link CommandParserParser#exitCommand}.
	 * @param ctx the parse tree
	 */
	void exitExitCommand(CommandParserParser.ExitCommandContext ctx);
	/**
	 * Enter a parse tree produced by {@link CommandParserParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(CommandParserParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link CommandParserParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(CommandParserParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link CommandParserParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(CommandParserParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link CommandParserParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(CommandParserParser.ValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link CommandParserParser#grepCommand}.
	 * @param ctx the parse tree
	 */
	void enterGrepCommand(CommandParserParser.GrepCommandContext ctx);
	/**
	 * Exit a parse tree produced by {@link CommandParserParser#grepCommand}.
	 * @param ctx the parse tree
	 */
	void exitGrepCommand(CommandParserParser.GrepCommandContext ctx);
	/**
	 * Enter a parse tree produced by {@link CommandParserParser#cdCommand}.
	 * @param ctx the parse tree
	 */
	void enterCdCommand(CommandParserParser.CdCommandContext ctx);
	/**
	 * Exit a parse tree produced by {@link CommandParserParser#cdCommand}.
	 * @param ctx the parse tree
	 */
	void exitCdCommand(CommandParserParser.CdCommandContext ctx);
	/**
	 * Enter a parse tree produced by {@link CommandParserParser#lsCommand}.
	 * @param ctx the parse tree
	 */
	void enterLsCommand(CommandParserParser.LsCommandContext ctx);
	/**
	 * Exit a parse tree produced by {@link CommandParserParser#lsCommand}.
	 * @param ctx the parse tree
	 */
	void exitLsCommand(CommandParserParser.LsCommandContext ctx);
	/**
	 * Enter a parse tree produced by {@link CommandParserParser#unknown}.
	 * @param ctx the parse tree
	 */
	void enterUnknown(CommandParserParser.UnknownContext ctx);
	/**
	 * Exit a parse tree produced by {@link CommandParserParser#unknown}.
	 * @param ctx the parse tree
	 */
	void exitUnknown(CommandParserParser.UnknownContext ctx);
}