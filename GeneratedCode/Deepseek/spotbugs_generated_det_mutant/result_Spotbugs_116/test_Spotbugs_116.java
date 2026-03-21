import org.junit.Test;
import static org.junit.Assert.*;

public class BugTest {

    @Test
    public void testShowBug() {
        Bug bug = new Bug();
        double result = bug.showBug(5);
        assertEquals("The result should be 5.0, but it was not", 5.0, result, 0.0);
        // TRIGGER BUG: ICAST: Integral value cast to double and then passed to Math.ceil (ICAST_INT_CAST_TO_DOUBLE_PASSED_TO_CEIL)
        result = bug.showBug(55);
        assertEquals("The result should be 55.0, but it was not", 55.0, result, 0.0);
        // TRIGGER BUG: ICAST: Integral value cast to double and then passed to Math.ceil (ICAST_INT_CAST_TO_DOUBLE_PASSED_TO_CEIL)
    }
}