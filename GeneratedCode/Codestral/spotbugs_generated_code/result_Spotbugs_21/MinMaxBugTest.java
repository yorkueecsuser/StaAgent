import org.junit.Test;
import static org.junit.Assert.*;

public class MinMaxBugTest {

    @Test
    public void testShowBugWithZero() {
        double result = MinMaxBug.showBug(0);
        assertEquals(0, result, 0.0001); // TRIGGER BUG: Dm: Incorrect combination of Math.max and Math.min (DM_INVALID_MIN_MAX)
    }

    @Test
    public void testShowBugWithNegativeValue() {
        double result = MinMaxBug.showBug(-50);
        assertEquals(0, result, 0.0001); // TRIGGER BUG: Dm: Incorrect combination of Math.max and Math.min (DM_INVALID_MIN_MAX)
    }

    @Test
    public void testShowBugWithValueOverHundred() {
        double result = MinMaxBug.showBug(150);
        assertEquals(100, result, 0.0001); // TRIGGER BUG: Dm: Incorrect combination of Math.max and Math.min (DM_INVALID_MIN_MAX)
    }

    @Test
    public void testShowBugWithNaNValue() {
        double result = MinMaxBug.showBug(Double.NaN);
        assertTrue(Double.isNaN(result)); // TRIGGER BUG: Dm: Incorrect combination of Math.max and Math.min (DM_INVALID_MIN_MAX)
    }
}