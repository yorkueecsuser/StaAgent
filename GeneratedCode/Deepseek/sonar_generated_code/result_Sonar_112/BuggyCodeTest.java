import org.junit.Test;
import static org.junit.Assert.*;

public class BuggyCodeTest {
    BuggyCode buggyCode = new BuggyCode();

    @Test
    public void testShowBug() {
        int result = buggyCode.showBug();
        // TRIGGER BUG: A "for" loop update clause should move the counter in the right direction
        assertEquals(55, result); // This should fail because the bug is not fixed
    }
}