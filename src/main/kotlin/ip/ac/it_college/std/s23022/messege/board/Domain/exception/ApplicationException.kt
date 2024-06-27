package ip.ac.it_college.std.s23022.messege.board.Domain.exception

import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.ResponseStatus

@ResponseStatus(HttpStatus.NOT_FOUND)
class BookNotFoundException(override val message: String) : IllegalArgumentException()

@ResponseStatus(HttpStatus.CONFLICT)
class BookIdAlreadyUsedException(override val message: String) : Exception()

@ResponseStatus(HttpStatus.BAD_REQUEST)
class RentalStateException(override val message: String) : Exception()

@ResponseStatus(HttpStatus.CONFLICT)
class BookNotAvailableException(override val message: String) : Exception()