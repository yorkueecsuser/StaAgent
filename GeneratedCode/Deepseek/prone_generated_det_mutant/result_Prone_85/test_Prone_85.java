import org.junit.Test;
import static org.junit.Assert.*;

public class BugExampleTest {
    BugExample bugExample = new BugExample();

    @Test
    public void testShowBug() {
        // TRIGGER BUG: IsInstanceIncompatibleType
        bugExample.showBug();
    }
}