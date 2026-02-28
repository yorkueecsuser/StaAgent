import org.junit.Test;
import static org.junit.Assert.*;

public class TimeZoneDemoTest {

    @Test
    public void testShowBugWithInvalidTimeZoneID() {
        TimeZoneDemo demo = new TimeZoneDemo();
        String invalidId = "Invalid/TimeZone";
        String result = demo.showBug(invalidId); // TRIGGER BUG: InvalidTimeZoneID
        assertNotEquals("GMT", result); // The bug causes this test to fail
    }

    @Test
    public void testShowBugWithAnotherInvalidTimeZoneID() {
        TimeZoneDemo demo = new TimeZoneDemo();
        String invalidId = "Not_A_Real_TimeZone";
        String result = demo.showBug(invalidId); // TRIGGER BUG: InvalidTimeZoneID
        assertNotEquals("GMT", result); // The bug causes this test to fail
    }
}