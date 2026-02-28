import org.junit.Test;
import static org.junit.Assert.*;
import java.time.Duration;

public class DurationToLongTimeUnitExampleTest {

    @Test
    public void testShowBugWithSeconds() {
        DurationToLongTimeUnitExample example = new DurationToLongTimeUnitExample();
        Duration duration = Duration.ofSeconds(123456);
        long expectedSeconds = 123456;
        long actualSeconds = example.showBug(duration); // TRIGGER BUG: DurationToLongTimeUnit
        assertEquals(expectedSeconds, actualSeconds);
    }

    @Test
    public void testShowBugWithMilliseconds() {
        DurationToLongTimeUnitExample example = new DurationToLongTimeUnitExample();
        Duration duration = Duration.ofMillis(123456789);
        long expectedSeconds = 123456; // Correct conversion would be 123456.789, but method returns 123456
        long actualSeconds = example.showBug(duration); // TRIGGER BUG: DurationToLongTimeUnit
        assertEquals(expectedSeconds, actualSeconds);
    }
}