package org.dkazantsev.shopPractice.user.services.impl

import org.dkazantsev.shopPractice.user.services.TokenService
import org.dkazantsev.shopPractice.user.services.UserAuthService
import org.dkazantsev.shopPractice.user.services.dto.Credentials
import org.springframework.stereotype.Service
import java.util.*

@Service
class UserAuthServiceImpl(
    private val tokenService: TokenService,
) : UserAuthService {

    override fun getCredentials(userId: UUID): Credentials {
        TODO("Not yet implemented")
    }

}