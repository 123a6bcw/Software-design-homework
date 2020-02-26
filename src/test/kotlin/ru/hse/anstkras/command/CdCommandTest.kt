package ru.hse.anstkras.command

import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import ru.hse.anstkras.environment.Environment
import java.io.ByteArrayOutputStream
import java.io.File
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.nio.file.Paths
import kotlin.text.Charsets.UTF_8

private const val resourcesPath = "src/test/resources"
private val testPath = Paths.get("", resourcesPath).toAbsolutePath()

internal class CdCommandTest {
    @BeforeEach
    private fun tearUp() {
        File(resourcesPath).mkdir()
        File("$resourcesPath/dir1").mkdir()
        File("$resourcesPath/dir1/dir2").mkdir()
        File("$resourcesPath/dir1/dir2/dir3").mkdir()
    }

    @AfterEach
    private fun setDown() {
        File("$resourcesPath/dir1/dir2/dir3").delete()
        File("$resourcesPath/dir1/dir2").delete()
        File("$resourcesPath/dir1").delete()
        File(resourcesPath).delete()
    }

    @Test
    fun testCdCorrectWithArguments() {
        val expectedResult = "dir3"
        runCd(resourcesPath + "/dir1/dir2", expectedResult, false)
    }

    @Test
    fun testLsCorrectWithoutArgument() {
        val path = Paths.get("/")
        val dir = path.toFile()
        val files = dir.listFiles()
        val expectedResult = StringBuilder()

        files.sort()
        files.forEachIndexed() { index, file ->
            expectedResult.append(file.name)
            if (index + 1 < files.size) {
                expectedResult.append(" ")
            }
        }

        runCd("", expectedResult.toString(), false)
    }

    @Test
    fun testCdIncorrectArgument() {
        val path = "no/such/path/lol/kek"
        val expectedResult = "невозможно получить доступ к $resourcesPath/$path: Нет такого файла или каталога"
        runCd("$resourcesPath/$path", expectedResult, true)
    }

    private fun runCd(path: String, expectedResult: String, expectedIncorrect: Boolean) {
        val cdCommand = CdCommand()
        val byteArrayOutputStream = ByteArrayOutputStream()

        val environment = Environment(Paths.get("").toAbsolutePath())

        cdCommand.execute(
            InputStreamReader(path.byteInputStream()),
            OutputStreamWriter(byteArrayOutputStream, UTF_8),
            environment
        )

        if (!expectedIncorrect) {
            val lsCommand = LsCommand()
            lsCommand.execute(InputStreamReader("".byteInputStream()),
                OutputStreamWriter(byteArrayOutputStream, UTF_8),
                environment)
        }

        assertEquals(
            expectedResult,
            byteArrayOutputStream.toString(UTF_8)
        )
    }
}