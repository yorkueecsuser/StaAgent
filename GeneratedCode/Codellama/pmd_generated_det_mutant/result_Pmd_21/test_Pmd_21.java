import org.junit.Test;
import static org.junit.Assert.*;

public class CallSuperLastTest {
    @Test
    public void testShowBug() {
        CallSuperLast callSuperLast = new CallSuperLast();
        // TRIGGER BUG: CallSuperLast
        callSuperLast.showBug();
    }
}