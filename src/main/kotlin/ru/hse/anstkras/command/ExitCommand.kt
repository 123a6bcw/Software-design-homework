package ru.hse.anstkras.command

import ru.hse.anstkras.environment.Environment
import java.io.InputStreamReader
import java.io.OutputStreamWriter

/** Command that stops CLI */
class ExitCommand : Command {
    override fun execute(
        inputStreamReader: InputStreamReader,
        outputStreamWriter: OutputStreamWriter,
        environment: Environment
    ): Int {
        throw ExitException()
    }
}