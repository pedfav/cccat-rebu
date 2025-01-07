package br.com.pedfav.cccat_rebu.adapters.input.controller.validations

import br.com.pedfav.cccat_rebu.domain.usecase.ValidateCarPlateUseCase
import jakarta.validation.ConstraintValidator
import jakarta.validation.ConstraintValidatorContext

class CarPlateValidator : ConstraintValidator<CarPLateIsValid, String> {

    override fun isValid(value: String, context: ConstraintValidatorContext): Boolean {
        return ValidateCarPlateUseCase().isCarPlateValid(value)
    }
}