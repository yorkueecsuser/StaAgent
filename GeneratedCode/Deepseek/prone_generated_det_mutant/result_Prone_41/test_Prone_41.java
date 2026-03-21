import java.time.Duration;
import java.time.temporal.ChronoUnit;
import java.time.temporal.UnsupportedTemporalTypeException;

import org.junit.Test;
import static org.junit.Assert.*;

public class DurationGetTemporalUnitBugTest {

    @Test
    // TRIGGER BUG: DurationGetTemporalUnit
    public void testShowBug() {
        DurationGetTemporalUnitBug bug = new DurationGetTemporalUnitBug();
        try {
            bug.showBug();
            fail("Expected UnsupportedTemporalTypeException to be thrown");
        } catch (UnsupportedTemporalTypeException e) {
            // Expected exception, test passes
        }
    }
}