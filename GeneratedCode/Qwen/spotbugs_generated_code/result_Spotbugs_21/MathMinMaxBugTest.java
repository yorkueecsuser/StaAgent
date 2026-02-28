import org.junit.Test;
import static org.junit.Assert.*;

public class MathMinMaxBugTest {

    @Test
    public void testShowBugWithPositiveValue() {
        MathMinMaxBug bugDemo = new MathMinMaxBug();
        assertEquals(100, bugDemo.showBug(50)); // TRIGGER BUG: Dm: Incorrect combination of Math.max and Math.min (DM_INVALID_MIN_MAX)
    }

    @Test
    public void testShowBugWithNegativeValue() {
        MathMinMaxBug bugDemo = new MathMinMaxBug();
        assertEquals(100, bugDemo.showBug(-10)); // TRIGGER BUG: Dm: Incorrect combination of Math.max and Math.min (DM_INVALID_MIN_MAX)
    }

    @Test
    public void testShowBugWithAboveRangeValue() {
        MathMinMaxBug bugDemo = new MathMinMaxBug();
        assertEquals(100, bugDemo.showBug(150)); // TRIGGER BUG: Dm: Incorrect combination of Math.max and Math.min (DM_INVALID_MIN_MAX)
    }
}