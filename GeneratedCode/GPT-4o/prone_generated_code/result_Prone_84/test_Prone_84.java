import org.junit.Test;
import static org.junit.Assert.*;

public class ZoneIdExampleTest {

    @Test
    public void testShowBugWithInvalidZoneId() {
        ZoneIdExample example = new ZoneIdExample();
        String result = example.showBug("Invalid/Zone"); // TRIGGER BUG: InvalidZoneId
        // The test should fail because an exception is expected to be thrown
        assertEquals("Expected exception message", result);
    }

    @Test
    public void testShowBugWithAnotherInvalidZoneId() {
        ZoneIdExample example = new ZoneIdExample();
        String result = example.showBug("Bad/Zone"); // TRIGGER BUG: InvalidZoneId
        // The test should fail because an exception is expected to be thrown
        assertEquals("Expected exception message", result);
    }
}