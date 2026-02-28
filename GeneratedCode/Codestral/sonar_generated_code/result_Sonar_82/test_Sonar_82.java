import org.junit.Test;
import static org.junit.Assert.*;

public class RangeCheckBugTest {

    @Test
    public void testDoRangeCheck() {
        RangeCheckBug rangeCheckBug = new RangeCheckBug();
        int num = 25;
        int result = rangeCheckBug.showBug(num);
        assertEquals("Expected the result to be within the range", num, result); // TRIGGER BUG: Min and max used in combination should not always return the same value
    }
}