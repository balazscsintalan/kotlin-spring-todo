package hu.balasz.kotlin.spring.todo.domain

import javax.persistence.Entity

@Entity
data class Todo(
        val text: String
): BaseEntity()