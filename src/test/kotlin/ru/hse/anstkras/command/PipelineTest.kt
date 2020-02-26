package ru.hse.anstkras.command

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import ru.hse.anstkras.environment.Environment
import java.io.ByteArrayOutputStream
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import kotlin.text.Charsets.UTF_8

internal class PipelineTest {
    @Test
    fun testEmptyPipeLine() {
        val pipeline = Pipeline()
        assertEquals(0, pipeline.execute(InputStreamReader(System.`in`), OutputStreamWriter(System.out), Environment()))
    }

    @Test
    fun testExecutePipelineTwice() {
        val pipeline = Pipeline()
        pipeline.addCommandLast(
            CommandBuilder(Environment()).commandStrategy(PwdCommand()).outputStreamWriter(
                OutputStreamWriter(
                    ByteArrayOutputStream()
                )
            )
        )
        pipeline.execute(InputStreamReader(System.`in`), OutputStreamWriter(System.out), Environment())
        assertThrows<IllegalStateException> { pipeline.execute(InputStreamReader(System.`in`), OutputStreamWriter(System.out), Environment()) }
    }

    @Test
    fun testExecutePipeLine() {
        val pipeline = Pipeline()
        val byteArrayOutputStream = ByteArrayOutputStream()
        pipeline.addCommandLast(
            CommandBuilder(Environment()).commandStrategy(EchoCommand())
                .inputStreamReader(InputStreamReader("123".byteInputStream(UTF_8)))
        )
        pipeline.addCommandLast(
            CommandBuilder(Environment()).commandStrategy(WcCommand())
                .outputStreamWriter(OutputStreamWriter(byteArrayOutputStream, UTF_8))
        )
        pipeline.execute(InputStreamReader(System.`in`), OutputStreamWriter(System.out), Environment())
        assertEquals("1 1 3" + System.lineSeparator(), byteArrayOutputStream.toString(UTF_8))
    }
}