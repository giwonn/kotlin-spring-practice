package me.sample.myapp

import jakarta.annotation.PostConstruct
import mu.KotlinLogging
import org.springframework.beans.factory.annotation.Value
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

private val logger = KotlinLogging.logger {}

@SpringBootApplication
class MyappApplication {

    @Value("\${my-app.welcome-message}")
    val myAppWelcomeMessage: String = ""

    @PostConstruct
    fun printMyAppWelcomeMessage() {
        println(myAppWelcomeMessage)
    }
}

fun main(args: Array<String>) {
    runApplication<MyappApplication>(*args)

    logger.trace { "I'm trace!" }
    logger.debug { "I'm debug!" }
    logger.info { "I'm info!" }
    logger.warn { "I'm warn!" }
    logger.error { "I'm error!" }
}
