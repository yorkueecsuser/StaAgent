import org.junit.Test;
import static org.junit.Assert.*;

class BugDemoTest {
    @Test
    public void testBugDemo() {
        int x = 5;
        int y = 2;
        int z = 8;
        int result = x + y * z;
        assertEquals(40, result); // TRIGGER BUG: AvoidMultipleUnaryOperators
    }
}