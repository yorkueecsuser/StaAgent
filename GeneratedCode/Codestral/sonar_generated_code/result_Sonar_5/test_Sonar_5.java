import org.junit.Test;
import static org.junit.Assert.*;

public class VirtualThreadBugTest {

    @Test
    public void testShowBug() {
        VirtualThreadBug bug = new VirtualThreadBug();
        bug.showBug();
        // TRIGGER BUG: Virtual threads should not run tasks that include synchronized code
        // The bug is triggered when a virtual thread executes a synchronized block, causing the virtual thread to stay pinned to the underlying OS thread during its execution.
    }
}