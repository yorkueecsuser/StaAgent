import org.junit.Test;
import static org.junit.Assert.*;

public class FloatComparisonBugTest {
    @Test
    public void testShowBug() {
        FloatComparisonBug buggyClass = new FloatComparisonBug();
        float testNumber = 3.146f;
        assertFalse("Test case failed. Bug triggered - Floating point numbers should not be tested for equality", buggyClass.showBug(testNumber)); // TRIGGER BUG: Floating point numbers should not be tested for equality
    }
}