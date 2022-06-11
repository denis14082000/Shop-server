package org.dkazantsev.shopPractice.products.models

import javax.persistence.*
import kotlin.properties.Delegates

@Entity
@Table(name = "Product")
class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null

    lateinit var name: String

    var price: Double? = null

}