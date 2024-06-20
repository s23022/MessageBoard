package ip.ac.it_college.std.s23022.messege.board.application.service

import ip.ac.it_college.std.s23022.messege.board.Domain.model.User
import ip.ac.it_college.std.s23022.messege.board.Domain.repository.UserRepository
import org.springframework.stereotype.Service


@Service
class AuthenticationService(
    private val userRepository: UserRepository
) {
    fun findUser(email: String): User? {
        return userRepository.find(email)
    }
}