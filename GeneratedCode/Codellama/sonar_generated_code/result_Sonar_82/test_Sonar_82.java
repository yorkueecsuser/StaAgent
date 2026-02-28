import org.junit.Test;
import static org.junit.Assert.*;

public class MinMaxBugTest {
    private static final int UPPER = 20;
    private static final int LOWER = 0;

    @Test
    public void testDoRangeCheck() {
        MinMaxBug buggy = new MinMaxBug();
        assertEquals(12, buggy.doRangeCheck(12)); // TRIGGER BUG: Min and max used in combination should not always return the same value
    }

    @Test
    public void testDoRangeCheck_UpperBound() {
        MinMaxBug buggy = new MinMaxBug();
        assertEquals(20, buggy.doRangeCheck(21)); // TRIGGER BUG: Min and max used in combination should not always return the same value
    }

    @Test
    public void testDoRangeCheck_LowerBound() {
        MinMaxBug buggy = new MinMaxBug();
        assertEquals(0, buggy.doRangeCheck(-1)); // TRIGGER BUG: Min and max used in combination should not always return the same value
    }
}