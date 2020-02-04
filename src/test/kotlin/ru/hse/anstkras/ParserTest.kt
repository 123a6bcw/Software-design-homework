package ru.hse.anstkras

import org.antlr.v4.runtime.CharStreams
import org.antlr.v4.runtime.CommonTokenStream
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import ru.hse.anstkras.commandparser.CommandParserLexer
import ru.hse.anstkras.commandparser.CommandParserParser
import ru.hse.anstkras.environment.Environment
import ru.hse.anstkras.parser.CommandLineParser
import java.io.ByteArrayOutputStream
import java.io.PrintStream

class ParserTest {
    fun runCommand(commandLine: String) {
        val lexer = CommandParserLexer(CharStreams.fromString(commandLine))
        val parser = CommandParserParser(CommonTokenStream(lexer))
        val command = parser.line().accept(CommandLineParser(Environment()))
        command.build().execute()
    }

    @Test
    fun runEcho() {
        checkOutput("echo 123", "123" + System.lineSeparator())
    }

    @Test
    fun runPipeLine() {
        checkOutput("cat 123.txt | wc | echo 321", "321" + System.lineSeparator())
    }

    private fun checkOutput(command: String, expected: String) {
        val out = ByteArrayOutputStream()
        System.setOut(PrintStream(out))
        runCommand(command)
        assertEquals(expected, out.toString())
    }
}