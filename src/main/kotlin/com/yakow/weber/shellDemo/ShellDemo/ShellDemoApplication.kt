package com.yakow.weber.shellDemo.ShellDemo

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class ShellDemoApplication

fun main(args: Array<String>) {
	runApplication<ShellDemoApplication>(*args)
}
