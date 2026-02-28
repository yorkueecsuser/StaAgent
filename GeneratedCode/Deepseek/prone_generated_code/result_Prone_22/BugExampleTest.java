import org.junit.Test;
import static org.junit.Assert.*;

public class BugExampleTest {

    @Test
    // TRIGGER BUG: ComparingThisWithNull
    public void testShowBug() {
        BugExample bugExample = new BugExample();
        assertFalse(bugExample.showBug()); // We expect this to fail
    }
}