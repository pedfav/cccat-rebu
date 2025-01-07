package br.com.pedfav.cccat_rebu.adapters.input.controller

import br.com.pedfav.cccat_rebu.adapters.input.controller.converter.toDomain
import br.com.pedfav.cccat_rebu.adapters.input.controller.datacontract.SignUpDataContract
import br.com.pedfav.cccat_rebu.domain.usecase.GetAccountUseCase
import jakarta.validation.Valid
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
class SignUpController(
        private val getAccountUseCase: GetAccountUseCase
) {

    @PostMapping("/signup")
    fun signup(@Valid @RequestBody signUpDataContract: SignUpDataContract) {
        getAccountUseCase.saveUser(signUpDataContract.toDomain())
    }
}