package org.dkazantsev.shopPractice.products.repositories

import org.dkazantsev.shopPractice.products.exceptions.ProductNotFoundException
import org.dkazantsev.shopPractice.products.models.ProductEntity
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query
import java.util.UUID

interface ProductRepository: JpaRepository<ProductEntity, Long> {
    @Query("""
        SELECT p
        FROM ProductEntity p
        WHERE p.publicId = :publicId
    """)
    fun findByPublicIdOrNull(publicId: UUID): ProductEntity?

}

fun ProductRepository.findByPublicIdOrThrow(publicId: UUID): ProductEntity {
    return findByPublicIdOrNull(publicId) ?: throw ProductNotFoundException(publicId)
}