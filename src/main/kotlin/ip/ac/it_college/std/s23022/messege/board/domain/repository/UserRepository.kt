package ip.ac.it_college.std.s23022.messege.board.domain.repository

import ip.ac.it_college.std.s23022.messege.board.domain.model.User

interface UserRepository {
    fun find(email: String): User?
    fun find(id: Long): User?
}