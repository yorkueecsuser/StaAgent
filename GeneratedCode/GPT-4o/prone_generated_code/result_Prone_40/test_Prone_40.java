import org.junit.Test;
import static org.junit.Assert.*;
import java.time.Duration;
import java.time.Period;

public class DurationFromExampleTest {

    @Test
    public void testShowBug1() {
        DurationFromExample example = new DurationFromExample();
        Duration duration = Duration.ofHours(5);
        Duration result = example.showBug1(duration);
        assertNotNull("The result should not be null.", result);
        assertEquals("The result should be the same as the input duration.", duration, result);
    }

    @Test
    public void testShowBug2() {
        DurationFromExample example = new DurationFromExample();
        Period period = Period.ofDays(1);
        // This line triggers the bug because it attempts to convert a Period to a Duration
        example.showBug2(period); // TRIGGER BUG: DurationFrom
    }
}