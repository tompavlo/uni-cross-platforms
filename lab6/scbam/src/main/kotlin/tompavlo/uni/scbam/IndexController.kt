package tompavlo.uni.scbam

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping
import java.time.LocalTime

@Controller
class IndexController {
    @GetMapping("/")
    fun index(model: Model): String {
        val person = Person("my Lord")
        val time = LocalTime.now()

        model.addAttribute("person", person)
        model.addAttribute("time", time)
        return "index"
    }
}