import org.junit.Test;
import static org.junit.Assert.*;

public class IntegerOverflowExampleTest {

    @Test
    public void testShowBug() {
        IntegerOverflowExample example = new IntegerOverflowExample();
        int result = example.showBug(100000, 30000); // TRIGGER BUG: INTEGER_OVERFLOW_U5​
        assertEquals("This test fails due to integer overflow", -727379968, result);
    }

    @Test
    public void testShowBugWithDifferentInputs() {
        IntegerOverflowExample example = new IntegerOverflowExample();
        int result = example.showBug(200000, 20000); // TRIGGER BUG: INTEGER_OVERFLOW_U5​
        assertEquals("This test fails due to integer overflow", -1457599936, result);
    }
}