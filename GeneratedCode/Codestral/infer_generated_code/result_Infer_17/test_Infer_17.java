import org.junit.Test;
import static org.junit.Assert.*;

public class IntegerOverflowL2Test {

    @Test
    public void testIntegerOverflowL2() {
        IntegerOverflowL2 obj = new IntegerOverflowL2();

        // TRIGGER BUG: INTEGER_OVERFLOW_L2
        // This test will trigger the bug by causing an integer overflow which could lead to an ArrayIndexOutOfBoundsException
        obj.showBug();
    }
}