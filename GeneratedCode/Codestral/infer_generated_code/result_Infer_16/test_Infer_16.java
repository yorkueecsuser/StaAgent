import org.junit.Test;
import static org.junit.Assert.*;

public class IntegerOverflowL1Test {

    @Test
    public void testShowBug() {
        IntegerOverflowL1 buggyClass = new IntegerOverflowL1();
        int result = buggyClass.showBug(); // TRIGGER BUG: INTEGER_OVERFLOW_L1
        assertNotEquals(Integer.MAX_VALUE + 3, result);
    }
}