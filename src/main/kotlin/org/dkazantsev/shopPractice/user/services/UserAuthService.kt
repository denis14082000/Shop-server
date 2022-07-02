package org.dkazantsev.shopPractice.user.services

import org.dkazantsev.shopPractice.user.services.dto.Credentials
import java.util.UUID

interface UserAuthService {

    fun getCredentials(userId: UUID): Credentials

}