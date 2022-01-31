package EventsProject.services;

import EventsProject.domainData.Event;
import EventsProject.domainData.EventSimple;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AppServiceClass {
    RepositoryServiceClass repositoryServiceClass;

    public AppServiceClass(RepositoryServiceClass repositoryServiceClass) {
        this.repositoryServiceClass = repositoryServiceClass;
    }

    public List<EventSimple> getSimpleEventsList(int numberOfEventsOnThePage) {
        return  repositoryServiceClass.getListOfEventSimple(numberOfEventsOnThePage);
    }
}
