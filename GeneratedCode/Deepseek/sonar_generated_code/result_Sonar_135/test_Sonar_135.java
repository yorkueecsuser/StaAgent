import org.junit.Test;
import static org.junit.Assert.*;

public class BugExampleTest {
    @Test
    public void testFinalizerCalled() {
        // TRIGGER BUG: "runFinalizersOnExit" should not be called
        BugExample.showBug();
    }
}