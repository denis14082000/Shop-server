package org.dkazantsev.shopPractice.products.controllers.dto

data class UpdateProductRequest(
    val name: String,
    val price: Double,
    val description: String?,
)