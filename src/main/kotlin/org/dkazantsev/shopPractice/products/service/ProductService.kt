package org.dkazantsev.shopPractice.products.service

import org.dkazantsev.shopPractice.products.service.dto.CreateProductDto
import org.dkazantsev.shopPractice.products.service.dto.ProductListDto

interface ProductService {

    fun getAllProduct(): ProductListDto
    fun createProduct(createProductDto: CreateProductDto)

}