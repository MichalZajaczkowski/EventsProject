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

//TODO: przesunac do wlasciwego kontrolera!!!
    @GetMapping("/allevents")
    public String allevents () {
        return "allevents";
    }
//TODO: przesunac do wlasciwego kontrolera!!!
    @GetMapping("/singleevent")
    public String singleevent () {
        return "singleevent";
    }
//TODO: przesunac do wlasciwego kontrolera!!!

    @GetMapping("/login")
    public String login () {
        return "login";
    }


}
