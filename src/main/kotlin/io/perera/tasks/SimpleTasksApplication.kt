package io.perera.tasks

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SimpleTasksApplication

fun main(args: Array<String>) {
	runApplication<SimpleTasksApplication>(*args)
}
