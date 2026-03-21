import org.junit.Test;
import static org.junit.Assert.*;

public class NotifyBugExampleTest {

    @Test
    public void testNotifyBugExample() {
        NotifyBugExample example = new NotifyBugExample();
        int result = example.showBug(); // TRIGGER BUG: "notifyAll()" should be preferred over "notify()"
        assertEquals("Expected sharedResource to be 3 due to all threads incrementing it", 3, result);
    }
}