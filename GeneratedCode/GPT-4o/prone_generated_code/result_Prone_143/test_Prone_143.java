import org.junit.Test;
import static org.junit.Assert.*;

public class RandomModIntegerExampleTest {

    @Test
    public void testShowBugTriggersBug() {
        RandomModIntegerExample example = new RandomModIntegerExample();
        int n = 10;
        
        // We want to test multiple times to increase the chance of observing a negative result
        for (int i = 0; i < 1000; i++) {
            int result = example.showBug(n); // TRIGGER BUG: RandomModInteger
            assertTrue("Result should be between 0 and " + (n - 1), result >= 0 && result < n);
        }
    }
}