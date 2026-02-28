import org.junit.Test;
import static org.junit.Assert.*;

public class FloatingPointPrecisionBugTest {

    @Test
    public void testShowBugWithLargeNumbers() {
        FloatingPointPrecisionBug bugDemo = new FloatingPointPrecisionBug();
        float value1 = 16777216.0f;
        float value2 = 1.0f;

        float result = bugDemo.showBug(value1, value2); // TRIGGER BUG: FL: Method performs math using floating point precision (FL_MATH_USING_FLOAT_PRECISION)
        
        assertEquals(16777217.0f, result, 0.0); // This assertion will fail, triggering the bug
    }
}