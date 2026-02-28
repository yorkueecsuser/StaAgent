import org.junit.Test;
import static org.junit.Assert.*;

public class ClampBugDemonstrationTest {

    @Test
    public void testShowBugReversedMinMax() {
        ClampBugDemonstration demo = new ClampBugDemonstration();
        demo.showBug(5.0, 10.0, 2.0); // TRIGGER BUG: "Math.clamp" should be used with correct ranges
    }

    @Test
    public void testShowBugValidRange() {
        ClampBugDemonstration demo = new ClampBugDemonstration();
        double result = demo.showBug(5.0, 2.0, 10.0);
        assertEquals(5.0, result, 0.0);
    }
}