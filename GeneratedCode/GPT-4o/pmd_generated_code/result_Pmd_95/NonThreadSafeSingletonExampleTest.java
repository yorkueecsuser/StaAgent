import org.junit.Test;
import static org.junit.Assert.*;

public class NonThreadSafeSingletonExampleTest {

    @Test
    public void testSingletonIncrement() {
        int result = NonThreadSafeSingletonExample.showBug(); // TRIGGER BUG: NonThreadSafeSingleton
        // The expected value should be 2 if singleton is truly a single instance across threads
        assertEquals(2, result);
    }
}