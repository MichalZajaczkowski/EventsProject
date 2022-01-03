package EventsProject.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class RegisterController {

    @GetMapping("/register")
    public String register (Model model) {
        return "register";
    }

    @PostMapping("/registerSubmite")
    public String registerSubmite () {
        return "main";
    }
}
