package EventsProject.services;

import EventsProject.domainData.EventNew;
import EventsProject.domainData.EventSimple;
import EventsProject.repository.EventRepositoryInFile;
import org.springframework.stereotype.Service;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

@Service
public class RepositoryServiceClass {
    EventRepositoryInFile eventRepositoryInFile;

    public EventSimple getSingleEventSimpleById(Integer eventNewId) {
        EventSimple eventSimple = new EventSimple();

        for (Integer i = 0; i < eventRepositoryInFile.getEventsDB().size(); i++) {
            if (eventRepositoryInFile.getEventsDB().get(i).getId().equals(eventNewId)) {
                eventSimple = createSingleEventSimple(eventRepositoryInFile.getEventsDB().get(i));
            }
        }
        return eventSimple;
    }

    public EventSimple getSingleEventSimpleFromList(Integer pointer) {
        return  createSingleEventSimple(eventRepositoryInFile.getEventsDB().get(pointer));
    }

    private EventSimple createSingleEventSimple(EventNew eventNew) {
        EventSimple eventSimple = new EventSimple();
        eventSimple.setEventSimpleId(eventNew.getId());
        eventSimple.setEventSimpleName(eventNew.getName());
        eventSimple.setEventSimpleDescription(eventNew.getDescLong());

        String[] date = eventNew.getStartDate().split("T");
        eventSimple.setEventSimpleDate(date[0]);

        String time = date[1].substring(0, 8);
        eventSimple.setEventSimpleStartTime(time);
        eventSimple.setEventSimpleEndTime(time);
        eventSimple.setEventSimplePlace(eventNew.getPlace().getName());
        eventSimple.setEventSimpleTicketPrice(0.0);
        eventSimple.setEventSimpleWebPageAddress(eventNew.getUrls().getWww());
        return  eventSimple;

    }

    public List<EventSimple> getListOfEventSimple(Integer numberOfEventsOnThePage) {
        List<EventSimple> listOfEventSimple = new ArrayList<>();

        for (int i = 0; i < numberOfEventsOnThePage; i++) {
            listOfEventSimple.add(getSingleEventSimpleById(i));
        }
        return  listOfEventSimple;
    }
}
