import org.junit.Test;
import static org.junit.Assert.*;

public class InvalidTimeZoneIDTest {

    InvalidTimeZoneID bug = new InvalidTimeZoneID();

    @Test
    public void testShowBug() {
        String invalidID = "Invalid/TimeZone/ID";
        String result = bug.showBug(invalidID);
        assertEquals("Invalid Time Zone ID should return GMT", "GMT", result); // TRIGGER BUG: InvalidTimeZoneID
    }
}