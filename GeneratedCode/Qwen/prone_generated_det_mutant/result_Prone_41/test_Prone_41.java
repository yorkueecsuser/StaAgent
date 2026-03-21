import org.junit.Test;
import static org.junit.Assert.*;
import java.time.Duration;
import java.time.temporal.ChronoUnit;
import java.time.temporal.UnsupportedTemporalTypeException;

public class DurationBugExampleTest {

    @Test(expected = UnsupportedTemporalTypeException.class)
    public void testShowBugWithMinutes() {
        DurationBugExample example = new DurationBugExample();
        Duration duration = Duration.ofMinutes(10);
        // TRIGGER BUG: DurationGetTemporalUnit
        example.showBug(duration);
    }

    @Test(expected = UnsupportedTemporalTypeException.class)
    public void testShowBugWithSeconds() {
        DurationBugExample example = new DurationBugExample();
        Duration duration = Duration.ofSeconds(10);
        // TRIGGER BUG: DurationGetTemporalUnit
        example.showBug(duration);
    }

    @Test(expected = UnsupportedTemporalTypeException.class)
    public void testShowBugWithNanos() {
        DurationBugExample example = new DurationBugExample();
        Duration duration = Duration.ofNanos(10);
        // TRIGGER BUG: DurationGetTemporalUnit
        example.showBug(duration);
    }
}