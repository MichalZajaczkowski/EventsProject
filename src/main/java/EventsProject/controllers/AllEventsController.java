package EventsProject.controllers;

import EventsProject.domainData.EventSimple;
import EventsProject.repository.EventRepositoryInFile;
import EventsProject.services.AppServiceClass;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class AllEventsController {
    AppServiceClass appServiceClass;
    EventRepositoryInFile eventRepositoryInFile;

    public AllEventsController(AppServiceClass appServiceClass, EventRepositoryInFile eventRepositoryInFile) {
        this.appServiceClass = appServiceClass;
        this.eventRepositoryInFile = eventRepositoryInFile;
    }

    @GetMapping("/allEvents")
    public String allEvents (Model model) {
        System.out.println("AllEvents");
        eventRepositoryInFile.readEventsFromGsonToList();

        List<EventSimple> listOfEventSimple = appServiceClass.getSimpleEventsList(20);
        System.out.println(listOfEventSimple.size());
        model.addAttribute("listOfEventSimple", listOfEventSimple);
        return "allEvents";
    }
}
