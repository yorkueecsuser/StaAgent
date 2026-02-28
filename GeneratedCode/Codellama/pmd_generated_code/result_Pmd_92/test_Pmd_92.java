import org.junit.Test;
import static org.junit.Assert.*;

public class BuggyExampleTest {
    @Test
    public void testBuggyCode() {
        BuggyExample buggyExample = new BuggyExample();
        buggyExample.triggerBug();
        // TRIGGER BUG: DoNotUseThreads
        assertEquals(5, buggyExample.getThreadCount());
    }
}