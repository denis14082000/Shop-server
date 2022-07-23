package org.dkazantsev.shopPractice.products.converters

import org.dkazantsev.shopPractice.products.models.ProductEntity
import org.dkazantsev.shopPractice.products.service.dto.Product
import java.net.URL

fun ProductEntity.toProduct(): Product {
    return Product(
        id = this.publicId,
        name = this.name,
        price = this.price,
        description = this.description,
        imageUrl = URL(this.imageUrl),
    )
}