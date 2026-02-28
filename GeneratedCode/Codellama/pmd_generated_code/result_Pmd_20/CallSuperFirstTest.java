import org.junit.Test;
import static org.junit.Assert.*;

public class CallSuperFirstTest {
    @Test
    public void testBugTrigger() {
        CallSuperFirst.showBug();
        // TRIGGER BUG: CallSuperFirst
    }
}