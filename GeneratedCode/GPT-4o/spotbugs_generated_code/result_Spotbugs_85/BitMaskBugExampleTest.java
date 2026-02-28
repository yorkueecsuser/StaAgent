import org.junit.Test;
import static org.junit.Assert.*;

public class BitMaskBugExampleTest {

    @Test
    public void testShowBug() {
        BitMaskBugExample example = new BitMaskBugExample();
        
        // Test case that triggers the bug
        // For inputs (5, 4, 2), the result should be false due to incompatible masks
        // This assertion is designed to fail, demonstrating the bug
        assertTrue(example.showBug(5, 4, 2)); // TRIGGER BUG: BIT: Incompatible bit masks (BIT_AND)
    }
}