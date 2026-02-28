import org.junit.Test;
import static org.junit.Assert.*;

public class MathClampBugTest {
    @Test
    public void testShowBug() {
        // TRIGGER BUG: "Math.clamp" should be used with correct ranges
        assertEquals("showBug() should fail for min > max", IllegalArgumentException.class, MathClampBug.showBug());
    }
}