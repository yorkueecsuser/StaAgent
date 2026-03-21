import org.junit.Test;
import static org.junit.Assert.*;

// TRIGGER BUG: EqualsNaN
public class EqualsNaNTest {
    @Test
    public void testNaN() {
        double x = Double.NaN;
        assertFalse(x == Double.NaN); // TRIGGER BUG: EqualsNaN
    }
}