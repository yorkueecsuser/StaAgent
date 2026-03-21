import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Date;
import java.util.Calendar;

public class InvalidDateValueBugTest {
    @Test
    public void testShowBug1() {
        InvalidDateValueBug bugClass = new InvalidDateValueBug();
        Date d = bugClass.showBug1();
        assertNotEquals(2014, d.getYear()); // TRIGGER BUG: Invalid "Date" values should not be used
    }

    @Test
    public void testShowBug2() {
        InvalidDateValueBug bugClass = new InvalidDateValueBug();
        Calendar c = bugClass.showBug2();
        assertNotNull(c); // TRIGGER BUG: Invalid "Date" values should not be used
        assertEquals(0, c.get(Calendar.MONTH)); // TRIGGER BUG: Invalid "Date" values should not be used
    }
}