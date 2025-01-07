package br.com.pedfav.cccat_rebu.adapters.input.controller.validations

import jakarta.validation.Constraint
import jakarta.validation.Payload
import kotlin.reflect.KClass

@MustBeDocumented
@Target(AnnotationTarget.FIELD)
@Retention(AnnotationRetention.RUNTIME)
@Constraint(validatedBy = [CarPlateValidator::class])
annotation class CarPLateIsValid(
        val message: String = "Invalid car plate",
        val groups: Array<KClass<Any>> = [],
        val payload: Array<KClass<Payload>> = []
)