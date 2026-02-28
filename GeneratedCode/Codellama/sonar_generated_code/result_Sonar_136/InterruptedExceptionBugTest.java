import org.junit.Test;
import static org.junit.Assert.*;

public class InterruptedExceptionBugTest {
    @Test
    public void testBug() {
        InterruptedExceptionBug bug = new InterruptedExceptionBug();
        bug.showBug();
        assertTrue(Thread.currentThread().isInterrupted());
    }
}