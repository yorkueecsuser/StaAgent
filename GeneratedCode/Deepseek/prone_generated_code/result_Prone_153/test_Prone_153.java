import org.junit.Test;
import static org.junit.Assert.*;

public class BugExampleTest {

    @Test(expected = IllegalArgumentException.class)
    public void testShowBug() {
        BugExample bugExample = new BugExample();
        bugExample.showBug(); // Trigger line: 9
    }
}