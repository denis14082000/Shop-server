package org.dkazantsev.shopPractice.products.controllers

import org.dkazantsev.shopPractice.products.controllers.dto.*
import org.dkazantsev.shopPractice.products.service.ProductCoreService
import org.dkazantsev.shopPractice.products.dto.CreateProduct
import org.dkazantsev.shopPractice.products.dto.UpdateProduct
import org.springframework.web.bind.annotation.CrossOrigin
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import java.net.URL
import java.util.UUID

@RestController
@RequestMapping("/product")
class ProductController(
    private val productCoreService: ProductCoreService
) {

    @GetMapping
    @CrossOrigin(origins = ["http://localhost:3000"])
    fun getAllProducts(): ProductListResponse {
        val listProduct = productCoreService.getAll()

        return ProductListResponse(
            products = listProduct.productList.map { product ->
                ProductElem(
                    id = product.id,
                    name = product.name,
                    price = product.price,
                    imageUrl = product.imageUrl,
                    description = product.description
                )
            }
        )
    }

    @GetMapping("/{id}")
    @CrossOrigin(origins = ["http://localhost:3000"])
    fun getProduct(
        @PathVariable
        id: UUID,
    ): GetProductResponse {
        val product = productCoreService.get(id)

        return GetProductResponse(
            name = product.name,
            price = product.price,
            description = product.description
        )
    }

    @PostMapping()
    @CrossOrigin(origins = ["http://localhost:3000"])
    fun createProduct(
        @RequestBody
        createProductRequest: CreateProductRequest
    ) {
        productCoreService.create(
            createProduct = CreateProduct(
                name = createProductRequest.name,
                price = createProductRequest.price,
                description = createProductRequest.description,
            )
        )
    }

    @PutMapping("/{id}")
    @CrossOrigin(origins = ["http://localhost:3000"])
    fun updateProduct(
        @PathVariable(name = "id")
        id: UUID,
        @RequestBody
        updateProductRequest: UpdateProductRequest,
    ) {
        productCoreService.update(
            UpdateProduct(
                id = id,
                name = updateProductRequest.name,
                price = updateProductRequest.price,
                description = updateProductRequest.description,
            )
        )
    }

}