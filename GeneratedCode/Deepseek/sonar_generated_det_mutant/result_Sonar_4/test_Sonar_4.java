import org.junit.Test;
import static org.junit.Assert.*;

public class BuggyCodeTest {

    @Test
    // TRIGGER BUG: "Math.clamp" should be used with correct ranges
    public void testShowBug() {
        int result = BuggyCode.showBug(5, 10, 1); // This line triggers the bug
        assertEquals(5, result);
    }
}