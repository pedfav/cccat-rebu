package br.com.pedfav.cccat_rebu.domain.usecase

class ValidateEmailUseCase {

    fun isEmailValid(email: String): Boolean {
        if (email.isBlank()) return false
        return emailMatchesPattern(email)
    }

    private fun emailMatchesPattern(email: String): Boolean =
            email.matches(Regex("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+\$"))

}