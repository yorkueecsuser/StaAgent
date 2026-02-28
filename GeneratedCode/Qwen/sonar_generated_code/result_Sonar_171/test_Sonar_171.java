import org.junit.Test;
import static org.junit.Assert.*;

public class FinallyBlockJumpBugTest {

    @Test
    public void testShowBug() {
        FinallyBlockJumpBug demo = new FinallyBlockJumpBug();
        String result = demo.showBug(); // TRIGGER BUG: Jump statements should not occur in "finally" blocks
        assertEquals("ERROR", result); // This assertion will fail due to the bug
    }
}