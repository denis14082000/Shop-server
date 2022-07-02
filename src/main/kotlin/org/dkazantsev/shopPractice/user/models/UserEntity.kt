package org.dkazantsev.shopPractice.user.models

import java.util.UUID
import javax.persistence.*

@Entity
@Table(name = "users")
class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    lateinit var id: UUID

    @Column(name = "name", nullable = false)
    lateinit var name: String

    @Column(name = "login", nullable = false, unique = true)
    lateinit var login: String

    @Column(name = "password", nullable = false)
    lateinit var password: String //TODO(ADD ENCODING)

}