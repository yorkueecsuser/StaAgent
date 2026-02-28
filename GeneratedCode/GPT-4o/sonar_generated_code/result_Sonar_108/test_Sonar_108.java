import org.junit.Test;
import static org.junit.Assert.*;

public class WaitNotifyExampleTest {

    @Test
    public void testShowBug() {
        WaitNotifyExample example = new WaitNotifyExample();
        example.showBug(); // TRIGGER BUG: "Object.wait()", "Object.notify()" and "Object.notifyAll()" should only be called from synchronized code
    }
}