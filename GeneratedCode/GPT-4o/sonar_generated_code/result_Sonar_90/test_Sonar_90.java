import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Calendar;

public class StaticNonThreadSafeExampleTest {

    @Test
    public void testCalendarThreadSafety() {
        StaticNonThreadSafeExample instance1 = new StaticNonThreadSafeExample();
        StaticNonThreadSafeExample instance2 = new StaticNonThreadSafeExample();

        Thread thread1 = new Thread(() -> {
            instance1.updateCalendar(2023, Calendar.JANUARY, 1);
        });

        Thread thread2 = new Thread(() -> {
            instance2.updateCalendar(2024, Calendar.FEBRUARY, 2);
        });

        thread1.start(); // TRIGGER BUG: Non-thread-safe fields should not be static
        thread2.start(); // TRIGGER BUG: Non-thread-safe fields should not be static
        
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            fail("Threads were interrupted");
        }

        Calendar resultCalendar = instance1.showBug(); // TRIGGER BUG: Non-thread-safe fields should not be static
        assertNotEquals("Calendar should not reflect updates from both threads.", 2023, resultCalendar.get(Calendar.YEAR));
        assertNotEquals("Calendar should not reflect updates from both threads.", 2024, resultCalendar.get(Calendar.YEAR));
    }
}