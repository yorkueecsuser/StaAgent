import org.junit.Test;
import static org.junit.Assert.*;
import java.time.Duration;
import java.time.temporal.ChronoUnit;

public class DurationGetTemporalUnitBugTest {
    @Test
    public void testBug() {
        Duration duration = Duration.ofSeconds(10);
        long hours = duration.get(ChronoUnit.HOURS); // TRIGGER BUG: DurationGetTemporalUnit
        assertEquals(0, hours);
    }
}