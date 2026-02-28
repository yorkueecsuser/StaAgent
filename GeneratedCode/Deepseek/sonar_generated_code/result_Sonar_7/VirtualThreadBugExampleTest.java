import org.junit.Test;
import static org.junit.Assert.*;

public class VirtualThreadBugExampleTest {
    @Test
    public void testShowBug() {
        VirtualThreadBugExample bugExample = new VirtualThreadBugExample();
        bugExample.showBug();

        // TRIGGER BUG: Virtual threads should be used for tasks that include heavy blocking operations
        // The above line will trigger the bug as it starts a blocking operation on a regular thread
    }
}