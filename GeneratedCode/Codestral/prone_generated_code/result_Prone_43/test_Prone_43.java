import org.junit.Test;
import static org.junit.Assert.*;

public class DurationToLongTimeUnitBugTest {

    @Test
    public void testShowBug() {
        DurationToLongTimeUnitBug bug = new DurationToLongTimeUnitBug();
        long minutes = 5;
        long expectedSeconds = minutes * 60; // 5 minutes is 300 seconds
        long actualSeconds = bug.showBug(minutes);
        assertEquals("DurationToLongTimeUnit bug triggered", expectedSeconds, actualSeconds); // TRIGGER BUG: DurationToLongTimeUnit
    }
}