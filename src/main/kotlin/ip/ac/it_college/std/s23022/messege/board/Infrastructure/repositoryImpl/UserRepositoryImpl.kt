package ip.ac.it_college.std.s23022.messege.board.Infrastructure.repositoryImpl

import ip.ac.it_college.std.s23022.messege.board.domain.model.User
import ip.ac.it_college.std.s23022.messege.board.domain.repository.UserRepository
import ip.ac.it_college.std.s23022.messege.board.Infrastructure.dao.UserEntity
import ip.ac.it_college.std.s23022.messege.board.Infrastructure.dao.UserTable
import org.jetbrains.exposed.sql.transactions.transaction
import org.springframework.stereotype.Repository

@Repository
class UserRepositoryImpl : UserRepository {
    override fun find(email: String): User? {
        return transaction {
            val entity = UserEntity.find {
                UserTable.email eq email
            }.singleOrNull()
            entity?.let(::toModel)
        }
    }

    override fun find(id: Long): User? {
        return transaction {
            val entity = UserEntity.findById(id)
            entity?.let (::toModel)
        }
    }

    private fun toModel(user: UserEntity) = User(
        id = user.id.value,
        email = user.email,
        password = user.password,
        name  = user.name,
        roleType = user.roleType
    )
}