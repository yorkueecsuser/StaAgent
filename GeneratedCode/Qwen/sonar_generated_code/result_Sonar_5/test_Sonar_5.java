import org.junit.Test;
import static org.junit.Assert.*;

public class VirtualThreadSynchronizationBugTest {

    @Test
    public void testShowBug1() {
        VirtualThreadSynchronizationBug bugDemo = new VirtualThreadSynchronizationBug();
        bugDemo.showBug1(); // TRIGGER BUG: Virtual threads should not run tasks that include synchronized code
    }

    @Test
    public void testShowBug2() {
        VirtualThreadSynchronizationBug bugDemo = new VirtualThreadSynchronizationBug();
        bugDemo.showBug2(); // TRIGGER BUG: Virtual threads should not run tasks that include synchronized code
    }
}