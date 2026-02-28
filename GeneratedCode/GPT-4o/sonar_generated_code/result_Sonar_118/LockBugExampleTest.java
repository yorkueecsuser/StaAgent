import org.junit.Test;
import static org.junit.Assert.*;

public class LockBugExampleTest {

    @Test
    public void testShowBugWithInitializedFalse() {
        LockBugExample example = new LockBugExample();
        example.showBug(false); // TRIGGER BUG: Locks should be released on all paths
    }

    @Test
    public void testShowBugWithInitializedTrue() {
        LockBugExample example = new LockBugExample();
        example.showBug(true); // TRIGGER BUG: Locks should be released on all paths
    }
}