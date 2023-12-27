package src.tests;
import src.classes.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class WorkoutTest {

    @Test
    void testGetTitle() {
        Workout w = new Workout("Leg Day", "lift");
        assertEquals(w.getTitle(), "Leg Day");
    }

    @Test
    void testGetSport() {
        Workout w = new Workout("Leg Day", "lift");
        assertEquals(w.getSport(), "lift");
    }

    @Test
    void testGetDay() {
        Workout w = new Workout("Leg Day", "lift");
        assertEquals(w.getDay(), LocalDate.now());
    }

    /* I need to fix this one - I just put today's date
    as a placeholder */
    @Test
    void testToString() {
        Workout w = new Workout("Leg Day", "lift");
        assertEquals(w.toString(), w.getTitle() + "\nSport: " + w.getSport() + "\n" + "December 26, 2023");
    }
}
