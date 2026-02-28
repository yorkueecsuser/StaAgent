import org.junit.Test;
import static org.junit.Assert.*;

public class ConditionalReachabilityExampleTest {

    @Test
    public void testShowBug() {
        ConditionalReachabilityExample example = new ConditionalReachabilityExample();
        example.showBug(); // TRIGGER BUG: Conditionally executed code should be reachable
        fail("This test should trigger the bug with unreachable code."); // TRIGGER BUG: Conditionally executed code should be reachable
    }
}