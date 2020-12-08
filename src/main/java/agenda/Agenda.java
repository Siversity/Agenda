package agenda;

import java.time.LocalDate;
import java.util.*;

/**
 * Description : An agenda that stores events
 */
public class Agenda {
    
    // Attributs
    private TreeSet<Event> myAgenda;
    
    
    // Constructeur
    public Agenda() {
        myAgenda = new TreeSet<>();
    }
    
    public void addEvent(Event e) {
        myAgenda.add(e);
    }

    /**
     * Computes the events that occur on a given day
     *
     * @param day the day toi test
     * @return and iteraror to the events that occur on that day
     */
    public ArrayList<Event> eventsInDay(LocalDate day) {
        ArrayList<Event> myList = new ArrayList<>();
        for (Event e : myAgenda) {
            if (e.isInDay(day)) {
                myList.add(e);
            }
        }
        return myList;
    }
}
