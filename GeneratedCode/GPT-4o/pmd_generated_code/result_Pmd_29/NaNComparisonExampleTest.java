import org.junit.Test;
import static org.junit.Assert.*;

public class NaNComparisonExampleTest {

    @Test
    public void testShowBugWithDoubleNaN() {
        NaNComparisonExample example = new NaNComparisonExample();
        double testValue = Double.NaN;
        assertTrue(example.showBug(testValue)); // TRIGGER BUG: ComparisonWithNaN
    }

    @Test
    public void testShowBugWithFloatNaN() {
        NaNComparisonExample example = new NaNComparisonExample();
        float testValue = Float.NaN;
        assertTrue(example.showBug(testValue)); // TRIGGER BUG: ComparisonWithNaN
    }
    
    @Test
    public void testShowBugWithInequality() {
        NaNComparisonExample example = new NaNComparisonExample();
        double testValue = Double.NaN;
        assertTrue(example.showBugWithInequality(testValue)); // TRIGGER BUG: ComparisonWithNaN
    }
}