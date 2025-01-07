package br.com.pedfav.cccat_rebu.domain.usecase

class ValidateCpfUseCase {
    fun isCpfValid(cpf: String): Boolean {
        if (cpf.isBlank()) return false
        if (!cpfHasOnlyNumbers(cpf)) return false
        if (!cpfHasValidLength(cpf)) return false
        if (allCpfNumbersAreTheSame(cpf)) return false
        return isCheckDigitsRight(cpf)
    }

    private fun cpfHasOnlyNumbers(cpf: String): Boolean =
            cpf.all { char -> char.isDigit() }

    private fun cpfHasValidLength(cpf: String): Boolean =
            cpf.length == CPF_LENGTH

    private fun allCpfNumbersAreTheSame(cpf: String): Boolean =
            cpf.toCharArray().all { number -> number == cpf[0] }

    private fun isCheckDigitsRight(cpf: String): Boolean {
        val firstDigit = calculateCheckDigit(cpf, FACTOR_FIRST_DIGIT)
        val secondDigit = calculateCheckDigit(cpf, FACTOR_SECOND_DIGIT)

        return "$firstDigit$secondDigit" == cpf.takeLast(2)
    }

    private fun calculateCheckDigit(cpf: String, factor: Int): Int {
        var total = 0;
        var factorCopy = factor
        cpf.toCharArray()
                .map { it.digitToInt() }
                .forEach {
                    if (factorCopy > 1) {
                        total += (it * factorCopy--)
                    }
                }
        val remainder = total % CPF_LENGTH
        if (remainder < 2)
            return 0
        return CPF_LENGTH - remainder
    }

    companion object {
        const val CPF_LENGTH = 11
        const val FACTOR_FIRST_DIGIT = 10
        const val FACTOR_SECOND_DIGIT = 11
    }
}