package EventsProject.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping
<<<<<<<< HEAD:src/main/java/EventsProject/controllers/EventsController.java
public class EventsController implements ControllerEntity{
========
public class MainController {
>>>>>>>> DevTest:src/main/java/EventsProject/controllers/MainController.java

    @GetMapping("/events")
    public String displayPage() {
        return "events/index";
    }
}
