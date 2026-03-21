import org.junit.Test;
import static org.junit.Assert.*;

public class BuggyRangeCheckTest {
    @Test
    public void testDoRangeCheck() {
        BuggyRangeCheck rangeCheck = new BuggyRangeCheck();
        int upperBound = 20;

        // TRIGGER BUG: Min and max used in combination should not always return the same value
        assertEquals("Bug not triggered", upperBound, rangeCheck.showBug(upperBound + 1));
    }
}