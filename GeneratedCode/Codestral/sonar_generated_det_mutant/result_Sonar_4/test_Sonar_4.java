import org.junit.Test;
import static org.junit.Assert.*;

public class MathClampBugTest {

    @Test
    public void testShowBugWithReversedMinMax() {
        MathClampBug bug = new MathClampBug();
        bug.showBug(5, 10, 20); // TRIGGER BUG: "Math.clamp" should be used with correct ranges
    }
}