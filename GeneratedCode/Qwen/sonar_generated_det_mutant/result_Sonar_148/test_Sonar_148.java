import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Date;
import java.util.Calendar;

public class DateBugExampleTest {

    @Test
    public void testShowBug1() {
        DateBugExample example = new DateBugExample();
        Date d = example.showBug1(); // TRIGGER BUG: Invalid "Date" values should not be used
        assertEquals(11, d.getMonth()); // This assertion will fail because the month is incorrectly set to 12
    }

    @Test
    public void testShowBug2() {
        DateBugExample example = new DateBugExample();
        Calendar c = example.showBug2(); // TRIGGER BUG: Invalid "Date" values should not be used
        assertEquals(11, c.get(Calendar.MONTH)); // This assertion will fail because the month is incorrectly set to 12
    }
}