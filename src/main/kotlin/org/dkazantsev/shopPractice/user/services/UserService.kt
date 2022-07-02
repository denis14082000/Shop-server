package org.dkazantsev.shopPractice.user.services

import org.dkazantsev.shopPractice.user.services.dto.AuthUser
import org.dkazantsev.shopPractice.user.services.dto.AuthUserDto

interface UserService {

    fun auth(authUser: AuthUser): AuthUserDto

}