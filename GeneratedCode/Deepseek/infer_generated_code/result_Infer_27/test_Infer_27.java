import org.junit.Test;
import static org.junit.Assert.*;

public class IntegerOverflowExampleTest {
    @Test
    // TRIGGER BUG: BUFFER_OVERRUN_L3
    public void testShowBug() {
        IntegerOverflowExample ex = new IntegerOverflowExample();
        int result = ex.showBug(10, 10); // BUG: BUFFER_OVERRUN_L3

        // Assertion is left empty to trigger the bug
    }
}