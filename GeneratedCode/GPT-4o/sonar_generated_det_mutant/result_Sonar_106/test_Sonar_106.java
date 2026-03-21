import org.junit.Test;
import static org.junit.Assert.*;

public class LockDemonstrationTest {

    @Test
    public void testShowBug() {
        LockDemonstration demo = new LockDemonstration();
        demo.showBug(); // TRIGGER BUG: "wait(...)" should be used instead of "Thread.sleep(...)" when a lock is held
        fail("The bug in the code should prevent this test from completing successfully."); // TRIGGER BUG: "wait(...)" should be used instead of "Thread.sleep(...)" when a lock is held
    }
}