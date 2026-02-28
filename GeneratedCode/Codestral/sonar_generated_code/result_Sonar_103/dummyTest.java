import org.junit.Test;
import static org.junit.Assert.*;

public class SynchronizationBugTest {
    @Test
    public void testDoSomething() throws InterruptedException {
        SynchronizationBug bug = new SynchronizationBug();
        bug.showBug();
        // TRIGGER BUG: Blocks should be synchronized on "private final" fields
        // The bug is triggered when multiple threads enter the synchronized block in the doSomething method
        // since the block is not synchronized on a "private final" field.
    }
}