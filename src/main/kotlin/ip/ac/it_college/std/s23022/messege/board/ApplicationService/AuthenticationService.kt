package ip.ac.it_college.std.s23022.messege.board.ApplicationService

import ip.ac.it_college.std.s23022.messege.board.Domain.Model.User
import ip.ac.it_college.std.s23022.messege.board.Domain.Repository.UserRepository
import org.springframework.stereotype.Service

@Service
class AuthenticationService(
    private val userRepository: UserRepository
) {
    fun findUser(email: String): User? {
        return userRepository.find(email)
    }
}