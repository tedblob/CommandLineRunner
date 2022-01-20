package com.tedblob.kotlin.commandlinerunner

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
open class CommandLineRunnerApplication: CommandLineRunner {
	override fun run(vararg args: String?) {
		println("Non web app")
	}
}

fun main(args: Array<String>) {
	runApplication<CommandLineRunnerApplication>(*args)
}
