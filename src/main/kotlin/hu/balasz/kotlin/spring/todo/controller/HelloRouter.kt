package hu.balasz.kotlin.spring.todo.controller

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.web.reactive.function.server.router

@Configuration
class HelloRouter(private val handler: HelloHandler) {

    @Bean
    fun helloRoute() = router {
        ("/router").nest {
            GET("/hello", handler::getHello)
        }
    }
}