package org.dkazantsev.shopPractice.user.controllers.responses

data class AuthUserResponse(
    val accessToken: String,
    val refreshToken: String,
)
