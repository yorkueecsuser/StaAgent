import org.junit.Test;
import static org.junit.Assert.*;

public class VirtualThreadBugDemoTest {

    @Test
    public void testShowBug() {
        VirtualThreadBugDemo demo = new VirtualThreadBugDemo();
        demo.showBug(); // TRIGGER BUG: Virtual threads should not run tasks that include synchronized code
        // The test will fail due to the bug as it involves virtual threads running synchronized code
    }
}