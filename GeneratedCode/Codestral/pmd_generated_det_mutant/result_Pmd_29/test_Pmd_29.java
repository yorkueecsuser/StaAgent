import org.junit.Test;
import static org.junit.Assert.*;

public class ComparisonWithNaNBugTest {
    @Test
    public void testShowBugWithNaN() {
        ComparisonWithNaNBug buggyClass = new ComparisonWithNaNBug();
        double value = Double.NaN;
        // TRIGGER BUG: ComparisonWithNaN
        assertFalse(buggyClass.showBug(value));
    }
}