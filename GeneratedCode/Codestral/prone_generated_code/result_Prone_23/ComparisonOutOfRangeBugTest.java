import org.junit.Test;
import static org.junit.Assert.*;

public class ComparisonOutOfRangeBugTest {
    @Test
    public void testShowBug() {
        ComparisonOutOfRangeBug buggyClass = new ComparisonOutOfRangeBug();
        // TRIGGER BUG: ComparisonOutOfRange
        assertFalse(buggyClass.showBug((byte)200));  // The value 200 is out of range for a byte
    }
}