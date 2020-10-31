package sk.streetofcode.passwords

import org.springframework.stereotype.Service

@Service
class PasswordService(var passwordRepository: PasswordRepository) {
    fun getAll() = passwordRepository.findAll().toList()

    fun add(request: AddPasswordRequest): PasswordModel {
        val (username, password, url) = request
        return passwordRepository.save(PasswordModel(null, username, password, url))
    }
}
