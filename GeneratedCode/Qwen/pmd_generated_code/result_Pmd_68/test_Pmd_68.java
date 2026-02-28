import org.junit.Test;
import static org.junit.Assert.*;

public class BugDemoTest {

    @Test
    public void testShowBug() {
        BugDemo demo = new BugDemo();
        String result = demo.showBug(); // TRIGGER BUG: ReturnFromFinallyBlock
        assertEquals("Expected result", "A. O. K.", result);
    }
}