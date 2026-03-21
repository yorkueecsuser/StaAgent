import org.junit.Test;
import static org.junit.Assert.*;

public class MultiLockWaitBugDemoTest {

    @Test
    public void testShowBug() {
        MultiLockWaitBugDemo demo = new MultiLockWaitBugDemo();
        demo.showBug(); // TRIGGER BUG: "wait" should not be called when multiple locks are held
    }
}