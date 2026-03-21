import org.junit.Test;
import static org.junit.Assert.*;

public class BuggyForLoopTest {
    BuggyForLoop buggyForLoop = new BuggyForLoop();

    @Test
    // TRIGGER BUG: A "for" loop update clause should move the counter in the right direction
    public void testShowBug() {
        int result = buggyForLoop.showBug();
        // The test should never reach this part because the bug in the showBug method makes the for loop infinite
        fail();
    }
}