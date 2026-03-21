import org.junit.Test;
import static org.junit.Assert.*;

public class BugExampleTest {

    @Test
    public void testShowBug() {
        BugExample bugExample = new BugExample();
        assertEquals(2, bugExample.showBug()); // TRIGGER BUG: "wait(...)" should be used instead of "Thread.sleep(...)" when a lock is held
    }
}