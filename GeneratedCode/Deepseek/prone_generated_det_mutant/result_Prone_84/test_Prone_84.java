import org.junit.Test;
import java.time.DateTimeException;
import static org.junit.Assert.*;

public class InvalidZoneIdBugTest {
    InvalidZoneIdBug bugInstance = new InvalidZoneIdBug();

    // TRIGGER BUG: InvalidZoneId
    @Test(expected = DateTimeException.class)
    public void testInvalidZoneIdBug() {
        bugInstance.showBug();
    }
}