import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Date;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class InvalidDateValuesTest {

    InvalidDateValues invalidDateValues = new InvalidDateValues();

    @Test
    public void testShowBug1() {
        Date d = invalidDateValues.showBug1();
        assertEquals(2015, d.getYear() + 1900); // TRIGGER BUG: Invalid "Date" values should not be used
    }

    @Test
    public void testShowBug2() {
        Calendar c = invalidDateValues.showBug2();
        assertEquals(2015, c.get(Calendar.YEAR)); // TRIGGER BUG: Invalid "Date" values should not be used
    }

    @Test
    public void testShowBug3() {
        boolean result = invalidDateValues.showBug3();
        assertTrue(result); // TRIGGER BUG: Invalid "Date" values should not be used
    }
}