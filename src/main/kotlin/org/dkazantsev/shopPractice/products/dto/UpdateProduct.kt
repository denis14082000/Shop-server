package org.dkazantsev.shopPractice.products.dto

import java.util.UUID

data class UpdateProduct(
    val id: UUID,
    val price: Double,
    val name: String,
    val description: String?,
)
