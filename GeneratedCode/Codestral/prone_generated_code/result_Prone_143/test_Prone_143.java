import org.junit.Test;
import static org.junit.Assert.*;

public class BuggyRandomGeneratorTest {
    @Test
    public void testShowBug() {
        BuggyRandomGenerator generator = new BuggyRandomGenerator();
        for (int i = 0; i < 1000; i++) {
            int result = generator.showBug();
            // TRIGGER BUG: RandomModInteger
            assertTrue(result >= 0 && result < 10);
        }
    }
}