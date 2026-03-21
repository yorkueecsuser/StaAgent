import org.junit.Test;
import static org.junit.Assert.*;

public class BugExampleTest {
    @Test
    public void testRecursiveCall() {
        BugExample.showBug(); // This line triggers the bug
    }
}