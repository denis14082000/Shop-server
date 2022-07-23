package org.dkazantsev.shopPractice.products.service.impl

import org.dkazantsev.shopPractice.products.converters.toProduct
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
import java.util.*

@Service
open class ProductCoreServiceImpl(
    private val productRepository: ProductRepository
): ProductCoreService {

    @Transactional(readOnly = true)
    override fun getAll(): ProductList {
        val productList = productRepository.findAll()

        return ProductList(
            productList = productList.map(ProductEntity::toProduct)
        )
    }

    @Transactional(readOnly = true)
    override fun get(id: UUID): Product {
        return productRepository.findByPublicIdOrThrow(id)
            .toProduct()
    }

    @Transactional
    override fun create(createProduct: CreateProduct) {
        val publicId = UUID.randomUUID()

        productRepository.save(
            ProductEntity().apply {
                this.name = createProduct.name
                this.publicId = publicId
                this.price = createProduct.price
                this.description = createProduct.description
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