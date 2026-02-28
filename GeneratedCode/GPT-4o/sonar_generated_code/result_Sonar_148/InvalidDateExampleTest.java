import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Date;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class InvalidDateExampleTest {

    @Test
    public void testShowBug1() {
        InvalidDateExample example = new InvalidDateExample();
        Date d = example.showBug1();  // TRIGGER BUG: Invalid "Date" values should not be used
        assertEquals("Expected month to roll over to January", 0, d.getMonth());
    }

    @Test
    public void testShowBug2() {
        InvalidDateExample example = new InvalidDateExample();
        Calendar c = example.showBug2();  // TRIGGER BUG: Invalid "Date" values should not be used
        assertEquals("Expected month to roll over to January", 0, c.get(Calendar.MONTH));
    }

    @Test
    public void testShowBug3() {
        InvalidDateExample example = new InvalidDateExample();
        Calendar c = new GregorianCalendar(2014, 0, 25); // January of 2014
        boolean result = example.showBug3(c);  // TRIGGER BUG: Invalid "Date" values should not be used
        assertFalse("Invalid month comparison should be false", result);
    }
}