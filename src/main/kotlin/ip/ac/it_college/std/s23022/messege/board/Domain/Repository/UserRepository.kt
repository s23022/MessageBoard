package ip.ac.it_college.std.s23022.messege.board.Domain.Repository

import ip.ac.it_college.std.s23022.messege.board.Domain.Model.User

interface UserRepository {
    fun find(email: String): User?
    fun find(id: Long): User?
}