package sk.streetofcode.passwords

import javax.persistence.*

@Entity
@Table(name = "passwords")
class PasswordModel(
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    var id: Long? = null,

    var username: String,
    var password: String,
    var url: String
) {
    constructor() : this(null, "", "", "")
}
