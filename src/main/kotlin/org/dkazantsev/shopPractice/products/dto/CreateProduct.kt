package org.dkazantsev.shopPractice.products.dto

data class CreateProduct(
    val name: String,
    val price: Double,
    val description: String?,
)
