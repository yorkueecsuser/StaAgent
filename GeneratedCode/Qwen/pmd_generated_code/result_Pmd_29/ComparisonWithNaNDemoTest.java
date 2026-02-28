import org.junit.Test;
import static org.junit.Assert.*;

public class ComparisonWithNaNDemoTest {

    @Test
    public void testShowBug() {
        ComparisonWithNaNDemo demo = new ComparisonWithNaNDemo();
        assertFalse(demo.showBug(Double.NaN)); // TRIGGER BUG: ComparisonWithNaN
    }

    @Test
    public void testShowBug2() {
        ComparisonWithNaNDemo demo = new ComparisonWithNaNDemo();
        assertTrue(demo.showBug2(Double.NaN)); // TRIGGER BUG: ComparisonWithNaN
    }

    @Test
    public void testShowBug3() {
        ComparisonWithNaNDemo demo = new ComparisonWithNaNDemo();
        assertFalse(demo.showBug3(Double.NaN)); // TRIGGER BUG: ComparisonWithNaN
    }
}