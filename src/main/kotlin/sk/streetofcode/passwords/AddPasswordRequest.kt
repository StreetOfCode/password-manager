package sk.streetofcode.passwords

data class AddPasswordRequest(
    val username: String,
    val password: String,
    val url: String
)
