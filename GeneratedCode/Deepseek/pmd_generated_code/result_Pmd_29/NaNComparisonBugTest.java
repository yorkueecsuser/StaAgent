import org.junit.Test;
import static org.junit.Assert.*;

public class NaNComparisonBugTest {
    NaNComparisonBug bugClass = new NaNComparisonBug();

    @Test
    // TRIGGER BUG: ComparisonWithNaN
    public void testShowBug() {
        assertFalse(bugClass.showBug(Double.NaN)); // This line triggers the bug
    }
}