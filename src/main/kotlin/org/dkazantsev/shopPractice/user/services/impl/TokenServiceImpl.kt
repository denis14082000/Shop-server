package org.dkazantsev.shopPractice.user.services.impl

import com.auth0.jwt.JWT
import org.dkazantsev.shopPractice.user.services.TokenService
import org.springframework.stereotype.Service
import java.time.Duration
import java.time.LocalDateTime
import java.time.ZoneId
import java.util.*

@Service
class TokenServiceImpl : TokenService {

    override fun getAccessToken(userId: String): String {
        TODO("Not yet implemented")
    }

    override fun getRefrehToken(): String {
        TODO("Not yet implemented")
    }

    private fun getExpirationDate(): Date {
        return LocalDateTime.now()
            .plus(TIME_TO_LIVE)
            .atZone(ZoneId.systemDefault())
            .toInstant()
            .let(Date::from)
    }

//    private fun accessTokenSigningAlgorithm( //TODO(MOVE TO THE CONFIG CLASS)
//        @Qualifier("accessTokenPublicKey")
//        accessTokenPublicKey: RSAPublicKey
//    ): Algorithm {
//        return Algorithm.RSA256(
//            accessTokenPublicKey,
//            accessTokenPrivateKey()
//        )
//    }

    companion object {
        val TIME_TO_LIVE: Duration = Duration.ofHours(2)
    }

}