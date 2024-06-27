package ip.ac.it_college.std.s23022.messege.board.applicationService

import ip.ac.it_college.std.s23022.messege.board.domain.model.User
import ip.ac.it_college.std.s23022.messege.board.domain.repository.UserRepository
import org.springframework.stereotype.Service

@Service
class AuthenticationService(
    private val userRepository: UserRepository
) {
    fun findUser(email: String): User? {
        return userRepository.find(email)
    }
}