package ru.hse.anstkras.command

import ru.hse.anstkras.environment.Environment
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.nio.file.Paths

/** PwdCommand implements standard linux pwd command */
class PwdCommand : Command {
    override fun execute(
        inputStreamReader: InputStreamReader,
        outputStreamWriter: OutputStreamWriter,
        environment: Environment
    ): Int {
        val currentPath = environment.getPath()
        val pwd = currentPath.toAbsolutePath().toString()
        outputStreamWriter.write(pwd + System.lineSeparator())
        outputStreamWriter.flush()
        return 0
    }
}