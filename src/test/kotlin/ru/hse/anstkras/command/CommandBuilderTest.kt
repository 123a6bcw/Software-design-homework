package ru.hse.anstkras.command

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertDoesNotThrow
import org.junit.jupiter.api.assertThrows
import ru.hse.anstkras.environment.Environment
import java.lang.IllegalStateException

internal class CommandBuilderTest {
    @Test
    fun testCommandBuilderCommandStrategyNotSet() {
        assertThrows<IllegalStateException> {CommandBuilder(Environment()).build()}
    }

    @Test
    fun testCommandBuilderStreamsNotSet() {
        assertDoesNotThrow { CommandBuilder(Environment()).commandStrategy(PwdCommand()).build() }
    }
}