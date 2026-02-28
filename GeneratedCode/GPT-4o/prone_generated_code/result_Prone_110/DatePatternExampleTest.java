import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Calendar;

public class DatePatternExampleTest {

    @Test
    public void testShowBug_EndOfYear() {
        DatePatternExample example = new DatePatternExample();
        // December 31, 2022, is a Saturday
        Date date = new GregorianCalendar(2022, Calendar.DECEMBER, 31).getTime();
        String result = example.showBug(date); // TRIGGER BUG: MisusedWeekYear
        assertEquals("2022-12-31", result); // This will fail if the bug is triggered
    }

    @Test
    public void testShowBug_BeginningOfYear() {
        DatePatternExample example = new DatePatternExample();
        // January 1, 2023, is a Sunday
        Date date = new GregorianCalendar(2023, Calendar.JANUARY, 1).getTime();
        String result = example.showBug(date); // TRIGGER BUG: MisusedWeekYear
        assertEquals("2023-01-01", result); // This will fail if the bug is triggered
    }
}