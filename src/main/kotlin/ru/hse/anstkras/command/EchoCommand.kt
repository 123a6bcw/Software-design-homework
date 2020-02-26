package ru.hse.anstkras.command

import ru.hse.anstkras.environment.Environment
import java.io.InputStreamReader
import java.io.OutputStreamWriter

/** EchoCommand implements standard linux echo command */
class EchoCommand : Command {
    override fun execute(
        inputStreamReader: InputStreamReader,
        outputStreamWriter: OutputStreamWriter,
        environment: Environment
    ): Int {
        outputStreamWriter.write(inputStreamReader.readText() + System.lineSeparator())
        outputStreamWriter.flush()
        return 0
    }
}