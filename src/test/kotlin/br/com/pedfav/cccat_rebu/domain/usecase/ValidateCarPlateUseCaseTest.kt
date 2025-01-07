package br.com.pedfav.cccat_rebu.domain.usecase

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.ValueSource

class ValidateCarPlateUseCaseTest {
    private val validateCarPlateUseCase = ValidateCarPlateUseCase()

    @ParameterizedTest
    @ValueSource(strings = ["FJY7754", "DKU8B29", "fjy7754"])
    fun validateValidCarPlates(carPlate: String) {
        assertTrue { validateCarPlateUseCase.isCarPlateValid(carPlate) }
    }

    @ParameterizedTest
    @ValueSource(strings = ["11", "11111111111", "HAG-2809", "ELF8"])
    fun validateInvalidCarPlates(carPlate: String) {
        assertFalse { validateCarPlateUseCase.isCarPlateValid(carPlate) }
    }
}