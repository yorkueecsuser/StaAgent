import org.junit.Test;
import static org.junit.Assert.*;

public class RandomIntegerBugTest {

    @Test
    public void testShowBugWithMinValue() {
        RandomIntegerBug bugDemo = new RandomIntegerBug();
        int absValue = bugDemo.showBug(); // TRIGGER BUG: RV: Bad attempt to compute absolute value of signed random integer (RV_ABSOLUTE_VALUE_OF_RANDOM_INT)
        assertTrue(absValue >= 0); // This assertion will fail if absValue is Integer.MIN_VALUE
    }

    @Test
    public void testShowBugMultipleTimes() {
        RandomIntegerBug bugDemo = new RandomIntegerBug();
        for (int i = 0; i < 1000; i++) {
            int absValue = bugDemo.showBug(); // TRIGGER BUG: RV: Bad attempt to compute absolute value of signed random integer (RV_ABSOLUTE_VALUE_OF_RANDOM_INT)
            assertTrue(absValue >= 0); // This assertion will fail if absValue is Integer.MIN_VALUE
        }
    }
}