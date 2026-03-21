import org.junit.Test;
import static org.junit.Assert.*;

public class EqualsNaNExampleTest {

    @Test
    public void testShowBugWithNaN() {
        EqualsNaNExample example = new EqualsNaNExample();
        assertFalse(example.showBug(Double.NaN)); // TRIGGER BUG: EqualsNaN
    }

    @Test
    public void testShowBugWithNonNaN() {
        EqualsNaNExample example = new EqualsNaNExample();
        assertFalse(example.showBug(0.0)); // This should also pass as the method incorrectly returns false for all values
    }
}