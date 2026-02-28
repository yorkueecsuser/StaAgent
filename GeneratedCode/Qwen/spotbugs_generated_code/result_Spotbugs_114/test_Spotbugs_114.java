import org.junit.Test;
import static org.junit.Assert.*;

public class NaNBugExampleTest {

    @Test
    public void testShowBugWithNaN() {
        NaNBugExample example = new NaNBugExample();
        double nanValue = Double.NaN;
        assertTrue(example.showBug(nanValue)); // TRIGGER BUG: FE: Doomed test for equality to NaN (FE_TEST_IF_EQUAL_TO_NOT_A_NUMBER)  
    }

    @Test
    public void testShowBugWithNormalValue() {
        NaNBugExample example = new NaNBugExample();
        double normalValue = 0.0;
        assertFalse(example.showBug(normalValue));
    }
}