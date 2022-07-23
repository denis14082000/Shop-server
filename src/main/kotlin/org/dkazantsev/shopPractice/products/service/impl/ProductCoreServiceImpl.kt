package org.dkazantsev.shopPractice.products.service.impl

import org.dkazantsev.shopPractice.products.models.ProductEntity
import org.dkazantsev.shopPractice.products.repositories.ProductRepository
import org.dkazantsev.shopPractice.products.service.ProductCoreService
import org.dkazantsev.shopPractice.products.dto.CreateProduct
import org.dkazantsev.shopPractice.products.dto.UpdateProduct
import org.dkazantsev.shopPractice.products.repositories.findByPublicIdOrThrow
import org.dkazantsev.shopPractice.products.service.dto.Product
import org.dkazantsev.shopPractice.products.service.dto.ProductList
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
open class ProductCoreServiceImpl(
    private val productRepository: ProductRepository
): ProductCoreService {

    @Transactional(readOnly = true)
    override fun getAll(): ProductList {
        val productList = productRepository.findAll()

        return ProductList(
            productList = productList.map {product ->
                Product(
                    id = product.publicId,
                    name = product.name,
                    price = product.price,
                    description = product.description
                )
            }
        )
    }

    @Transactional
    override fun create(createProduct: CreateProduct) {
        productRepository.save(
            ProductEntity().apply {
                name = createProduct.name
                price = createProduct.price
                description = createProduct.description
            }
        )
    }

    @Transactional
    override fun update(updateProduct: UpdateProduct) {
        val product = productRepository.findByPublicIdOrThrow(updateProduct.id)

        productRepository.save(
            product.apply {
                this.name = updateProduct.name
                this.price = updateProduct.price
                this.description = updateProduct.description
            }
        )
    }

}