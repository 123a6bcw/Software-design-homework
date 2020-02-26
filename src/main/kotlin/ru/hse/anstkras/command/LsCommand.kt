package ru.hse.anstkras.command

import ru.hse.anstkras.environment.Environment
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.lang.StringBuilder
import java.nio.file.Paths

/** CatCommand implements standard linux cat command */
class LsCommand : Command {
    override fun execute(
        inputStreamReader: InputStreamReader,
        outputStreamWriter: OutputStreamWriter,
        environment: Environment
    ): Int {
        val anotherPath = inputStreamReader.readText()
        val path = environment.getPath(anotherPath)
        val dir = path.toFile()
        val files = dir.listFiles()

        if (files == null) {
            outputStreamWriter.write("невозможно получить доступ к $anotherPath: Нет такого файла или каталога")
            outputStreamWriter.flush()
            return 1
        }

        files.sort()
        files.forEachIndexed(){ index, file ->
            outputStreamWriter.write(file.name)
            if (index + 1 < files.size) {
                outputStreamWriter.write(" ")
            }
        }

        outputStreamWriter.flush()

        return 0
    }
}