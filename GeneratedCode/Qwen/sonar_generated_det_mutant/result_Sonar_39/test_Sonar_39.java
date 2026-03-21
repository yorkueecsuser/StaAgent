import org.junit.Test;
import static org.junit.Assert.*;

public class DateTimeFormatterBugExampleTest {

    @Test
    public void testShowBug1() {
        DateTimeFormatterBugExample example = new DateTimeFormatterBugExample();
        assertEquals("2015-53", example.showBug1()); // TRIGGER BUG: DateTimeFormatters should not use mismatched year and week numbers
    }

    @Test
    public void testShowBug2() {
        DateTimeFormatterBugExample example = new DateTimeFormatterBugExample();
        assertEquals("2015-53", example.showBug2()); // TRIGGER BUG: DateTimeFormatters should not use mismatched year and week numbers
    }

    @Test
    public void testShowBug3() {
        DateTimeFormatterBugExample example = new DateTimeFormatterBugExample();
        assertEquals("2015-53", example.showBug3()); // TRIGGER BUG: DateTimeFormatters should not use mismatched year and week numbers
    }
}