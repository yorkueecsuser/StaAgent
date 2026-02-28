import org.junit.Test;
import static org.junit.Assert.*;

public class FloatingLoopsAsCountersTest {
    @Test
    public void testShowBug() {
        FloatingLoopsAsCounters flac = new FloatingLoopsAsCounters();
        int result = flac.showBug(1.0f); // TRIGGER BUG: FL: Do not use floating-point variables as loop counters (FL_FLOATS_AS_LOOP_COUNTERS)
        assertEquals(10, result); // The bug causes the loop to iterate 10 times instead of the expected 1 time
    }
}