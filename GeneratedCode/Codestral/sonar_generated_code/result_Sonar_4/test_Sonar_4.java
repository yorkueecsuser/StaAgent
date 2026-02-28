import org.junit.Test;
import static org.junit.Assert.*;

public class MathClampBugTest {
    @Test
    public void testWithReversedMinMax() {
        int value = 5;
        int min = 10;
        int max = 20;
        // TRIGGER BUG: "Math.clamp" should be used with correct ranges
        MathClampBug.showBug(value, min, max); // This will throw an IllegalArgumentException
    }
}