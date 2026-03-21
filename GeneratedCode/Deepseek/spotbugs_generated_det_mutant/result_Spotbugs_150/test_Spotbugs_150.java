import org.junit.Test;
import static org.junit.Assert.*;

public class MainTest {
    @Test
    public void testShowBug() {
        // TRIGGER BUG: FL: Do not use floating-point variables as loop counters (FL_FLOATS_AS_LOOP_COUNTERS)
        double result = Main.showBug();
        // Given the fact that floating-point arithmetic is not precise, 
        // we can't assert that the result equals exactly 1.0.
        // Instead, we assert that the result is greater than 1.0 with a margin of error.
        assertTrue(result > 1.0);
    }
}