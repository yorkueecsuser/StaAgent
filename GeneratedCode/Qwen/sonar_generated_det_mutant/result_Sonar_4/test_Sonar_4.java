import org.junit.Test;
import static org.junit.Assert.*;

public class ClampBugExampleTest {

    @Test
    public void testShowBugWithCorrectRange() {
        ClampBugExample example = new ClampBugExample();
        assertEquals(10, example.showBug(10, 5, 15)); // TRIGGER BUG: "Math.clamp" should be used with correct ranges
    }

    @Test
    public void testShowBugWithIncorrectRange() {
        ClampBugExample example = new ClampBugExample();
        example.showBug1(10, 5, 15); // TRIGGER BUG: "Math.clamp" should be used with correct ranges
    }
}