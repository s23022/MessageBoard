package ip.ac.it_college.std.s23022.messege.board.Domain.model

import ip.ac.it_college.std.s23022.messege.board.Domain.types.RoleType


data class User(
    val id: Long,
    val email: String,
    val password: String,
    val name: String,
    val roleType: RoleType
)