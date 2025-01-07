package br.com.pedfav.cccat_rebu.adapters.input.controller.datacontract

import br.com.pedfav.cccat_rebu.adapters.input.controller.validations.CarPLateIsValid
import br.com.pedfav.cccat_rebu.adapters.input.controller.validations.CpfIsValid
import com.fasterxml.jackson.annotation.JsonProperty
import jakarta.validation.constraints.Email
import jakarta.validation.constraints.NotBlank

data class SignUpDataContract(

        @field:JsonProperty("accountId")
        val accountId: String?,

        @field:NotBlank
        @field:JsonProperty("name")
        val name: String,

        @field:Email
        @field:JsonProperty("email")
        val email: String,

        @field:JsonProperty("password")
        val password: String,

        @field:NotBlank
        @field:CpfIsValid
        @field:JsonProperty("cpf")
        val cpf: String,

        @field:NotBlank
        @field:CarPLateIsValid
        @field:JsonProperty("carPlate")
        val carPlate: String,

        @field:JsonProperty("isPassenger")
        val isPassenger: Boolean,

        @field:JsonProperty("isDriver")
        val isDriver: Boolean
)
