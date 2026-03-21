import org.junit.Test;
import static org.junit.Assert.*;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatterBugDemoTest {

    @Test
    public void testShowBug1() {
        DateTimeFormatterBugDemo demo = new DateTimeFormatterBugDemo();
        String result = demo.showBug1(); // TRIGGER BUG: DateTimeFormatters should not use mismatched year and week numbers
        assertEquals("2015-53", result); // This assertion is expected to fail to highlight the bug
    }

    @Test
    public void testShowBug2() {
        DateTimeFormatterBugDemo demo = new DateTimeFormatterBugDemo();
        String result = demo.showBug2(); // TRIGGER BUG: DateTimeFormatters should not use mismatched year and week numbers
        assertEquals("2015-53", result); // This assertion is expected to fail to highlight the bug
    }

    @Test
    public void testShowBug3() {
        DateTimeFormatterBugDemo demo = new DateTimeFormatterBugDemo();
        String result = demo.showBug3(); // TRIGGER BUG: DateTimeFormatters should not use mismatched year and week numbers
        assertEquals("2016-01", result); // This assertion is expected to fail to highlight the bug
    }
}