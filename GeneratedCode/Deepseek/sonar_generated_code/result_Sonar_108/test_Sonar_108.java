import org.junit.Test;
import static org.junit.Assert.*;

public class BugExampleTest {

    @Test
    public void testShowBug() throws InterruptedException {
        BugExample bugExample = new BugExample();
        bugExample.showBug();  // TRIGGER BUG: "Object.wait()", "Object.notify()" and "Object.notifyAll()" should only be called from synchronized code
    }
}