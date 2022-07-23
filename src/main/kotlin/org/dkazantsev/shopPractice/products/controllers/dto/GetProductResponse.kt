package org.dkazantsev.shopPractice.products.controllers.dto

data class GetProductResponse(
    val name: String,
    val price: Double,
    val description: String?,
)