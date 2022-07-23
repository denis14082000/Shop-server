package org.dkazantsev.shopPractice.exceptions.handlers

import org.dkazantsev.shopPractice.exceptions.handlers.response.ExceptionResponse
import org.dkazantsev.shopPractice.exceptions.resolvers.ExceptionResolver
import org.springframework.web.bind.annotation.ExceptionHandler
import org.springframework.web.bind.annotation.RestControllerAdvice

@RestControllerAdvice
class ExceptionHandlerAdvice(
    private val exceptionResolversList: List<ExceptionResolver>
) {

    @ExceptionHandler(value = [Exception::class])
    fun invoke(exception: Exception): ExceptionResponse { //TODO(CHANGE RESOLVERS TO MAPPING ERROR)
        val result = exceptionResolversList
            .firstNotNullOfOrNull { it.invoke(exception) }
            ?: ExceptionResponse(
                errorCode = "3",
                errorName = "Неожиданная ошибка",
            )

        return result
    }

}