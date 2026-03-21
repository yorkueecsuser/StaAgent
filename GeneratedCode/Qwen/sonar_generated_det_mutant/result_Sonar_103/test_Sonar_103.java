import org.junit.Test;
import static org.junit.Assert.*;

public class SyncronizationBugExampleTest {

    @Test
    public void testShowBug() {
        SyncronizationBugExample example = new SyncronizationBugExample();
        example.showBug(); // TRIGGER BUG: Blocks should be synchronized on "private final" fields
    }
}