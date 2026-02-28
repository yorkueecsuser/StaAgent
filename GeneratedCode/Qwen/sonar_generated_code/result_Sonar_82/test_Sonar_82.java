import org.junit.Test;
import static org.junit.Assert.*;

public class RangeCheckerTest {

    @Test
    public void testDoRangeCheckWithBug() {
        RangeChecker checker = new RangeChecker();
        int result = checker.showBug(12); // TRIGGER BUG: Min and max used in combination should not always return the same value
        assertEquals(12, result); // This assertion will fail, demonstrating the bug
    }
}