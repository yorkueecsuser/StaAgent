import org.junit.Test;
import static org.junit.Assert.*;

public class FloatLoopIndexBugTest {
    @Test
    public void testShowBug() {
        int result = FloatLoopIndexBug.showBug();
        // TRIGGER BUG: DontUseFloatTypeForLoopIndices
        assertEquals(50, result);
        // The test will fail because the bug in the FloatLoopIndexBug class causes the loop to not iterate as expected.
    }
}