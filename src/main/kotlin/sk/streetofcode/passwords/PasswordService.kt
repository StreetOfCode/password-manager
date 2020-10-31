package sk.streetofcode.passwords

import org.springframework.stereotype.Service

@Service
class PasswordService(var passwordRepository: PasswordRepository) {
    fun getAll() = passwordRepository.findAll().toList()

    fun add(username: String, password: String, url: String) =
        passwordRepository.save(PasswordModel(null, username, password, url))
}
