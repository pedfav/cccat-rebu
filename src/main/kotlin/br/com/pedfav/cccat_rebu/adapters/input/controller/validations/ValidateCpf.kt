package br.com.pedfav.cccat_rebu.adapters.input.controller.validations

import jakarta.validation.Constraint
import jakarta.validation.Payload
import kotlin.reflect.KClass

@MustBeDocumented
@Target(AnnotationTarget.FIELD)
@Retention(AnnotationRetention.RUNTIME)
@Constraint(validatedBy = [CpfValidator::class])
annotation class CpfIsValid(
        val message: String = "Invalid cpf",
        val groups: Array<KClass<Any>> = [],
        val payload: Array<KClass<Payload>> = []
)