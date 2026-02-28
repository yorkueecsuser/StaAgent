import org.junit.Test;
import static org.junit.Assert.*;

public class IntegerOverflowL1Test {

    @Test
    public void testShowBug() {
        try {
            IntegerOverflowL1.showBug();
            fail("Expected an ArithmeticException to be thrown"); // TRIGGER BUG: INTEGER_OVERFLOW_L1
        } catch (ArithmeticException e) {
            // This is expected
        }
    }
}