import org.junit.Test;
import static org.junit.Assert.*;
import java.util.concurrent.ExecutionException;

public class BuggyAsyncCallableTest {

    @Test
    public void testBuggyAsyncCallable() throws ExecutionException, InterruptedException {
        // TRIGGER BUG: AsyncCallableReturnsNull
        String result = BuggyAsyncCallable.showBug();
        assertNotNull(result); // The bug will trigger a NullPointerException if result is null
    }
}