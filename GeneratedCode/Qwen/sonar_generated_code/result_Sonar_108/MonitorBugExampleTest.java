import org.junit.Test;
import static org.junit.Assert.*;

public class MonitorBugExampleTest {

    @Test
    public void testShowBug() {
        MonitorBugExample example = new MonitorBugExample();
        example.showBug(); // TRIGGER BUG: "Object.wait()", "Object.notify()" and "Object.notifyAll()" should only be called from synchronized code
    }
}