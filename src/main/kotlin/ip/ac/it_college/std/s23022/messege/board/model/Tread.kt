package ip.ac.it_college.std.s23022.messege.board.model

import org.springframework.boot.autoconfigure.domain.EntityScan
import org.springframework.data.annotation.Id

@EntityScan
data class Thread(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null,
    val title: String,
    val content: String,
    val lastUpdated: Long = System.currentTimeMillis()
)