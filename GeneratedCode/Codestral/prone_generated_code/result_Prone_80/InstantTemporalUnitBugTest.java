import org.junit.Test;
import static org.junit.Assert.*;
import java.time.Instant;
import java.time.temporal.UnsupportedTemporalTypeException;

public class InstantTemporalUnitBugTest {
    @Test(expected = UnsupportedTemporalTypeException.class)
    public void testShowBug() {
        InstantTemporalUnitBug buggyInstance = new InstantTemporalUnitBug();
        Instant initialInstant = Instant.now();
        buggyInstance.showBug(initialInstant); // TRIGGER BUG: InstantTemporalUnit
    }
}