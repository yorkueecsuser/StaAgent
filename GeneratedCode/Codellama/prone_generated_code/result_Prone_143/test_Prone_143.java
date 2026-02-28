import org.junit.Test;
import static org.junit.Assert.*;

public class BuggyRandomModIntegerTest {
    @Test
    public void testBug() {
        Random rand = new Random();
        int n = 10;
        int result = rand.nextInt(n) % n;
        assertEquals(0, result); // TRIGGER BUG: RandomModInteger
    }
}