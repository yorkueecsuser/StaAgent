import org.junit.Test;
import static org.junit.Assert.*;

public class FloatBugExampleTest {
    FloatBugExample example = new FloatBugExample();

    @Test
    // TRIGGER BUG: Math should not be performed on floats
    public void testShowBug() {
        float a = 16777216.0f;
        float b = 1.0f;
        float c = a + b; // BUG: Math should not be performed on floats
        double d = a + b; // BUG: Math should not be performed on floats
        assertEquals(1.6777217E7, c, 0); // Expected value is 1.6777217E7
        assertEquals(1.6777217E7, d, 0); // Expected value is 1.6777217E7
    }
}