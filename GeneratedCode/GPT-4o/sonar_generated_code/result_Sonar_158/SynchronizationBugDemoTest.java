import org.junit.Test;
import static org.junit.Assert.*;

public class SynchronizationBugDemoTest {

    @Test
    public void testShowBug() {
        SynchronizationBugDemo demo = new SynchronizationBugDemo();
        demo.showBug(); // TRIGGER BUG: Synchronization should not be done on instances of value-based classes
    }
}