import org.junit.Test;
import static org.junit.Assert.*;

public class FloatingPointPrecisionBugTest {

    @Test
    public void testShowBug() {
        FloatingPointPrecisionBug bugDemo = new FloatingPointPrecisionBug();
        float result = bugDemo.showBug(16777216.0f, 1.0f); // TRIGGER BUG: FL: Method performs math using floating point precision (FL_MATH_USING_FLOAT_PRECISION)
        assertEquals(16777217.0f, result, 0.0f); // This assertion will fail due to the bug
    }
}