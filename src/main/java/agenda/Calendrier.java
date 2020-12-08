/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agenda;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.LocalTime;

/**
 *
 * @author Stéphane
 */
public class Calendrier {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Duration d1 = new Duration(12, 1);
        
        Agenda a = new Agenda();
        Event e1 = new Event("Aniiversaire 1", LocalDateTime.of(2020, 08 , 12), Duration.ofMinutes(120));
        
        Event e2 = new Event("RDV 2", LocalDateTime.of(2020, 08, 13, 22, 30), Duration.ofMinutes(60));
        
        
        a.addEvent(e1);
        a.addEvent(e2);
        
        
    }
    
}
