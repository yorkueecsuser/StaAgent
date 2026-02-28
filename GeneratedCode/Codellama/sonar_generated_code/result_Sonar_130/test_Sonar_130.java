import org.junit.Test;
import static org.junit.Assert.*;

public class FloatMathBugTest {
    @Test
    public void testBug() {
        float a = 16777216.0f;
        float b = 1.0f;
        float c = a + b; // TRIGGER BUG: Math should not be performed on floats
        assertEquals(16777217.0f, c, 0.0001f);
    }
}