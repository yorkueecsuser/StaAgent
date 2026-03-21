import org.junit.Test;
import static org.junit.Assert.*;

public class FinalizerBugDemoTest {

    @Test
    public void testShowBug() {
        // Attempt to trigger the bug in the code
        FinalizerBugDemo.showBug(); // TRIGGER BUG: "runFinalizersOnExit" should not be called
        fail("Expected an error when calling showBug due to unsafe runFinalizersOnExit usage.");
    }
}