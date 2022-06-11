package org.dkazantsev.shopPractice.products.controllers.dto

data class CreateProductRequest(
    val name: String,
    val price: Double,
)