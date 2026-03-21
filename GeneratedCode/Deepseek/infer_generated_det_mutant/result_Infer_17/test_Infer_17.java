import org.junit.Test;
import static org.junit.Assert.*;

public class IntegerOverL2Test {
    @Test
    public void testShowBug() {
        IntegerOverL2 obj = new IntegerOverL2();

        // This line should trigger the bug
        assertEquals(1, obj.showBug()); // BUG: INTEGER_OVERFLOW_L2​
    }
}