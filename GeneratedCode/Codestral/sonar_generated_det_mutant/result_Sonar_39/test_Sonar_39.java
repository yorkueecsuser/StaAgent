import org.junit.Test;
import static org.junit.Assert.*;
import java.time.LocalDate;

public class DateTimeFormatterBugTest {
    @Test
    public void testBugTrigger() {
        DateTimeFormatterBug bugDemo = new DateTimeFormatterBug();
        String result = bugDemo.showBug(LocalDate.of(2016, 1, 1)); // TRIGGER BUG: DateTimeFormatters should not use mismatched year and week numbers
        assertEquals("2015-53", result); // The buggy code returns "2016-53" instead of "2015-53"
    }
}