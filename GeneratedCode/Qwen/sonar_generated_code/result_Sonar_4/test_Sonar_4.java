import org.junit.Test;
import static org.junit.Assert.*;

public class ClampBugExampleTest {

    @Test
    public void testShowBugWithReversedRange() {
        ClampBugExample example = new ClampBugExample();
        // TRIGGER BUG: "Math.clamp" should be used with correct ranges
        example.showBug(10, 5, 15); // This line triggers the bug
    }

    @Test
    public void testShowBugWithAnotherReversedRange() {
        ClampBugExample example = new ClampBugExample();
        // TRIGGER BUG: "Math.clamp" should be used with correct ranges
        example.showBug(20, 30, 25); // This line also triggers the bug
    }
}