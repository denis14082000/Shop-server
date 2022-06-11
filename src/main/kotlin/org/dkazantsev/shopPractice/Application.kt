package org.dkazantsev.shopPractice

import org.springframework.boot.SpringBootConfiguration
import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.autoconfigure.domain.EntityScan
import org.springframework.boot.runApplication
import org.springframework.context.annotation.ComponentScan
import org.springframework.data.jpa.repository.config.EnableJpaRepositories
import org.springframework.transaction.annotation.EnableTransactionManagement

@SpringBootApplication
@EnableJpaRepositories(basePackages=["org.dkazantsev.shopPractice"])
@EnableTransactionManagement
@EntityScan(basePackages=["org.dkazantsev.shopPractice"])
open class Application

fun main() {
    runApplication<Application>()
}