package br.com.pedfav.cccat_rebu.adapters.input.controller.converter

import br.com.pedfav.cccat_rebu.adapters.input.controller.datacontract.SignUpDataContract
import br.com.pedfav.cccat_rebu.domain.model.User

fun SignUpDataContract.toDomain(): User =
        User(
                name = this.name,
                email = this.email,
                cpf = this.cpf,
                carPlate = this.carPlate,
                isPassenger = this.isPassenger,
                isDriver = this.isDriver
        )

