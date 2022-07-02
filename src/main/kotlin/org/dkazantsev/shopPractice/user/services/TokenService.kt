package org.dkazantsev.shopPractice.user.services

interface TokenService {

    fun getAccessToken(userId: String): String
    fun getRefrehToken(): String

}