import org.junit.Test;
import static org.junit.Assert.*;

public class FloatingPointEqualityDemoTest {

    @Test
    public void testShowBugWithExactValue() {
        FloatingPointEqualityDemo demo = new FloatingPointEqualityDemo();
        // TRIGGER BUG: Floating point numbers should not be tested for equality
        boolean result = demo.showBug(3.146f, 0.0f);
        assertFalse("The method should return false due to floating point imprecision", result);
    }

    @Test
    public void testShowBugWithZero() {
        FloatingPointEqualityDemo demo = new FloatingPointEqualityDemo();
        // TRIGGER BUG: Floating point numbers should not be tested for equality
        boolean result = demo.showBug(3.146f, 0.0f);
        assertFalse("The method should return false due to floating point imprecision", result);
    }
}