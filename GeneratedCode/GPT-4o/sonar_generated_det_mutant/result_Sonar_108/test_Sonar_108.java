import org.junit.Test;
import static org.junit.Assert.*;

public class WaitNotifyBugExampleTest {

    @Test
    public void testShowBug() {
        WaitNotifyBugExample example = new WaitNotifyBugExample();
        example.showBug(); // TRIGGER BUG: "Object.wait()", "Object.notify()" and "Object.notifyAll()" should only be called from synchronized code
    }
}