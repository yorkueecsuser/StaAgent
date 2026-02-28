import org.junit.Test;
import static org.junit.Assert.*;

public class BuggyCodeTest {
    BuggyCode buggyCode = new BuggyCode();

    @Test
    public void testShowBug() {
        float result = buggyCode.showBug();
        assertEquals("TRIGGER BUG: Floating point numbers should not be tested for equality", 3.146f, result, 0);
        // Floating point numbers are not precise, and thus they should not be tested for equality.
        // This test case should fail.
    }
}