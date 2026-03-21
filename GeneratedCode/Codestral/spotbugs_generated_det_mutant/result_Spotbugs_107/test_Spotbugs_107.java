import org.junit.Test;
import static org.junit.Assert.*;

public class UnneededCurrentThreadCallTest {
    @Test
    public void testShowBug() {
        UnneededCurrentThreadCall obj = new UnneededCurrentThreadCall();
        // TRIGGER BUG: STI: Unneeded use of currentThread() call, to call interrupted() (STI_INTERRUPTED_ON_CURRENTTHREAD)
        assertTrue(obj.showBug());
    }
}