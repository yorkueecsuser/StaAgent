import org.junit.Test;
import static org.junit.Assert.*;

public class IntegerOverflowTest {
    @Test
    public void testIntegerOverflow() {
        int n = Integer.MAX_VALUE;
        int m = n + 3;
        System.out.println(m); // BUG: INTEGER_OVERFLOW_L1
    }
}