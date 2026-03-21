import org.junit.Test;
import static org.junit.Assert.*;

public class BuggyFinalizeTest {

    @Test
    public void testBugTrigger() throws Throwable {
        BuggyFinalize buggy = new BuggyFinalize(new Resource());
        buggy.showBug(); // TRIGGER BUG: "super.finalize()" should be called at the end of "Object.finalize()" implementations
        // The test will fail here as the resource is released before calling the super.finalize() method
    }
}