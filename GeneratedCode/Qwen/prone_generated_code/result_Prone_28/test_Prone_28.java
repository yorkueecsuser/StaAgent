import org.junit.Test;
import static org.junit.Assert.*;

public class ConstantOverflowExampleTest {

    @Test
    public void testConstantOverflow() {
        ConstantOverflowExample example = new ConstantOverflowExample();
        long expectedValue = 86400000000L; // Correct value for nanoseconds per day
        long actualValue = example.showBug(); // TRIGGER BUG: ConstantOverflow
        assertEquals(expectedValue, actualValue);
    }
}