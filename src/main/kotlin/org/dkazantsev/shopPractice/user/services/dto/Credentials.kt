package org.dkazantsev.shopPractice.user.services.dto

data class Credentials(
    val accessToken: String,
    val refreshToken: String,
)
