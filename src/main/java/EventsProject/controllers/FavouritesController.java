package EventsProject.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FavouritesController {

    @GetMapping("/favourites")
    public String favourites () {
        return "favourites";
    }
}
