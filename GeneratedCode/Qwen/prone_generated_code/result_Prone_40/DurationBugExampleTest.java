import org.junit.Test;
import static org.junit.Assert.*;
import java.time.Duration;
import java.time.Period;
import java.time.temporal.TemporalAmount;
import java.time.temporal.UnsupportedTemporalTypeException;

public class DurationBugExampleTest {

    @Test
    public void testShowBug1() {
        DurationBugExample example = new DurationBugExample();
        Duration duration = Duration.ofHours(2);
        assertEquals(Duration.ofHours(2), example.showBug1(duration)); // TRIGGER BUG: DurationFrom
    }

    @Test(expected = UnsupportedTemporalTypeException.class)
    public void testShowBug2() {
        DurationBugExample example = new DurationBugExample();
        Period period = Period.ofDays(3);
        example.showBug2(period); // TRIGGER BUG: DurationFrom
    }

    @Test
    public void testShowBug3WithDuration() {
        DurationBugExample example = new DurationBugExample();
        TemporalAmount temporalAmount = Duration.ofMinutes(45);
        assertEquals(Duration.ofMinutes(45), example.showBug3(temporalAmount)); // TRIGGER BUG: DurationFrom
    }

    @Test(expected = UnsupportedTemporalTypeException.class)
    public void testShowBug3WithPeriod() {
        DurationBugExample example = new DurationBugExample();
        TemporalAmount temporalAmount2 = Period.ofWeeks(2);
        example.showBug3(temporalAmount2); // TRIGGER BUG: DurationFrom
    }

    @Test(expected = UnsupportedTemporalTypeException.class)
    public void testShowBug() {
        DurationBugExample example = new DurationBugExample();
        example.showBug(); // TRIGGER BUG: DurationFrom
    }
}