import org.junit.Test;
import static org.junit.Assert.*;

public class FloatingPointPrecisionBugTest {
    @Test
    public void testBugTrigger() {
        float number1 = 16777216.0f;
        float number2 = 1.0f;

        float result = number1 + number2;

        System.out.println(result); // TRIGGER BUG: FL: Method performs math using floating point precision (FL_MATH_USING_FLOAT_PRECISION)
    }
}