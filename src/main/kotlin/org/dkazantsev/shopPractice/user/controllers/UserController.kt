package org.dkazantsev.shopPractice.user.controllers

import org.dkazantsev.shopPractice.user.controllers.body.AuthUserBody
import org.dkazantsev.shopPractice.user.controllers.responses.AuthUserResponse
import org.dkazantsev.shopPractice.user.services.UserService
import org.dkazantsev.shopPractice.user.services.dto.AuthUser
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/user")
class UserController(
    private val userService: UserService,
) {

    @PostMapping("/auth")
    fun authUser(
        @RequestBody authUserBody: AuthUserBody,
    ): AuthUserResponse {
        val user = userService.auth(
            authUser = AuthUser(
                login = authUserBody.login,
                password = authUserBody.password,
            )
        )

        return AuthUserResponse(
            accessToken = "not implemented",
            refreshToken = "not implemented",
        )
    }

}