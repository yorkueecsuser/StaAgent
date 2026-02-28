import org.junit.Test;
import static org.junit.Assert.*;

public class DateTimeFormatterBugDemoTest {

    @Test
    public void testShowBug1() {
        DateTimeFormatterBugDemo demo = new DateTimeFormatterBugDemo();
        String result = demo.showBug1(); // TRIGGER BUG: DateTimeFormatters should not use mismatched year and week numbers
        assertEquals("2015-53", result); // This will fail because the incorrect formatter formats 2016-01-01 as "2016-53"
    }

    @Test
    public void testShowBug2() {
        DateTimeFormatterBugDemo demo = new DateTimeFormatterBugDemo();
        String result = demo.showBug2(); // TRIGGER BUG: DateTimeFormatters should not use mismatched year and week numbers
        assertEquals("2015-53", result); // This will fail because the incorrect formatter formats 2016-01-01 as "2016-53"
    }

    @Test
    public void testShowBug3() {
        DateTimeFormatterBugDemo demo = new DateTimeFormatterBugDemo();
        String result = demo.showBug3(); // TRIGGER BUG: DateTimeFormatters should not use mismatched year and week numbers
        assertEquals("2015-53", result); // This will fail because the incorrect formatter formats 2016-01-01 as "2015-53"
    }
}