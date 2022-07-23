package org.dkazantsev.shopPractice.products.controllers.dto

import java.util.UUID

data class ProductElem(
    val id: UUID,
    val name: String,
    val price: Double,
    val description: String?,
)
