package sk.streetofcode.passwords

import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/passwords")
class PasswordController(
    var passwordService: PasswordService,
    private val passwords: MutableList<String> = mutableListOf()
) {
    @GetMapping("")
    fun get() = passwordService.getAll()

    @PostMapping("")
    fun add(@RequestBody request: AddPasswordRequest) =
        passwordService.add(request)
}
