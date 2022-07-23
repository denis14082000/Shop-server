package org.dkazantsev.shopPractice.products.service.dto

import java.util.UUID

data class Product(
    val id: UUID,
    val name: String,
    val price: Double,
    val description: String?,
)
