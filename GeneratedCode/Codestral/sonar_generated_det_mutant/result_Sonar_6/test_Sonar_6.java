import org.junit.Test;
import static org.junit.Assert.*;

public class VirtualThreadBugTest {

    @Test
    public void testShowBug() {
        VirtualThreadBug bug = new VirtualThreadBug();
        bug.showBug(); // this line should trigger the bug as it calls showBug() which contains the buggy lines
        // TRIGGER BUG: "setDaemon", "setPriority" and "getThreadGroup" should not be invoked on virtual threads
    }
}