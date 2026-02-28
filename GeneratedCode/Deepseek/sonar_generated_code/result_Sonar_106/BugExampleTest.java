import org.junit.Test;
import static org.junit.Assert.*;

public class BugExampleTest {
    @Test
    public void testShowBug() throws InterruptedException {
        BugExample bugExample = new BugExample();
        bugExample.showBug();
    }
}