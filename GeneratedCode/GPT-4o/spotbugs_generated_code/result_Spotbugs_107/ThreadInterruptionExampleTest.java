import org.junit.Test;
import static org.junit.Assert.*;

public class ThreadInterruptionExampleTest {

    @Test
    public void testShowBug() {
        ThreadInterruptionExample example = new ThreadInterruptionExample();
        boolean result = example.showBug(); // TRIGGER BUG: STI: Unneeded use of currentThread() call, to call interrupted() (STI_INTERRUPTED_ON_CURRENTTHREAD)
        assertFalse("The current thread's interrupted status should be false.", result); // This assertion will fail, thus triggering the bug
    }
}