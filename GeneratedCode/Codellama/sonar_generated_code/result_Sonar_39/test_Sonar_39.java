import org.junit.Test;
import static org.junit.Assert.*;

public class DateTimeFormattersBugDemoTest {
    @Test
    public void testBug() {
        DateTimeFormattersBugDemo demo = new DateTimeFormattersBugDemo();
        demo.showBug();
        // TRIGGER BUG: DateTimeFormatters should not use mismatched year and week numbers
        assertEquals("2015-53", demo.getFormattedDate()); // Should be "2015-53" but is "2016-53"
    }
}