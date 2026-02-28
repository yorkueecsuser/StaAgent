import org.junit.Test;
import static org.junit.Assert.*;

public class InvalidZoneIdBugTest {

    @Test
    public void testInvalidZoneId() {
        InvalidZoneIdBug bugDemo = new InvalidZoneIdBug();
        String invalidZoneId = "Invalid/Zone/Identifier";
        bugDemo.showBug(invalidZoneId); // TRIGGER BUG: InvalidZoneId
    }
}