package org.dkazantsev.shopPractice.exceptions.resolvers

import org.dkazantsev.shopPractice.base.Ordered
import org.dkazantsev.shopPractice.exceptions.handlers.response.ExceptionResponse
import org.springframework.core.annotation.Order
import org.springframework.stereotype.Component

@Component
@Order(Ordered.LOW)
class BaseExceptionResolver : ExceptionResolver {

    override fun invoke(exception: Exception): ExceptionResponse {
        return ExceptionResponse(
            errorCode = "1",
            errorName = "Что-то пошло не так",
        )
    }

}