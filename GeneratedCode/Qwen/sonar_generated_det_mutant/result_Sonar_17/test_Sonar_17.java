import org.junit.Test;
import static org.junit.Assert.*;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;

public class AsyncMethodBugTest {

    @Test(expected = ExecutionException.class)
    public void testShowBug() throws ExecutionException, InterruptedException, TimeoutException {
        AsyncMethodBug bugDemo = new AsyncMethodBug();
        assertEquals("This is a bug", bugDemo.showBug()); // TRIGGER BUG: Async methods should return void or Future
    }
}