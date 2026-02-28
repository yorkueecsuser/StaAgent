import org.junit.Test;
import static org.junit.Assert.*;

public class MathRoundBugDemoTest {

    @Test
    public void testShowBugWithInt() {
        MathRoundBugDemo demo = new MathRoundBugDemo();
        int intValue = 1234567890;
        long expectedValue = 1234567890L; // Expecting no precision loss
        long actualValue = demo.showBug(intValue); // TRIGGER BUG: MathRoundIntLong
        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void testShowBugWithLong() {
        MathRoundBugDemo demo = new MathRoundBugDemo();
        long longValue = 1234567890123456789L;
        long expectedValue = 1234567890123456789L; // Expecting no precision loss
        long actualValue = demo.showBug(longValue); // TRIGGER BUG: MathRoundIntLong
        assertEquals(expectedValue, actualValue);
    }
}