import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Date;
import java.util.Calendar;

public class DateBugExampleTest {

    @Test
    public void testShowBug() {
        DateBugExample example = new DateBugExample();
        Date result = example.showBug();  // TRIGGER BUG: Invalid "Date" values should not be used
        // The bug is triggered by the invalid date setting which rolls over to January of the next year
        // We expect the month to be 0 (January) because the input was 12 (December).
        assertEquals(0, result.getMonth());
    }

    @Test
    public void testShowBug2() {
        DateBugExample example = new DateBugExample();
        Calendar result = example.showBug2();  // TRIGGER BUG: Invalid "Date" values should not be used
        // The bug is triggered by the invalid month setting in the Calendar constructor
        // We expect the month to be 0 (January) because the input was 12 (December).
        assertEquals(0, result.get(Calendar.MONTH));
    }

}