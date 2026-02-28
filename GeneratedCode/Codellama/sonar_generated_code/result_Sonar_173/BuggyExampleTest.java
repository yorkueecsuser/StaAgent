import org.junit.Test;
import static org.junit.Assert.*;

public class BuggyExampleTest {
    @Test
    public void testDispose() throws Throwable {
        BuggyExample buggy = new BuggyExample();
        buggy.dispose(); // TRIGGER BUG: The "Object.finalize()" method should not be called
    }
}