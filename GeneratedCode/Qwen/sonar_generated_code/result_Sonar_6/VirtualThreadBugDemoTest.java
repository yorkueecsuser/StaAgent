import org.junit.Test;
import static org.junit.Assert.*;

public class VirtualThreadBugDemoTest {

    @Test
    public void testShowBug() {
        VirtualThreadBugDemo demo = new VirtualThreadBugDemo();
        demo.showBug(); // TRIGGER BUG: "setDaemon", "setPriority" and "getThreadGroup" should not be invoked on virtual threads
    }
}