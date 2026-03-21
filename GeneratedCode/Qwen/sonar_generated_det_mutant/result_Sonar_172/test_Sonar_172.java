import org.junit.Test;
import static org.junit.Assert.*;

public class FinalizeBugExampleTest {

    @Test
    public void testFinalizeOrder() {
        FinalizeBugExample example = new FinalizeBugExample();
        String result = example.showBug();  // TRIGGER BUG: "super.finalize()" should be called at the end of "Object.finalize()" implementations
        assertEquals("Check console for resource release message order", result);
    }
}