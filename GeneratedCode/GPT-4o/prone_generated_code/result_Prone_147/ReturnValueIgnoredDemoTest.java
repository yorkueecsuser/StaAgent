import org.junit.Test;
import static org.junit.Assert.*;

public class ReturnValueIgnoredDemoTest {

    @Test
    public void testShowBugWithNullInput() {
        ReturnValueIgnoredDemo demo = new ReturnValueIgnoredDemo();
        demo.showBug(null); // TRIGGER BUG: ReturnValueIgnored
    }

    @Test
    public void testShowBugWithNonEmptyInput() {
        ReturnValueIgnoredDemo demo = new ReturnValueIgnoredDemo();
        demo.showBug("Hello"); // This will pass as no exception is thrown
    }
}