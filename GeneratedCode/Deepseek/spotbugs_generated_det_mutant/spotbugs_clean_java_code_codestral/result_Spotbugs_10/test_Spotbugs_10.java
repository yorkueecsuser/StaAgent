import org.junit.Test;
import static org.junit.Assert.*;

public class FloatingPointPrecisionBugTest {
    @Test
    public void testDemonstrateBug() {
        FloatingPointPrecisionBug bug = new FloatingPointPrecisionBug();
        float num1 = 16777216.0f;
        float num2 = 1.0f;
        float result = bug.demonstrateBug(num1, num2);
        // TRIGGER BUG: FL: Method performs math using floating point precision (FL_MATH_USING_FLOAT_PRECISION)
        assertEquals("Result should be 16777217.0f", 16777217.0f, result, 0.0f);
    }

    @Test
    public void testShowBug() {
        FloatingPointPrecisionBug bug = new FloatingPointPrecisionBug();
        bug.showBug();
        // TRIGGER BUG: FL: Method performs math using floating point precision (FL_MATH_USING_FLOAT_PRECISION)
        // Bug is triggered when showBug method is called
    }
}