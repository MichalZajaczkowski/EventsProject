package EventsProject.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping
public class FavouritesController implements ControllerEntity{

    @GetMapping("favourites")
    public String displayPage() {
        return "favourites/index";
    }

    @PostMapping("/favouritesAdd")
    public String favouritesAdd () {
        return "favourites";
    }

    @PostMapping("/favouritesRemove")
    public String favouritesRemove () {
        return "favourites";
    }
}
