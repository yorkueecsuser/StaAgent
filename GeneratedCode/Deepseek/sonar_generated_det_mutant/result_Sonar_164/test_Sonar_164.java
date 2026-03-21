import org.junit.Test;
import static org.junit.Assert.*;

public class FloatingPointBugTest {
    FloatingPointBug bug = new FloatingPointBug();

    @Test
    public void testTriggerBug() {
        bug.showBug(); // TRIGGER BUG: Floating point numbers should not be tested for equality
    }
}