import org.junit.Test;
import static org.junit.Assert.*;

public class FinalizeBugTest {
    @Test
    public void testBugTrigger() throws Throwable {
        FinalizeBug bug = new FinalizeBug("resource");
        bug.showBug(); // TRIGGER BUG: The "Object.finalize()" method should not be called
        assertNull("Resource should be released", bug.resource);
    }
}