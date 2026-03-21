import org.junit.Test;
import static org.junit.Assert.*;

public class SynchronizationBugExampleTest {

    @Test
    public void testShowBugWithZero() {
        SynchronizationBugExample example = new SynchronizationBugExample();
        example.showBug(0); // TRIGGER BUG: Synchronization should not be done on instances of value-based classes
    }

    @Test
    public void testShowBugWithNonZero() {
        SynchronizationBugExample example = new SynchronizationBugExample();
        example.showBug(1); // TRIGGER BUG: Synchronization should not be done on instances of value-based classes
    }
}