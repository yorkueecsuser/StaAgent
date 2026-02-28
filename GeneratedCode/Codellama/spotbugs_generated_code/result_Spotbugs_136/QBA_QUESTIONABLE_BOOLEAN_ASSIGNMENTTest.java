import org.junit.Test;
import static org.junit.Assert.*;

public class QBA_QUESTIONABLE_BOOLEAN_ASSIGNMENTTest {
    @Test
    public void testBugTrigger() {
        int x = 5;
        boolean y = true;
        if (x == 5) { // BUG: QBA: Method assigns boolean literal in boolean expression (QBA_QUESTIONABLE_BOOLEAN_ASSIGNMENT)
            y = false;
        }
        assertEquals(false, y);
    }
}