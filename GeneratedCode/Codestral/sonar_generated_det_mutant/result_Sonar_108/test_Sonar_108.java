import org.junit.Test;
import static org.junit.Assert.*;

public class IllegalMonitorStateExampleTest {

    @Test
    public void testShowBug() {
        IllegalMonitorStateExample example = new IllegalMonitorStateExample();
        example.showBug(); // TRIGGER BUG: "Object.wait()", "Object.notify()" and "Object.notifyAll()" should only be called from synchronized code
    }
}