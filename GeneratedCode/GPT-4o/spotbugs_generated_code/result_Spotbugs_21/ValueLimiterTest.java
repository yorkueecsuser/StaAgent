import org.junit.Test;
import static org.junit.Assert.*;

public class ValueLimiterTest {

    @Test
    public void testShowBugWithValue50() {
        double result = ValueLimiter.showBug(50); // TRIGGER BUG: Dm: Incorrect combination of Math.max and Math.min (DM_INVALID_MIN_MAX)
        assertEquals(50.0, result, 0.0);
    }

    @Test
    public void testShowBugWithValueNegative20() {
        double result = ValueLimiter.showBug(-20); // TRIGGER BUG: Dm: Incorrect combination of Math.max and Math.min (DM_INVALID_MIN_MAX)
        assertEquals(0.0, result, 0.0);
    }

    @Test
    public void testShowBugWithValue150() {
        double result = ValueLimiter.showBug(150); // TRIGGER BUG: Dm: Incorrect combination of Math.max and Math.min (DM_INVALID_MIN_MAX)
        assertEquals(100.0, result, 0.0);
    }
}