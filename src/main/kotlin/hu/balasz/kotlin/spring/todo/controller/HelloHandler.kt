package hu.balasz.kotlin.spring.todo.controller

import org.springframework.stereotype.Component
import org.springframework.web.reactive.function.BodyInserters.fromObject
import org.springframework.web.reactive.function.server.ServerRequest
import org.springframework.web.reactive.function.server.ServerResponse
import reactor.core.publisher.Mono

@Component
class HelloHandler {

    fun getHello(request: ServerRequest): Mono<ServerResponse> = ServerResponse.ok().body(fromObject("Hello"))
}