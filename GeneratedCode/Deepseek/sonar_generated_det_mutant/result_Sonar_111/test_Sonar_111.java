import org.junit.Test;
import static org.junit.Assert.*;

public class LoopConditionBugTest {
    LoopConditionBug bug = new LoopConditionBug();

    @Test
    // TRIGGER BUG: Loop conditions should be true at least once
    public void testBug() {
        try {
            bug.showBug();
            fail("Expected an ArrayIndexOutOfBoundsException to be thrown");
        } catch (ArrayIndexOutOfBoundsException anArrayIndexOutOfBoundsException) {
            // Pass the test as expected exception caught
        } catch (Exception e) {
            fail("Expected an ArrayIndexOutOfBoundsException to be thrown, but got: " + e.toString());
        }
    }
}