package br.com.pedfav.cccat_rebu.domain.usecase

import br.com.pedfav.cccat_rebu.domain.model.User
import org.springframework.stereotype.Component

@Component
class GetAccountUseCase {
    fun saveUser(user: User) {
        println(user)
    }
}