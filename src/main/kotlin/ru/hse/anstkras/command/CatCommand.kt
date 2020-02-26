package ru.hse.anstkras.command

import ru.hse.anstkras.environment.Environment
import java.io.InputStreamReader
import java.io.OutputStreamWriter

/** CatCommand implements standard linux cat command */
class CatCommand : Command {
    override fun execute(
        inputStreamReader: InputStreamReader,
        outputStreamWriter: OutputStreamWriter,
        environment: Environment
    ): Int {
        inputStreamReader.forEachLine {
            outputStreamWriter.write(it + System.lineSeparator())
        }
        outputStreamWriter.flush()
        return 0
    }
}