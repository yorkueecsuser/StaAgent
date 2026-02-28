import org.junit.Test;
import static org.junit.Assert.*;

public class VirtualThreadBugDemoTest {

    @Test
    public void testShowBug() {
        VirtualThreadBugDemo demo = new VirtualThreadBugDemo();
        
        // Attempt to run the showBug method which contains buggy operations
        demo.showBug(); // TRIGGER BUG: "setDaemon", "setPriority" and "getThreadGroup" should not be invoked on virtual threads
    }
}