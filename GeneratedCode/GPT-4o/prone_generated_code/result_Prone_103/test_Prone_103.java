import org.junit.Test;
import static org.junit.Assert.*;

public class LossyPrimitiveCompareExampleTest {

    @Test
    public void testShowBugWithMaxInt() {
        LossyPrimitiveCompareExample example = new LossyPrimitiveCompareExample();
        int result = example.showBug(Integer.MAX_VALUE, Integer.MAX_VALUE - 1); // TRIGGER BUG: LossyPrimitiveCompare
        assertNotEquals(0, result); // This should fail, triggering the bug
    }

    @Test
    public void testShowBugWithSameValue() {
        LossyPrimitiveCompareExample example = new LossyPrimitiveCompareExample();
        int result = example.showBug(100, 100); // TRIGGER BUG: LossyPrimitiveCompare
        assertEquals(0, result); // This should pass, showing a correct comparison
    }

    @Test
    public void testShowBugWithDifferentValues() {
        LossyPrimitiveCompareExample example = new LossyPrimitiveCompareExample();
        int result = example.showBug(100, 101); // TRIGGER BUG: LossyPrimitiveCompare
        assertTrue(result < 0); // This should pass, showing a correct comparison
    }
}