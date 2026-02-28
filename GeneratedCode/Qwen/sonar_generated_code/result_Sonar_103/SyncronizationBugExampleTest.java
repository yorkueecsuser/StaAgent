import org.junit.Test;
import static org.junit.Assert.*;

public class SyncronizationBugExampleTest {

    @Test
    public void testShowBug() throws InterruptedException {
        SyncronizationBugExample example = new SyncronizationBugExample();
        String result = example.showBug(); // TRIGGER BUG: Blocks should be synchronized on "private final" fields
        assertEquals("green", result); // This assertion will likely fail due to the race condition
    }
}