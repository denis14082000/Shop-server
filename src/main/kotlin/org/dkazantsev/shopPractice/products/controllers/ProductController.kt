package org.dkazantsev.shopPractice.products.controllers

import io.jsonwebtoken.Jwts
import org.dkazantsev.shopPractice.products.controllers.dto.CreateProductRequest
import org.dkazantsev.shopPractice.products.controllers.dto.ProductElem
import org.dkazantsev.shopPractice.products.controllers.dto.ProductListResponse
import org.dkazantsev.shopPractice.products.service.ProductService
import org.dkazantsev.shopPractice.products.service.dto.CreateProductDto
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/product")
class ProductController(
    private val productService: ProductService
) {

    @GetMapping()
    fun getAllProducts(): ProductListResponse {
        val listProduct = productService.getAllProduct()

        return ProductListResponse(
            product = listProduct.productList.map { product ->
                ProductElem(
                    id = product.id,
                    name = product.name,
                    price = product.price
                )
            }
        )
    }

    @PostMapping()
    fun createProduct(
        @RequestBody
        createProductRequest: CreateProductRequest
    ) {
        productService.createProduct(
            createProductDto = CreateProductDto(
                name = createProductRequest.name,
                price = createProductRequest.price
            )
        )
    }

}