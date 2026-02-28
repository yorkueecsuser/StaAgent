import org.junit.Test;
import static org.junit.Assert.*;

class BuggyMathClampTest {
    @Test
    public void testMathClamp() {
        int value = 10;
        int min = 15;
        int max = 5;
        System.out.println(Math.clamp(value, min, max)); // TRIGGER BUG: "Math.clamp" should be used with correct ranges
    }
}