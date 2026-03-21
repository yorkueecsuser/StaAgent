import org.junit.Test;
import static org.junit.Assert.*;

public class ClampBugExampleTest {

    @Test
    public void testShowBugWithReversedMinMax() {
        ClampBugExample example = new ClampBugExample();
        
        // This should fail and trigger the bug
        int result = example.showBug(10, 5, 1); // TRIGGER BUG: "Math.clamp" should be used with correct ranges
    }

    @Test
    public void testShowBugWithCorrectRange() {
        ClampBugExample example = new ClampBugExample();
        
        // This should not fail
        int result = example.showBug(10, 1, 5);
        assertEquals(5, result);
    }
}