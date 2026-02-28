import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Date;
import java.util.Calendar;

public class DateBugExampleTest {

    @Test
    public void testShowBug1() {
        DateBugExample example = new DateBugExample();
        Date buggyDate = example.showBug1();  // TRIGGER BUG: Invalid "Date" values should not be used
        assertEquals(11, buggyDate.getMonth());  // This assertion will fail because the month is actually 0 (January)
    }

    @Test
    public void testShowBug2() {
        DateBugExample example = new DateBugExample();
        Calendar buggyCalendar = example.showBug2();  // TRIGGER BUG: Invalid "Date" values should not be used
        assertEquals(11, buggyCalendar.get(Calendar.MONTH));  // This assertion will fail because the month is actually 0 (January)
    }

    @Test
    public void testMainMethodBug() {
        DateBugExample example = new DateBugExample();
        Calendar buggyCalendar = example.showBug2();
        assertEquals(11, buggyCalendar.get(Calendar.MONTH));  // TRIGGER BUG: Invalid "Date" values should not be used
    }
}