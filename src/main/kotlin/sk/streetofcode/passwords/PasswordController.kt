package sk.streetofcode.passwords

import org.slf4j.LoggerFactory
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/passwords")
class PasswordController(
    var passwordService: PasswordService,
    private val passwords: MutableList<String> = mutableListOf()
) {
    companion object {
        val logger = LoggerFactory.getLogger(PasswordController::class.java)
    }

    @GetMapping("")
    fun get(): List<PasswordModel> {
        logger.info("Getting passwords.")
        return passwordService.getAll()
    }

    @PostMapping("")
    fun add(@RequestBody request: AddPasswordRequest): PasswordModel {
        logger.info("Adding password.")
        return passwordService.add(request)
    }
}
