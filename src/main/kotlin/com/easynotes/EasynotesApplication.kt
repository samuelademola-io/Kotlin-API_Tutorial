package com.easynotes

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class EasynotesApplication

fun main(args: Array<String>) {
	runApplication<EasynotesApplication>(*args)
}
