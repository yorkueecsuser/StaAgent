import org.junit.Test;
import static org.junit.Assert.*;

public class MathRoundIntLongBugTest {
    MathRoundIntLongBug testObject = new MathRoundIntLongBug();

    @Test
    public void testShowBug() {
        // Trigger the bug
        // BUG: MathRoundIntLong
        long result = testObject.showBug(Integer.MAX_VALUE, Integer.MAX_VALUE);

        // Expected result is not the same as the actual result
        // This will cause the test case to fail and trigger the bug
        // TRIGGER BUG: MathRoundIntLong
        assertEquals(Integer.MAX_VALUE, result);
    }
}