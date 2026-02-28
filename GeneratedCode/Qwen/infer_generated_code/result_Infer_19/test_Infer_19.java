import org.junit.Test;
import static org.junit.Assert.*;

public class IntegerOverflowExampleTest {

    @Test
    public void testShowBugWithLargeInitialValue() {
        IntegerOverflowExample example = new IntegerOverflowExample();
        int initialValue = Integer.MAX_VALUE - 999999999; // This will cause overflow
        int result = example.showBug(initialValue); // TRIGGER BUG: INTEGER_OVERFLOW_U5
        assertEquals("This test should fail due to integer overflow", initialValue + 1000000000, result);
    }

    @Test
    public void testShowBugWithAnotherLargeInitialValue() {
        IntegerOverflowExample example = new IntegerOverflowExample();
        int initialValue = Integer.MAX_VALUE - 500000000; // This will also cause overflow
        int result = example.showBug(initialValue); // TRIGGER BUG: INTEGER_OVERFLOW_U5
        assertEquals("This test should fail due to integer overflow", initialValue + 1000000000, result);
    }
}