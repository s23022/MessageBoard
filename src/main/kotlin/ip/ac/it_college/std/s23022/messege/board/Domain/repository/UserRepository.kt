package ip.ac.it_college.std.s23022.messege.board.Domain.repository

import ip.ac.it_college.std.s23022.messege.board.Domain.model.User

interface UserRepository {
    fun find(email: String): User?
    fun find(id: Long): User?
}