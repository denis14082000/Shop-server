package org.dkazantsev.shopPractice.user.repositories

import org.dkazantsev.shopPractice.user.exceptions.UserNotFoundException
import org.dkazantsev.shopPractice.user.models.UserEntity
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query
import java.util.UUID

interface UserRepository : JpaRepository<UserEntity, UUID> {

    @Query(
        """
            SELECT u
            FROM UserEntity u
            WHERE u.login = :login
        """
    )
    fun findByLoginOrNull(login: String): UserEntity?

}

fun UserRepository.findByLoginOrThrow(login: String): UserEntity {
    return findByLoginOrNull(login)
        ?: throw UserNotFoundException(login)
}
