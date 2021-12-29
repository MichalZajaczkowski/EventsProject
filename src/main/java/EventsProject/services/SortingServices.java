package EventsProject.services;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;

@Service
public class SortingServices {

    @PostMapping("/sortEventsDirection")
    public String sortingDirection() {
        return "allEvents";
    }

    @PostMapping("/sortEventsData")
    public String sortEventsData() {
        return "allEvents";
    }


}
