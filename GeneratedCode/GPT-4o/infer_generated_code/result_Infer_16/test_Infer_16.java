import org.junit.Test;
import static org.junit.Assert.*;

public class IntegerOverflowExampleTest {

    @Test
    public void testShowBugWithOverflow() {
        IntegerOverflowExample example = new IntegerOverflowExample();
        int result = example.showBug(1); // TRIGGER BUG: INTEGER_OVERFLOW_L1​
        assertEquals("The result should be Integer.MIN_VALUE due to overflow", Integer.MIN_VALUE, result);
    }
}