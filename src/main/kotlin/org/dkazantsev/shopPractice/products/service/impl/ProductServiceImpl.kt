package org.dkazantsev.shopPractice.products.service.impl

import org.dkazantsev.shopPractice.products.models.Product
import org.dkazantsev.shopPractice.products.repositories.ProductRepository
import org.dkazantsev.shopPractice.products.service.ProductService
import org.dkazantsev.shopPractice.products.service.dto.CreateProductDto
import org.dkazantsev.shopPractice.products.service.dto.ProductDto
import org.dkazantsev.shopPractice.products.service.dto.ProductListDto
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
open class ProductServiceImpl(
    private val productRepository: ProductRepository
): ProductService {

    @Transactional(readOnly = true)
    override fun getAllProduct(): ProductListDto {
        val productList = productRepository.findAll()

        return ProductListDto(
            productList = productList.map {product ->
                ProductDto(
                    id = product.id!!,
                    name = product.name,
                    price = product.price!!,
                )
            }
        )
    }

    @Transactional
    override fun createProduct(createProductDto: CreateProductDto) {
        productRepository.save(
            Product().apply {
                name = createProductDto.name
                price = createProductDto.price
            }
        )
    }

}