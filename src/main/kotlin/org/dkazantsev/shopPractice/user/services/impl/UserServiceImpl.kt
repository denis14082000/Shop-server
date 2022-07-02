package org.dkazantsev.shopPractice.user.services.impl

import org.dkazantsev.shopPractice.user.exceptions.WrongPasswordException
import org.dkazantsev.shopPractice.user.repositories.UserRepository
import org.dkazantsev.shopPractice.user.repositories.findByLoginOrThrow
import org.dkazantsev.shopPractice.user.services.UserService
import org.dkazantsev.shopPractice.user.services.dto.AuthUser
import org.dkazantsev.shopPractice.user.services.dto.AuthUserDto
import org.springframework.stereotype.Service

@Service
class UserServiceImpl(
    private val userRepository: UserRepository,
) : UserService {

    override fun auth(authUser: AuthUser): AuthUserDto {
        val user = userRepository.findByLoginOrThrow(authUser.login)

        if (user.password != authUser.password) {
            throw WrongPasswordException()
        }

        return AuthUserDto(
            userId = user.id,
            name = user.name
        )
    }

}