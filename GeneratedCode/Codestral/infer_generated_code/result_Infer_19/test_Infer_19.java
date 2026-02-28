import org.junit.Test;
import static org.junit.Assert.*;

public class IntegerOverflowBugTest {
    @Test
    public void testBugTrigger() {
        int x = Integer.MAX_VALUE;
        int y = 1;
        int result = IntegerOverflowBug.showBug(x, y); // TRIGGER BUG: INTEGER_OVERFLOW_U5
        assertTrue("Bug not triggered as expected", result < 0);
    }
}