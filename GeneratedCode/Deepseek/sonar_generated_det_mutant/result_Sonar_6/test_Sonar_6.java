import org.junit.Test;
import static org.junit.Assert.*;

public class VirtualThreadBugTest {
    VirtualThreadBug virtualThreadBug = new VirtualThreadBug();

    @Test
    public void testBugs() {
        try {
            virtualThreadBug.showBug();
            fail("Expected an IllegalArgumentException to be thrown");
        } catch (IllegalArgumentException anIllegalArgumentException) {
            // TRIGGER BUG: "setDaemon", "setPriority" and "getThreadGroup" should not be invoked on virtual threads
        }
    }
}