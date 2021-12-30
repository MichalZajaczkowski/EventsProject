package EventsProject.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping
public class MainController implements ControllerEntity{

    @GetMapping("/")
    public String displayPage() {
        return "index";
    }

    @GetMapping("/allevents")
    public String allevents () {
        return "allevents";
    }

}
