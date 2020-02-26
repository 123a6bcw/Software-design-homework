package ru.hse.anstkras.command

import ru.hse.anstkras.environment.Environment
import java.io.InputStreamReader
import java.io.OutputStreamWriter

/**
 * PipelineCommand is a command that is a part of a PipeLine. It knows about
 * its inputStream and outputStream
 * */
class PipelineCommand(
    private val command: Command, private val inputStreamReader: InputStreamReader,
    private val outputStreamWriter: OutputStreamWriter,
    private val shouldCloseInputStream: Boolean,
    private val shouldCloseOutputStream: Boolean,
    private val environment: Environment
) {
    fun execute(): Int {
        val returnCode = command.execute(inputStreamReader, outputStreamWriter, environment)

        if (shouldCloseInputStream) {
            inputStreamReader.close()
        }
        if (shouldCloseOutputStream) {
            outputStreamWriter.close()
        }

        return returnCode
    }
}