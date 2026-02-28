import org.junit.Test;
import static org.junit.Assert.*;

public class DateTimeFormatterBugDemoTest {

    @Test
    public void testShowBug() {
        DateTimeFormatterBugDemo demo = new DateTimeFormatterBugDemo();
        String result = demo.showBug(); // TRIGGER BUG: DateTimeFormatters should not use mismatched year and week numbers
        assertEquals("2015-53", result); // Expecting "2015-53" but bug may cause incorrect formatting
    }

    @Test
    public void testShowBug2() {
        DateTimeFormatterBugDemo demo = new DateTimeFormatterBugDemo();
        String result = demo.showBug2(); // TRIGGER BUG: DateTimeFormatters should not use mismatched year and week numbers
        assertEquals("2015-53", result); // Expecting "2015-53" but bug may cause incorrect formatting
    }

    @Test
    public void testShowBug3() {
        DateTimeFormatterBugDemo demo = new DateTimeFormatterBugDemo();
        String result = demo.showBug3(); // TRIGGER BUG: DateTimeFormatters should not use mismatched year and week numbers
        assertEquals("2015-01", result); // Expecting "2015-01" but bug may cause incorrect formatting
    }
}