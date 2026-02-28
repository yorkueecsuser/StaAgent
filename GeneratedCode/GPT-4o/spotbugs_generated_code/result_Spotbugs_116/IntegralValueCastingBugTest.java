import org.junit.Test;
import static org.junit.Assert.*;

public class IntegralValueCastingBugTest {

    @Test
    public void testShowBugWithPositiveInteger() {
        IntegralValueCastingBug bugDemo = new IntegralValueCastingBug();
        int testValue = 42;
        double expected = 42.0;
        double result = bugDemo.showBug(testValue); // TRIGGER BUG: ICAST: Integral value cast to double and then passed to Math.ceil (ICAST_INT_CAST_TO_DOUBLE_PASSED_TO_CEIL)
        assertEquals(expected, result, 0.0);
    }

    @Test
    public void testShowBugWithNegativeInteger() {
        IntegralValueCastingBug bugDemo = new IntegralValueCastingBug();
        int testValue = -42;
        double expected = -42.0;
        double result = bugDemo.showBug(testValue); // TRIGGER BUG: ICAST: Integral value cast to double and then passed to Math.ceil (ICAST_INT_CAST_TO_DOUBLE_PASSED_TO_CEIL)
        assertEquals(expected, result, 0.0);
    }

    @Test
    public void testShowBugWithZero() {
        IntegralValueCastingBug bugDemo = new IntegralValueCastingBug();
        int testValue = 0;
        double expected = 0.0;
        double result = bugDemo.showBug(testValue); // TRIGGER BUG: ICAST: Integral value cast to double and then passed to Math.ceil (ICAST_INT_CAST_TO_DOUBLE_PASSED_TO_CEIL)
        assertEquals(expected, result, 0.0);
    }
}