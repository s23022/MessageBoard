package ip.ac.it_college.std.s23022.messege.board.Domain.Model

import ip.ac.it_college.std.s23022.messege.board.Domain.Types.RoleType

data class User(
    val id: Long,
    val name: String,
    val email: String,
    val password: String,
    val roleType: RoleType
)