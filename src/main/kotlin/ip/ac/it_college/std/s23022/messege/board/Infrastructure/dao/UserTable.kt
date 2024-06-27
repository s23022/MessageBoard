package ip.ac.it_college.std.s23022.messege.board.Infrastructure.dao

import ip.ac.it_college.std.s23022.messege.board.Domain.Types.RoleType
import org.jetbrains.exposed.dao.id.LongIdTable

object UserTable : LongIdTable("users") {
    val email = varchar("email", 256).uniqueIndex()
    val password = varchar("password", 128)
    val view_name = varchar("view_name", 32)
    val roleType = enumerationByName("role_Type", 5, RoleType::class)
}