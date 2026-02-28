import org.junit.Test;
import static org.junit.Assert.*;
import java.time.Duration;

public class DurationToLongTimeUnitExampleTest {

    @Test
    public void testShowBug() {
        DurationToLongTimeUnitExample example = new DurationToLongTimeUnitExample();
        Duration duration = Duration.ofSeconds(1);

        long result = example.showBug(duration); // TRIGGER BUG: DurationToLongTimeUnit

        // The expected outcome is 1000 milliseconds, but the bug causes a mismatch
        assertEquals(1000L, result); // This assertion will fail because result is in nanoseconds
    }

    @Test
    public void testShowBugCorrected() {
        DurationToLongTimeUnitExample example = new DurationToLongTimeUnitExample();
        Duration duration = Duration.ofSeconds(1);

        long result = example.showBugCorrected(duration);

        // The expected outcome using the corrected method
        assertEquals(1000L, result); // This assertion will pass because result is in milliseconds
    }
}