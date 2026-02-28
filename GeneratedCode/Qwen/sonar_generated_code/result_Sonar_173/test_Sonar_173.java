import org.junit.Test;
import static org.junit.Assert.*;

public class FinalizeExampleTest {

    @Test
    public void testShowBugTriggersFinalize() {
        FinalizeExample example = new FinalizeExample();
        assertEquals("Check console for finalize method invocation", example.showBug()); // TRIGGER BUG: The "Object.finalize()" method should not be called
    }
}