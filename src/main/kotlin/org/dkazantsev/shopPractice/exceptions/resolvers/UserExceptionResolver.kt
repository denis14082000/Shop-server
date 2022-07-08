package org.dkazantsev.shopPractice.exceptions.resolvers

import org.dkazantsev.shopPractice.base.Ordered
import org.dkazantsev.shopPractice.exceptions.handlers.response.ExceptionResponse
import org.dkazantsev.shopPractice.user.exceptions.UserNotFoundException
import org.dkazantsev.shopPractice.user.exceptions.WrongPasswordException
import org.springframework.core.annotation.Order
import org.springframework.stereotype.Component

@Component
@Order(Ordered.NORMAL)
class UserExceptionResolver : ExceptionResolver {

    override fun invoke(exception: Exception): ExceptionResponse? {
        if (exception is UserNotFoundException) {
            return ExceptionResponse(
                errorCode = "2",
                errorName = exception.message ?: "Пользователь не найден"
            )
        }

        return null
    }

}