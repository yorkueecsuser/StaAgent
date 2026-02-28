import org.junit.Test;
import static org.junit.Assert.*;

public class DummyFrameTest {
    @Test
    public void testAddNotify() {
        DummyFrame frame = new DummyFrame();
        frame.showBug(); // TRIGGER BUG: CallSuperLast
        // The bug is triggered when showBug() is called, as it causes addNotify() to be called.
        // addNotify() does not call super.addNotify() at the beginning of the method, which is the bug.
    }
}