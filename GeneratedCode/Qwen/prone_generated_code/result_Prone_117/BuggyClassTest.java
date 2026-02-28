import org.junit.Test;
import static org.junit.Assert.*;

public class BuggyExampleTest {

    @Test
    public void testShowBug() {
        BuggyExample example = new BuggyExample();
        int result = example.showBug(); // TRIGGER BUG: NoCanIgnoreReturnValueOnClasses
        assertEquals(42, result); // This assertion will pass, but the presence of the annotation triggers the bug
    }
}