package org.dkazantsev.shopPractice.exceptions.resolvers

import org.dkazantsev.shopPractice.exceptions.handlers.response.ExceptionResponse

interface ExceptionResolver {

    fun invoke(exception: Exception): ExceptionResponse?

}