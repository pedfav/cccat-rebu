package br.com.pedfav.cccat_rebu.domain.usecase

import org.junit.jupiter.api.Assertions.assertFalse
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.ValueSource

class ValidateCpfUseCaseTest {
    private val validateCpfUseCase = ValidateCpfUseCase()

    @ParameterizedTest
    @ValueSource(strings = ["11144477735", "78646814416"])
    fun validateValidCpfs(cpf: String) {
        assertTrue { validateCpfUseCase.isCpfValid(cpf) }
    }

    @ParameterizedTest
    @ValueSource(strings = ["11111111111", "11", "12345678901", "a2345678901", "964.238.743-36"])
    fun validateInvalidCpfs(cpf: String) {
        assertFalse { validateCpfUseCase.isCpfValid(cpf) }
    }
}