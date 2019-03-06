package hu.balasz.kotlin.spring.todo.domain

import javax.persistence.GeneratedValue
import javax.persistence.Id
import javax.persistence.MappedSuperclass

@MappedSuperclass
abstract class BaseEntity {
    @Id
    @GeneratedValue
    val id: Long? = null
}
