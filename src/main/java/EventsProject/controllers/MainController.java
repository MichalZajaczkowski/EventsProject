package EventsProject.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping
public class MainController {

    @GetMapping("/")
    public String displayMainPackage(Model model) {
        return "index";
    }

    @GetMapping("/allevents")
    public String allevents() {
        return "allevents";
    }

    @GetMapping("/singleevent")
    public String singleevent() {
        return "singleevent";
    }
}
