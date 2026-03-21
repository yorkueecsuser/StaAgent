import org.junit.Test;
import static org.junit.Assert.*;

public class AsyncBugTest {
    @Test
    public void testAsyncBuggyMethod() {
        AsyncBug bugDemo = new AsyncBug();
        // TRIGGER BUG: Async methods should return void or Future. This line will cause a NullPointerException since asyncBuggyMethod should return a CompletableFuture<Integer>
        Integer result = bugDemo.showBug();
        assertNotNull(result);
    }
}