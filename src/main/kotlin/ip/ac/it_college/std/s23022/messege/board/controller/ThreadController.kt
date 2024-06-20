package ip.ac.it_college.std.s23022.messege.board.controller

import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/threads")
class ThreadController(private val threadService: ThreadService) {

    @GetMapping
    fun getAllThreads(): List<Thread> = threadService.findAll()

    @PostMapping
    fun createThread(@RequestBody thread: Thread): Thread = threadService.save(thread)
}