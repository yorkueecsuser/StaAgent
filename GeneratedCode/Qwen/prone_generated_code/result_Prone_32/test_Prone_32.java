import org.junit.Test;
import static org.junit.Assert.*;

public class DeadThreadExampleTest {

    @Test
    public void testShowBugTriggersDeadThread() {
        DeadThreadExample example = new DeadThreadExample();
        example.showBug(); // TRIGGER BUG: DeadThread
        fail("This test should fail because the thread is never started."); // This assertion ensures the test fails
    }
}