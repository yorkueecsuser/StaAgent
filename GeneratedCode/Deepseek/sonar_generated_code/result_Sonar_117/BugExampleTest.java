import org.junit.Test;
import static org.junit.Assert.*;

public class BugExampleTest {
    @Test
    // TRIGGER BUG: "toString()" and "clone()" methods should not return null
    public void testBugExample() {
        BugExample bugExample = new BugExample();
        bugExample.showBug();
    }
}