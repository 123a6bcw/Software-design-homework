package ru.hse.anstkras.parser

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import ru.hse.anstkras.commandlineinterpretator.CommandLineInterpreter
import java.io.ByteArrayOutputStream
import java.io.File
import java.io.PrintStream
import java.nio.file.Paths

internal class CommandLineParserTest {
    @Test
    fun runEcho() {
        checkOutput("echo 123", "123" + System.lineSeparator())
    }

    @Test
    fun runPipeLine() {
        val filePath = Paths.get("./testCat.txt").toAbsolutePath().normalize()
        val file = filePath.toFile()
        val text = "text123 !@#$%^&*()_=${System.lineSeparator()}line2"
        file.writeText(text)
        checkOutput("cat $filePath | wc | wc", "1 3 6" + System.lineSeparator())
        file.delete()
    }

    @Test
    fun echoPipeGrep() {
        checkOutput("echo 123 | grep 123", "123${System.lineSeparator()}")
    }

    private fun checkOutput(command: String, expected: String) {
        val out = ByteArrayOutputStream()
        System.setOut(PrintStream(out))
        val commandLineInterpreter = CommandLineInterpreter()
        commandLineInterpreter.runCommand(command)
        assertEquals(expected, out.toString())
    }
}