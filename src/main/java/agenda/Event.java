package agenda;

import java.time.*;

public class Event implements Comparable<Event> {

    /**
     * The myTitle of this event
     */
    private String myTitle;
    
    /**
     * The starting time of the event
     */
    private LocalDateTime myStart;

    /**
     * The durarion of the event 
     */
    private Duration myDuration;


    /**
     * Constructs an event
     *
     * @param title the title of this event
     * @param start the start time of this event
     * @param duration the duration of this event
     */
    public Event(String title, LocalDateTime start, Duration duration) {
        this.myTitle = title;
        this.myStart = start;
        this.myDuration = duration;
    }

    /**
     * Tests if an event occurs on a given day
     * @param aDay the day to test
     * @return true if the event occurs on that day, false otherwise
     */
    public boolean isInDay(LocalDate aDay) {
        LocalDate myEnd = this.myStart.plus(myDuration).toLocalDate();
        // si même jour et même année
        return aDay.isEqual(this.myStart.toLocalDate()) || (aDay.isAfter(this.myStart.toLocalDate()) && aDay.isBefore(myEnd) || aDay.isEqual(myEnd));
    }
   
    /**
     * @return the myTitle
     */
    public String getTitle() {
        return myTitle;
    }

    /**
     * @return the myStart
     */
    public LocalDateTime getStart() {
        return myStart;
    }


    /**
     * @return the myDuration
     */
    public Duration getDuration() {
        return myDuration;
    }

    @Override
    public String toString() {
        return myTitle;
    }
    
    
    @Override
    public int compareTo(Event e) {
        int ret = 0;
        if (this.myStart.compareTo(e.getStart()) < 0) {
            ret = -1;
        }
        if (this.myStart.compareTo(e.getStart()) > 0) {
            ret = 1;
        }
        if (this.myStart.compareTo(e.getStart()) == 0) {
            ret = 0;
        }
        return ret;
    }
   
    
}
