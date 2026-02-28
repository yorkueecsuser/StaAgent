import org.junit.Test;
import static org.junit.Assert.*;

public class BuggyClassTest {
    @Test
    public void testFinalizeDoesNotCallSuperFinalize() {
        BuggyClass buggy = new BuggyClass();
        buggy.showBug();
        fail("The bug was not triggered");
    }
}