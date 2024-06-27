package ip.ac.it_college.std.s23022.messege.board.Presentation.Controller

import ch.qos.logback.core.model.Model
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping


@Controller
@RequestMapping("/login")
class LoginController {

    @GetMapping
    fun showLoginForm(model: Model): String {
        // ログイン画面へ遷移。
        return "Login"
    }
}