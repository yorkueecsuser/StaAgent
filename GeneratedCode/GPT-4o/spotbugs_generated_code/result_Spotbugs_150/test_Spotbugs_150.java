import org.junit.Test;
import static org.junit.Assert.*;

public class FloatingPointLoopCounterTest {

    @Test
    public void testShowBug() {
        FloatingPointLoopCounter example = new FloatingPointLoopCounter();
        double result = example.showBug(); // TRIGGER BUG: FL: Do not use floating-point variables as loop counters (FL_FLOATS_AS_LOOP_COUNTERS)
        assertNotEquals(4.5, result, 0.0001); // TRIGGER BUG: FL: Do not use floating-point variables as loop counters (FL_FLOATS_AS_LOOP_COUNTERS)
    }
}