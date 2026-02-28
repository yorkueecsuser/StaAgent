import org.junit.Test;
import static org.junit.Assert.*;

public class FinalizeBugTest {

    @Test
    public void testFinalizeBug() {
        // TRIGGER BUG: "super.finalize()" should be called at the end of "Object.finalize()" implementations
        FinalizeBug bug = new FinalizeBug();
        bug.showBug();
        // The test should fail here since "super.finalize()" is not called at the end of "Object.finalize()" implementation
    }
}