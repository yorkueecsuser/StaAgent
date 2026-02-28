import org.junit.Test;
import static org.junit.Assert.*;

public class BuggyCodeTest {
    @Test
    public void testBuggyCode() {
        int[] values = {1, 2, 3, 4, 5};
        for (int value : values) {
            int result = Math.min(0, Math.max(100, value));
            assertEquals(100, result);
        }
    }
}