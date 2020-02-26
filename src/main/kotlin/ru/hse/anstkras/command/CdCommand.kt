package ru.hse.anstkras.command

import ru.hse.anstkras.environment.Environment
import java.io.InputStreamReader
import java.io.OutputStreamWriter

/** CatCommand implements standard linux cat command */
class CdCommand : Command {
    override fun execute(
        inputStreamReader: InputStreamReader,
        outputStreamWriter: OutputStreamWriter,
        environment: Environment
    ): Int {
        val path = inputStreamReader.readText()
        val result: Boolean
        result = if (path.isNotEmpty()) {
            environment.enterPath(path)
        } else {
            environment.enterPath("/")
        }

        if (!result) {
            outputStreamWriter.write("невозможно получить доступ к $path: Нет такого файла или каталога")
            outputStreamWriter.flush()
            return 1
        }

        return 0
    }
}