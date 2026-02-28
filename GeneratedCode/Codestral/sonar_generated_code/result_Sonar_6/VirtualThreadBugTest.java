import org.junit.Test;
import static org.junit.Assert.*;

public class VirtualThreadBugTest {
    @Test(expected = IllegalArgumentException.class)
    public void testSetDaemon() {
        VirtualThreadBug.showBug(); // TRIGGER BUG: "setDaemon" should not be invoked on a virtual thread with false argument
    }

    // JUnit 4 does not support testing for specific exception message, so we cannot directly test for priority change failure
    // However, we can indirectly test it by checking if the priority remains NORM_PRIORITY
    @Test
    public void testSetPriority() {
        Thread t = Thread.ofVirtual().unstarted(()->{});
        t.start();
        int initialPriority = t.getPriority();
        t.setPriority(2);
        int newPriority = t.getPriority();
        assertEquals(initialPriority, newPriority); // TRIGGER BUG: "setPriority" should not change the priority of a virtual thread
    }

    @Test
    public void testGetThreadGroup() {
        Thread t = Thread.ofVirtual().unstarted(()->{});
        t.start();
        var threadGroup = t.getThreadGroup();
        assertEquals("VirtualThreads", threadGroup.getName()); // TRIGGER BUG: "getThreadGroup" should not be used on a virtual thread
        assertEquals(0, threadGroup.activeCount()); // The virtual thread group should be empty
    }
}