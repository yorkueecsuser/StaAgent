import org.junit.Test;
import static org.junit.Assert.*;

public class BugExampleTest {
    // TRIGGER BUG: The "Object.finalize()" method should not be called
    @Test
    public void showBugShouldNotCallFinalize() throws Throwable {
        BugExample bugExample = new BugExample();
        bugExample.showBug();  // TRIGGER BUG: The "Object.finalize()" method should not be called
    }
}