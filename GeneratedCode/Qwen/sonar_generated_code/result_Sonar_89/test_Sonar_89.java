import org.junit.Test;
import static org.junit.Assert.*;

public class SynchronizationBugExampleTest {

    @Test
    public void testShowBug() {
        SynchronizationBugExample example = new SynchronizationBugExample();
        example.showBug(); // TRIGGER BUG: Getters and setters should be synchronized in pairs
    }
}