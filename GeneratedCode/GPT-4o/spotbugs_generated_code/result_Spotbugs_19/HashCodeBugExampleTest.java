import org.junit.Test;
import static org.junit.Assert.*;

public class HashCodeBugExampleTest {

    @Test
    public void testShowBugWithPolygenelubricants() {
        HashCodeBugExample example = new HashCodeBugExample();
        int result = example.showBug("polygenelubricants"); // TRIGGER BUG: RV: Bad attempt to compute absolute value of signed 32-bit hashcode (RV_ABSOLUTE_VALUE_OF_HASHCODE)
        assertTrue("Expected a non-negative result", result >= 0);
    }

    @Test
    public void testShowBugWithGydZG_() {
        HashCodeBugExample example = new HashCodeBugExample();
        int result = example.showBug("GydZG_"); // TRIGGER BUG: RV: Bad attempt to compute absolute value of signed 32-bit hashcode (RV_ABSOLUTE_VALUE_OF_HASHCODE)
        assertTrue("Expected a non-negative result", result >= 0);
    }

    @Test
    public void testShowBugWithDesigningWorkhouses() {
        HashCodeBugExample example = new HashCodeBugExample();
        int result = example.showBug("DESIGNING WORKHOUSES"); // TRIGGER BUG: RV: Bad attempt to compute absolute value of signed 32-bit hashcode (RV_ABSOLUTE_VALUE_OF_HASHCODE)
        assertTrue("Expected a non-negative result", result >= 0);
    }
}