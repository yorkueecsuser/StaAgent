import org.junit.Test;
import static org.junit.Assert.*;
import java.time.ZoneId;

public class InvalidZoneIdTest {
    @Test
    public void testInvalidZoneId() {
        try {
            ZoneId zoneId = ZoneId.of("InvalidZone"); // BUG: InvalidZoneId
            fail("Expected exception not thrown");
        } catch (Exception e) {
            assertEquals("Invalid zone identifier", e.getMessage());
        }
    }
}