import org.junit.Test;
import static org.junit.Assert.*;

public class BuggyCodeTest {
    @Test
    public void testShowBug() {
        BuggyCode buggyCode = new BuggyCode();
        // TRIGGER BUG: DLS: Overwritten increment (DLS_OVERWRITTEN_INCREMENT)
        assertNotEquals(1, buggyCode.showBug());
    }
}