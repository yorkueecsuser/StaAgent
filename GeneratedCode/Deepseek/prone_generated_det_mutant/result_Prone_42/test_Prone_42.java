import org.junit.Test;
import static org.junit.Assert.*;
import java.time.Duration;
import java.time.temporal.ChronoUnit;

public class DurationTemporalUnitBugTest {

    private DurationTemporalUnitBug durationTemporalUnitBug = new DurationTemporalUnitBug();

    @Test // TRIGGER BUG: DurationTemporalUnit
    public void testShowBug() {
        durationTemporalUnitBug.showBug(); // Line 12
    }
}