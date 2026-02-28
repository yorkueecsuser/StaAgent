import org.junit.Test;
import static org.junit.Assert.*;

public class RandomAbsoluteValueBugTest {

    @Test
    public void testShowBug() {
        RandomAbsoluteValueBug bugDemo = new RandomAbsoluteValueBug();

        // This loop will try to trigger the bug by calling showBug multiple times
        // Since triggering the bug is based on a random event, we run it multiple times
        for (int i = 0; i < 1000000; i++) {
            int result = bugDemo.showBug(); // TRIGGER BUG: RV: Bad attempt to compute absolute value of signed random integer (RV_ABSOLUTE_VALUE_OF_RANDOM_INT)
            assertTrue("The absolute value should not be negative", result >= 0);
        }
    }
}