package sk.streetofcode.passwords

import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface PasswordRepository: CrudRepository<PasswordModel, Long> {
}
