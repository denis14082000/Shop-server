package org.dkazantsev.shopPractice.user.controllers.body

data class AuthUserBody(
    val login: String,
    val password: String,
)