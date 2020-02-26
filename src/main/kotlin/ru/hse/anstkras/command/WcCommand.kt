package ru.hse.anstkras.command

import ru.hse.anstkras.environment.Environment
import java.io.InputStreamReader
import java.io.OutputStreamWriter

/** WcCommand implements standard linux wc command */
class WcCommand : Command {
    override fun execute(
        inputStreamReader: InputStreamReader,
        outputStreamWriter: OutputStreamWriter,
        environment: Environment
    ): Int {
        var bytesNumber = 0
        var wordsNumber = 0
        var linesNumber = 0
        inputStreamReader.forEachLine {
            linesNumber++
            bytesNumber += it.toByteArray().size
            wordsNumber += it.split(" ").size
        }
        outputStreamWriter.write("$linesNumber $wordsNumber $bytesNumber${System.lineSeparator()}")
        outputStreamWriter.flush()
        return 0
    }
}