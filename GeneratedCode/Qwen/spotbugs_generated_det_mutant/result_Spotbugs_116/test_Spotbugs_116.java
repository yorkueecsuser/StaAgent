import org.junit.Test;
import static org.junit.Assert.*;

public class IntegralCastToDoubleBugTest {

    @Test
    public void testShowBugWithPositiveInteger() {
        IntegralCastToDoubleBug bugDemo = new IntegralCastToDoubleBug();
        assertEquals(5.0, bugDemo.showBug(5), 0.0001); // TRIGGER BUG: ICAST: Integral value cast to double and then passed to Math.ceil (ICAST_INT_CAST_TO_DOUBLE_PASSED_TO_CEIL)
    }

    @Test
    public void testShowBugWithZero() {
        IntegralCastToDoubleBug bugDemo = new IntegralCastToDoubleBug();
        assertEquals(0.0, bugDemo.showBug(0), 0.0001); // TRIGGER BUG: ICAST: Integral value cast to double and then passed to Math.ceil (ICAST_INT_CAST_TO_DOUBLE_PASSED_TO_CEIL)
    }

    @Test
    public void testShowBugWithNegativeInteger() {
        IntegralCastToDoubleBug bugDemo = new IntegralCastToDoubleBug();
        assertEquals(-3.0, bugDemo.showBug(-3), 0.0001); // TRIGGER BUG: ICAST: Integral value cast to double and then passed to Math.ceil (ICAST_INT_CAST_TO_DOUBLE_PASSED_TO_CEIL)
    }

    @Test
    public void testShowBugWithLargePositiveInteger() {
        IntegralCastToDoubleBug bugDemo = new IntegralCastToDoubleBug();
        assertEquals(Integer.MAX_VALUE, bugDemo.showBug(Integer.MAX_VALUE), 0.0001); // TRIGGER BUG: ICAST: Integral value cast to double and then passed to Math.ceil (ICAST_INT_CAST_TO_DOUBLE_PASSED_TO_CEIL)
    }

    @Test
    public void testShowBugWithLargeNegativeInteger() {
        IntegralCastToDoubleBug bugDemo = new IntegralCastToDoubleBug();
        assertEquals(Integer.MIN_VALUE, bugDemo.showBug(Integer.MIN_VALUE), 0.0001); // TRIGGER BUG: ICAST: Integral value cast to double and then passed to Math.ceil (ICAST_INT_CAST_TO_DOUBLE_PASSED_TO_CEIL)
    }
}