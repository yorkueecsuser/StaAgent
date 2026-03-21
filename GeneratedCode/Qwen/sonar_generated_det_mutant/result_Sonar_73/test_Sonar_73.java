import org.junit.Test;
import static org.junit.Assert.*;

public class SynchronizationBugExampleTest {

    @Test
    public void testShowBug() {
        SynchronizationBugExample example = new SynchronizationBugExample();
        example.showBug(); // TRIGGER BUG: Overrides should match their parent class methods in synchronization
    }
}