import org.junit.Test;
import static org.junit.Assert.*;
import java.util.TimeZone;

class TimeZoneBugTest {
    @Test
    public void testInvalidTimeZoneID() {
        TimeZone timeZone = TimeZone.getTimeZone("InvalidTimeZoneID");
        // TRIGGER BUG: InvalidTimeZoneID
        assertEquals("GMT", timeZone.getDisplayName());
    }
}