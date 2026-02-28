import org.junit.Test;
import static org.junit.Assert.*;

public class TimeZoneBugDemoTest {

    @Test
    public void testShowBugWithInvalidTimeZone() {
        TimeZoneBugDemo demo = new TimeZoneBugDemo();
        String result = demo.showBug("Invalid/TimeZone"); // TRIGGER BUG: InvalidTimeZoneID
        assertFalse("The result should not contain GMT", result.contains("GMT"));
    }
}