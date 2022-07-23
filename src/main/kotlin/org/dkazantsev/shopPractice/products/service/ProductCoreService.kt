package org.dkazantsev.shopPractice.products.service

import org.dkazantsev.shopPractice.products.dto.CreateProduct
import org.dkazantsev.shopPractice.products.dto.UpdateProduct
import org.dkazantsev.shopPractice.products.service.dto.ProductList

interface ProductCoreService {

    fun getAll(): ProductList
    fun create(createProduct: CreateProduct)
    fun update(updateProduct: UpdateProduct)

}