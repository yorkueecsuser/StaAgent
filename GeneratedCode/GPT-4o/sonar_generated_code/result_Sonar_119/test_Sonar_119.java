import org.junit.Test;
import static org.junit.Assert.*;

public class AtomicComparisonTest {

    @Test
    public void testShowBugWithEqualValues() {
        AtomicComparison example = new AtomicComparison();
        boolean result = example.showBug(5, 100L); // TRIGGER BUG: ".equals()" should not be used to test the values of "Atomic" classes
        assertFalse("The test should fail because .equals() does not compare numeric values.", result);
    }

    @Test
    public void testShowBugWithDifferentValues() {
        AtomicComparison example = new AtomicComparison();
        boolean result = example.showBug(10, 200L); // TRIGGER BUG: ".equals()" should not be used to test the values of "Atomic" classes
        assertFalse("The test should fail because .equals() does not compare numeric values.", result);
    }
}