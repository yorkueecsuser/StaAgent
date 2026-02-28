import org.junit.Test;
import static org.junit.Assert.*;
import java.util.TimeZone;

public class TimeZoneBugTest {

    @Test
    public void testInvalidTimeZoneId() {
        TimeZoneBug bug = new TimeZoneBug();
        TimeZone timeZone = bug.showBug("Invalid/TimeZone"); // TRIGGER BUG: InvalidTimeZoneID

        // Assert that the returned time zone is not the expected "GMT"
        // because an invalid time zone identifier was passed in
        assertNotEquals("GMT", timeZone.getID());
    }
}