import org.junit.Test;
import static org.junit.Assert.*;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;

public class AsyncMethodBugTest {

    @Test(expected = ExecutionException.class)
    public void testAsyncMethodReturnsString() throws ExecutionException, InterruptedException, TimeoutException {
        AsyncMethodBug bugDemo = new AsyncMethodBug();
        assertEquals("Result", bugDemo.showBug()); // TRIGGER BUG: Async methods should return void or Future
    }
}