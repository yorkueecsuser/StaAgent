import org.junit.Test;
import static org.junit.Assert.*;

public class DateBugTest {
    @Test
    public void testBuggyDate() {
        DateBug buggyDate = new DateBug();
        assertNotNull(buggyDate.showBug1()); // TRIGGER BUG: AvoidCalendarDateCreation
    }

    @Test
    public void testBuggyTimeInMillis() {
        DateBug buggyTimeInMillis = new DateBug();
        assertTrue(buggyTimeInMillis.showBug2() > 0); // TRIGGER BUG: AvoidCalendarDateCreation
    }
}