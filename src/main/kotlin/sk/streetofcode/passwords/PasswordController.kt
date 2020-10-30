package sk.streetofcode.passwords

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/passwords")
class PasswordController {
    @GetMapping("")
    fun get(): String {
        return "It works!"
    }
}
