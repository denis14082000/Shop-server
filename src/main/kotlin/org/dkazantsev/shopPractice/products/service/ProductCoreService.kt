package org.dkazantsev.shopPractice.products.service

import org.dkazantsev.shopPractice.products.dto.CreateProduct
import org.dkazantsev.shopPractice.products.dto.UpdateProduct
import org.dkazantsev.shopPractice.products.service.dto.Product
import org.dkazantsev.shopPractice.products.service.dto.ProductList
import java.util.UUID

interface ProductCoreService {

    fun getAll(): ProductList
    fun get(id: UUID): Product
    fun create(createProduct: CreateProduct)
    fun update(updateProduct: UpdateProduct)

}