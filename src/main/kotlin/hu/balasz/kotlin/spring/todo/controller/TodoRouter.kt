package hu.balasz.kotlin.spring.todo.controller

import hu.balasz.kotlin.spring.todo.service.TodoService
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.web.reactive.function.server.router

@Configuration
class TodoRouter(private val service: TodoService) {

    @Bean
    fun todoRoute() = router {
        ("/todo").nest {
            POST("/", service::saveTodo)
        }
    }
}