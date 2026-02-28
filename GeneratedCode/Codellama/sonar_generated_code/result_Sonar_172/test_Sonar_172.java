import org.junit.Test;
import static org.junit.Assert.*;

public class FinalizeBugTest {
    @Test
    public void testBugTrigger() {
        MyObject myObject = new MyObject();
        myObject.showBug();
        // TRIGGER BUG: "super.finalize()" should be called at the end of "Object.finalize()" implementations
    }
}