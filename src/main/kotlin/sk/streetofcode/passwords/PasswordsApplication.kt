package sk.streetofcode.passwords

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class PasswordsApplication

fun main(args: Array<String>) {
	runApplication<PasswordsApplication>(*args)
}
