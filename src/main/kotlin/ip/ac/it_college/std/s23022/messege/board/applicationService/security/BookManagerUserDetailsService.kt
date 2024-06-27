package ip.ac.it_college.std.s23022.messege.board.applicationService.security

import ip.ac.it_college.std.s23022.messege.board.applicationService.AuthenticationService
import ip.ac.it_college.std.s23022.messege.board.domain.model.User
import ip.ac.it_college.std.s23022.messege.board.domain.types.RoleType
import org.springframework.security.core.GrantedAuthority
import org.springframework.security.core.authority.AuthorityUtils
import org.springframework.security.core.userdetails.UserDetails
import org.springframework.security.core.userdetails.UserDetailsService
import org.springframework.security.core.userdetails.UsernameNotFoundException

class BookManagerUserDetailsService(
    private val authenticationService: AuthenticationService
) : UserDetailsService {
    override fun loadUserByUsername(username: String?): UserDetails {
        username ?: throw UsernameNotFoundException("メールアドレスが空です")

        val user = authenticationService.findUser(username)

            ?: throw UsernameNotFoundException("$username に該当するユーザはいません")
        return BookManagerUserDetails(user)
    }

    data class BookManagerUserDetails(
        val id: Long,
        val email: String,
        val pass: String,
        val roleType: RoleType
    ) : UserDetails {
        constructor(user: User) : this(user.id, user.email, user.password, user.roleType)

        override fun getAuthorities(): MutableCollection<out GrantedAuthority> {
            return AuthorityUtils.createAuthorityList(roleType.toString())
        }

        override fun getPassword(): String {
            return pass
        }

        override fun getUsername(): String {
            return email
        }
    }
}