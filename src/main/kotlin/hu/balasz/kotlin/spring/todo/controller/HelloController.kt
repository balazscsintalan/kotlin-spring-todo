package hu.balasz.kotlin.spring.todo.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class HelloController {

    @GetMapping(path = ["/hello"])
    fun getHello() = "Hello"
}