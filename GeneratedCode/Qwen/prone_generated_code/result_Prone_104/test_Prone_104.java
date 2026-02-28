import org.junit.Test;
import static org.junit.Assert.*;

public class MathRoundIntLongTest {

    @Test
    public void testShowBugWithInt() {
        MathRoundIntLong demo = new MathRoundIntLong();
        int expected = Integer.MAX_VALUE;
        int result = demo.showBug(Integer.MAX_VALUE); // TRIGGER BUG: MathRoundIntLong
        assertEquals(expected, result);
    }

    @Test
    public void testShowBugWithLong() {
        MathRoundIntLong demo = new MathRoundIntLong();
        long expected = Long.MAX_VALUE;
        long result = demo.showBug(Long.MAX_VALUE); // TRIGGER BUG: MathRoundIntLong
        assertEquals(expected, result);
    }
}