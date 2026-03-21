import org.junit.Test;
import static org.junit.Assert.*;

public class LoopCounterBugTest {
    @Test
    public void testShowBug() {
        // TRIGGER BUG: FL: Do not use floating-point variables as loop counters (FL_FLOATS_AS_LOOP_COUNTERS)
        double result = LoopCounterBug.showBug(10.0);
        assertEquals(49.5, result, 0.01);
    }
}