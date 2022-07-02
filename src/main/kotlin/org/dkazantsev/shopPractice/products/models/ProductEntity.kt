package org.dkazantsev.shopPractice.products.models

import javax.persistence.*

@Entity
@Table(name = "product")
class ProductEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null

    @Column(name = "name", nullable = false)
    lateinit var name: String

    @Column(name = "price", nullable = false)
    var price: Double = 0.0

}