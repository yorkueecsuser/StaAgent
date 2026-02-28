import org.junit.Test;
import static org.junit.Assert.*;

public class ThreadInterruptionExampleTest {

    @Test
    public void testShowBug() {
        ThreadInterruptionExample example = new ThreadInterruptionExample();
        
        // This will trigger the bug because the InterruptedException is not handled properly
        example.showBug(); // TRIGGER BUG: "InterruptedException" and "ThreadDeath" should not be ignored
        
        // We expect the thread to be interrupted, but as the interrupted state is not restored,
        // this test will fail, demonstrating the bug.
        assertTrue(Thread.currentThread().isInterrupted()); // TRIGGER BUG: "InterruptedException" and "ThreadDeath" should not be ignored
    }
}