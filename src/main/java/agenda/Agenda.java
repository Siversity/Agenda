package agenda;

import java.time.LocalDate;
import java.util.*;

/**
 * Description : An agenda that stores events
 */
public class Agenda {
    
    // Attributs
    private TreeSet<Event> monAgenda;
    
    
    // Constructeur
    public Agenda() {
        monAgenda = new TreeSet<>();
    }
    
    public void addEvent(Event e) {
        monAgenda.add(e);
    }

    /**
     * Computes the events that occur on a given day
     *
     * @param day the day toi test
     * @return and iteraror to the events that occur on that day
     */
    public ArrayList<Event> eventsInDay(LocalDate day) {
        ArrayList<Event> maListe = new ArrayList<>();
        for (Event e : monAgenda) {
            if (e.getStart().equals(day)) {
                maListe.add(e);
            }
        }
        return maListe;
    }
}
