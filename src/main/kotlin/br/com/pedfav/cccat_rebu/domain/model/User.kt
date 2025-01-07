package br.com.pedfav.cccat_rebu.domain.model

import br.com.pedfav.cccat_rebu.domain.usecase.ValidateCarPlateUseCase
import br.com.pedfav.cccat_rebu.domain.usecase.ValidateCpfUseCase
import br.com.pedfav.cccat_rebu.domain.usecase.ValidateEmailUseCase

data class User(
        val accountId: String? = null,
        val name: String,
        val email: String,
        val cpf: String,
        val carPlate: String,
        val isPassenger: Boolean,
        val isDriver: Boolean,
) {
    init {
        if (isPassenger && isDriver) {
            throw IllegalArgumentException("User cannot be passenger and driver!")
        }

        if (!isPassenger && !isDriver) {
            throw IllegalArgumentException("User needs to be passenger or driver!")
        }

        if (!ValidateEmailUseCase().isEmailValid(this.email)) {
            throw IllegalArgumentException("Cannot create user because email is invalid!")
        }

        if (!ValidateCpfUseCase().isCpfValid(this.cpf)) {
            throw IllegalArgumentException("Cannot create user because cpf is invalid!")
        }

        if (!ValidateCarPlateUseCase().isCarPlateValid(this.carPlate)) {
            throw IllegalArgumentException("Cannot create user because car plate is invalid!")
        }
    }
}
