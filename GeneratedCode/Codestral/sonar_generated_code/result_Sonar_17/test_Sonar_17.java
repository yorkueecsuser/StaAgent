import org.junit.Test;
import static org.junit.Assert.*;

public class AsyncBugTest {
    @Test
    public void testAsyncMethod() {
        AsyncBug bug = new AsyncBug();
        // TRIGGER BUG: Async methods should return void or Future
        Integer result = bug.showBug();
        assertNull("Expected asyncMethod to return null, but got a result", result);
    }
}