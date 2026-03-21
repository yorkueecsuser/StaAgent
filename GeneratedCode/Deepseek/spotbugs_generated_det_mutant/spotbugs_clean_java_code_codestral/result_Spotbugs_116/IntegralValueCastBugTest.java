import org.junit.Test;
import static org.junit.Assert.*;

public class IntegralValueCastBugTest {

    @Test
    public void testShowBug() {
        IntegralValueCastBug buggyClass = new IntegralValueCastBug();
        int value = 10;
        double result = buggyClass.showBug(value);
        // TRIGGER BUG: ICAST: Integral value cast to double and then passed to Math.ceil (ICAST_INT_CAST_TO_DOUBLE_PASSED_TO_CEIL)
        assertEquals("Bug triggered when passing integer to Math.ceil", value, result, 0.0);
    }
}