import org.junit.Test;
import static org.junit.Assert.*;

public class MathRoundIntLongTest {
    @Test
    public void testRoundingInteger() {
        int a = 1234567890;
        int c = Math.round(a);
        System.out.println("Rounded int: " + c);
        assertEquals(1234567890, c);
        // TRIGGER BUG: MathRoundIntLong
    }

    @Test
    public void testRoundingLong() {
        long b = 1234567890123456789L;
        long d = Math.round(b);
        System.out.println("Rounded long: " + d);
        assertEquals(1234567890123456789L, d);
        // TRIGGER BUG: MathRoundIntLong
    }
}