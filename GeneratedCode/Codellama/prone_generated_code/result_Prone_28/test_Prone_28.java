import org.junit.Test;
import static org.junit.Assert.*;

public class ConstantOverflowTest {
    @Test
    public void testConstantOverflow() {
        // BUG: ConstantOverflow
        long nanosPerDay = 24 * 60 * 60 * 1000 * 1000 * 1000;
        assertEquals(86400000000000L, nanosPerDay);
    }
}