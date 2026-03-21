import org.junit.Test;
import static org.junit.Assert.*;

public class ThreadBugExampleTest {

    @Test
    public void testRunWithInterruptedException() {
        ThreadBugExample tbe = new ThreadBugExample();
        tbe.runWithInterruptedException();
    }

    @Test
    public void testRunWithThreadDeath() {
        ThreadBugExample tbe = new ThreadBugExample();
        tbe.runWithThreadDeath(); // TRIGGER BUG: "InterruptedException" and "ThreadDeath" should not be ignored
    }
}