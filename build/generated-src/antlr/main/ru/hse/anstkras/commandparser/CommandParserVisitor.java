// Generated from CommandParser.g4 by ANTLR 4.7
package ru.hse.anstkras.commandparser;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link CommandParserParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface CommandParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link CommandParserParser#line}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLine(CommandParserParser.LineContext ctx);
	/**
	 * Visit a parse tree produced by {@link CommandParserParser#command}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommand(CommandParserParser.CommandContext ctx);
	/**
	 * Visit a parse tree produced by {@link CommandParserParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(CommandParserParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link CommandParserParser#echoCommand}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEchoCommand(CommandParserParser.EchoCommandContext ctx);
	/**
	 * Visit a parse tree produced by {@link CommandParserParser#catCommand}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCatCommand(CommandParserParser.CatCommandContext ctx);
	/**
	 * Visit a parse tree produced by {@link CommandParserParser#wcCommand}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWcCommand(CommandParserParser.WcCommandContext ctx);
	/**
	 * Visit a parse tree produced by {@link CommandParserParser#pwdCommand}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPwdCommand(CommandParserParser.PwdCommandContext ctx);
	/**
	 * Visit a parse tree produced by {@link CommandParserParser#exitCommand}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExitCommand(CommandParserParser.ExitCommandContext ctx);
	/**
	 * Visit a parse tree produced by {@link CommandParserParser#variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(CommandParserParser.VariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link CommandParserParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue(CommandParserParser.ValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link CommandParserParser#grepCommand}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGrepCommand(CommandParserParser.GrepCommandContext ctx);
	/**
	 * Visit a parse tree produced by {@link CommandParserParser#cdCommand}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCdCommand(CommandParserParser.CdCommandContext ctx);
	/**
	 * Visit a parse tree produced by {@link CommandParserParser#lsCommand}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLsCommand(CommandParserParser.LsCommandContext ctx);
	/**
	 * Visit a parse tree produced by {@link CommandParserParser#unknown}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnknown(CommandParserParser.UnknownContext ctx);
}