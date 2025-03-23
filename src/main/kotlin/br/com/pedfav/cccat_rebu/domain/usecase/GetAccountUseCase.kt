package br.com.pedfav.cccat_rebu.domain.usecase

import br.com.pedfav.cccat_rebu.domain.model.User
import org.springframework.jdbc.core.JdbcTemplate
import org.springframework.stereotype.Component
import java.util.*

@Component
class GetAccountUseCase(
    val jdbcTemplate: JdbcTemplate
) {
    fun saveUser(user: User) {
        println(user)

        jdbcTemplate.update(
            "INSERT INTO account (account_id, name, email, cpf, car_plate, is_passenger, is_driver) VALUES(?,?,?,?,?,?,?)",
            *arrayOf<Any>(
                UUID.randomUUID(),
                user.name,
                user.email,
                user.cpf,
                user.carPlate,
                user.isPassenger,
                user.isDriver
            )
        )
    }
}