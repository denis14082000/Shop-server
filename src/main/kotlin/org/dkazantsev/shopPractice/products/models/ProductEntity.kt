package org.dkazantsev.shopPractice.products.models

import java.util.UUID
import javax.persistence.*

@Entity
@Table(name = "product")
class ProductEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null

    @Column(name = "public_id", nullable = false)
    lateinit var publicId: UUID

    @Column(name = "name", nullable = false)
    lateinit var name: String

    @Column(name = "price", nullable = false)
    var price: Double = 0.0

    @Column(name = "image_url", nullable = true)
    var imageUrl: String? = null

    @Column(name = "description", nullable = true)
    var description: String? = null

}