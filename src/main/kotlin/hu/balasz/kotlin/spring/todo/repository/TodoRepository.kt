package hu.balasz.kotlin.spring.todo.repository

import hu.balasz.kotlin.spring.todo.domain.Todo
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface TodoRepository: CrudRepository<Todo, Long>