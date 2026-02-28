import org.junit.Test;
import static org.junit.Assert.*;

public class ZoneIdExampleTest {

    @Test
    public void testShowBugWithInvalidZoneId() {
        ZoneIdExample example = new ZoneIdExample();
        example.showBug("NonExistent/TimeZone"); // TRIGGER BUG: InvalidZoneId
    }
}