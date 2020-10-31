package sk.streetofcode.passwords

import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/passwords")
class PasswordController(
    private val passwords: MutableList<String> = mutableListOf()
) {
    @GetMapping("")
    fun get(): List<String> {
        return passwords
    }

    @PostMapping("")
    fun post(@RequestBody password: String) {
        passwords.add(password)
    }
}
