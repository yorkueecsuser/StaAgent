import org.junit.Test;
import static org.junit.Assert.*;

public class FinalizeBugDemoTest {

    @Test
    public void testFinalizeBug() {
        FinalizeBugDemo.showBug();
        // TRIGGER BUG: FinalizeDoesNotCallSuperFinalize
        // The test fails because the FinalizeBug class's finalize() method doesn't call super.finalize(),
        // which can lead to unpredictable behavior as the Object class's finalize() method is not called.
    }
}