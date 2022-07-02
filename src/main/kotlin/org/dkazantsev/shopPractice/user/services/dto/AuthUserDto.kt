package org.dkazantsev.shopPractice.user.services.dto

import java.util.UUID

data class AuthUserDto(
    val userId: UUID,
    val name: String,
)
