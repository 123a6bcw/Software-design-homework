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

internal class LsCommandTest {
    @BeforeEach
    private fun tearUp() {
        testPath.toFile().mkdir()
        testPath.resolve("1").toFile().createNewFile()
        testPath.resolve("2").toFile().createNewFile()
        testPath.resolve("3").toFile().createNewFile()
    }

    @AfterEach
    private fun setDown() {
        testPath.toFile().listFiles().forEach { it.delete() }
        testPath.toFile().delete()
        File(resourcesPath).delete()
    }

    @Test
    fun testLsCorrectWithoutArgument() {
        val expectedResult = "1 2 3"
        runLs("", resourcesPath, expectedResult)
    }

    @Test
    fun testLsCorrectWithArgument() {
        val expectedResult = "1 2 3"
        runLs(Paths.get("", resourcesPath).toString(), "", expectedResult)
    }

    @Test
    fun testLsIncorrectArgument() {
        val path = "no/such/path/lol/kek"
        val expectedResult = "невозможно получить доступ к $path: Нет такого файла или каталога"
        runLs(path, "", expectedResult)
    }

    private fun runLs(path: String, environmentPath: String, expectedResult: String) {
        val lsCommand = LsCommand()
        val byteArrayOutputStream = ByteArrayOutputStream()

        lsCommand.execute(
            InputStreamReader(path.byteInputStream()),
            OutputStreamWriter(byteArrayOutputStream, UTF_8),
            Environment(Paths.get("", environmentPath).toAbsolutePath())
        )

        assertEquals(
            expectedResult,
            byteArrayOutputStream.toString(UTF_8)
        )
    }
}