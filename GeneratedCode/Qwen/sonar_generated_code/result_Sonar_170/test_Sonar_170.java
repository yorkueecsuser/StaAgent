import org.junit.Test;
import static org.junit.Assert.*;

public class FinalizeBugExampleTest {

    @Test
    public void testFinalizeMethodNotCalledByGC() {
        FinalizeBugExample example = new FinalizeBugExample();
        example.showBug(42); // TRIGGER BUG: The signature of "finalize()" should match that of "Object.finalize()"
    }

    @Test
    public void testFinalizeMethodReturn() {
        FinalizeBugExample example = new FinalizeBugExample();
        example.showBug(42); // TRIGGER BUG: The signature of "finalize()" should match that of "Object.finalize()"
    }
}