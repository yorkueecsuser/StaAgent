import org.junit.Test;
import static org.junit.Assert.*;

public class BuggyThreadsTest {
    @Test
    public void testShowBug() {
        BuggyThreads buggyThreads = new BuggyThreads();
        buggyThreads.showBug(); // TRIGGER BUG: "Object.wait()", "Object.notify()" and "Object.notifyAll()" should only be called from synchronized code
    }
}