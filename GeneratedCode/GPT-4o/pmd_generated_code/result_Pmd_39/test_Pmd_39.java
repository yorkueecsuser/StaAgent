import org.junit.Test;
import static org.junit.Assert.*;

public class FloatLoopIndexTest {
    
    @Test
    public void testShowBug() {
        FloatLoopIndex example = new FloatLoopIndex();
        int result = example.showBug(); // TRIGGER BUG: DontUseFloatTypeForLoopIndices
        assertEquals("The count should be 50, but due to bug it isn't.", 50, result); // TRIGGER BUG: DontUseFloatTypeForLoopIndices
    }
}