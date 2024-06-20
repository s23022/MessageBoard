package ip.ac.it_college.std.s23022.messege.board.service

import ip.ac.it_college.std.s23022.messege.board.repository.ThreadRepository
import org.springframework.stereotype.Service

@Service
class ThreadService(private val repository: ThreadRepository) {

    fun findAll(): List<Thread> = repository.findAll()

    fun save(thread: Thread): Thread = repository.save(thread)
}