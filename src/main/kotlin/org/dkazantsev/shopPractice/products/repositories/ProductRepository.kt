package org.dkazantsev.shopPractice.products.repositories

import org.dkazantsev.shopPractice.products.models.ProductEntity
import org.springframework.data.jpa.repository.JpaRepository

interface ProductRepository: JpaRepository<ProductEntity, Long>