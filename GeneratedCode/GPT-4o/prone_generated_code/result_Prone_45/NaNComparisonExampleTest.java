import org.junit.Test;
import static org.junit.Assert.*;

public class NaNComparisonExampleTest {

    @Test
    public void testShowBugWithNaN() {
        NaNComparisonExample example = new NaNComparisonExample();
        assertTrue(example.showBug(Double.NaN)); // TRIGGER BUG: EqualsNaN
    }

    @Test
    public void testShowBugWithNonNaN() {
        NaNComparisonExample example = new NaNComparisonExample();
        assertFalse(example.showBug(1.0)); // TRIGGER BUG: EqualsNaN
    }
}