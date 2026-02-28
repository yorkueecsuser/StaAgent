import org.junit.Test;
import static org.junit.Assert.*;

public class ComparisonOutOfRangeExampleTest {

    @Test
    public void testShowBug() {
        ComparisonOutOfRangeExample example = new ComparisonOutOfRangeExample();
        byte testValue = 100;

        // Attempt to trigger the bug
        boolean result = example.showBug(testValue);

        // The bug should cause the test to fail
        assertTrue("Expected true for testValue 100, but got false", result);  // TRIGGER BUG: ComparisonOutOfRange
    }
}