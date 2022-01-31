package EventsProject.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class SingleEventController {

    @PostMapping("/singleEvent")
    public String singleEvent () {
        return "singleEvent";
    }

    @PostMapping("/toggleFavourite")
    public String toggleFavourite () {
        return "toggleFavourite";
    }
}
