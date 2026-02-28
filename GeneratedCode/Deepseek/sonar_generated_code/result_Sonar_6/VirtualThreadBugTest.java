import org.junit.Test;
import static org.junit.Assert.*;

public class VirtualThreadBugTest {
    @Test
    public void testSetPriority() {
        Thread t = Thread.ofVirtual().unstarted(() -> {});
        t.setPriority(1); // TRIGGER BUG: "setDaemon", "setPriority" and "getThreadGroup" should not be invoked on virtual threads
    }

    @Test
    public void testSetDaemon() {
        Thread t = Thread.ofVirtual().unstarted(() -> {});
        t.setDaemon(false); // TRIGGER BUG: "setDaemon", "setPriority" and "getThreadGroup" should not be invoked on virtual threads
    }

    @Test
    public void testGetThreadGroup() {
        Thread t = Thread.ofVirtual().unstarted(() -> {});
        var threadGroup = t.getThreadGroup(); // TRIGGER BUG: "setDaemon", "setPriority" and "getThreadGroup" should not be invoked on virtual threads
    }
}