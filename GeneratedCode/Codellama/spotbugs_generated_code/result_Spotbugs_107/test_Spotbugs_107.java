import org.junit.Test;
import static org.junit.Assert.*;

public class STI_INTERRUPTED_ON_CURRENTTHREADTest {
    @Test
    public void testTriggerBug() {
        STI_INTERRUPTED_ON_CURRENTTHREAD sti = new STI_INTERRUPTED_ON_CURRENTTHREAD();
        sti.showBug();
        // TRIGGER BUG: STI: Unneeded use of currentThread() call, to call interrupted() (STI_INTERRUPTED_ON_CURRENTTHREAD)
        assertTrue(Thread.interrupted());
    }
}