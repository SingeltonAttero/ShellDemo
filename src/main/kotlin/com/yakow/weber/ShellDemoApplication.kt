package com.yakow.weber

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class ShellDemoApplication

fun main(args: Array<String>) {
	runApplication<ShellDemoApplication>(*args)
}
