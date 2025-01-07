package br.com.pedfav.cccat_rebu.adapters.input.controller.validations

import br.com.pedfav.cccat_rebu.domain.usecase.ValidateCpfUseCase
import jakarta.validation.ConstraintValidator
import jakarta.validation.ConstraintValidatorContext

class CpfValidator : ConstraintValidator<CpfIsValid, String> {

    override fun isValid(value: String, context: ConstraintValidatorContext): Boolean {
        return ValidateCpfUseCase().isCpfValid(value)
    }
}