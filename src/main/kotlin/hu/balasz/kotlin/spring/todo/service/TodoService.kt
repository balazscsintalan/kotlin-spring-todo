package hu.balasz.kotlin.spring.todo.service

import hu.balasz.kotlin.spring.todo.domain.Todo
import hu.balasz.kotlin.spring.todo.model.SaveTodoRequest
import hu.balasz.kotlin.spring.todo.repository.TodoRepository
import org.springframework.stereotype.Service
import org.springframework.web.reactive.function.server.ServerRequest
import org.springframework.web.reactive.function.server.ServerResponse
import reactor.core.publisher.Mono

@Service
class TodoService(private val todoRepository: TodoRepository) {
    fun saveTodo(request: ServerRequest): Mono<ServerResponse> {
        return request
                .bodyToMono(SaveTodoRequest::class.java)
                .map {
                    Todo(it.text)
                }
                .flatMap {
                    todoRepository.save(it)
                    ServerResponse.noContent().build()
                }
    }
}