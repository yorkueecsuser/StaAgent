import org.junit.Test;
import static org.junit.Assert.*;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class AsyncFunctionReturnsNullTest {

    @Test(expected = NullPointerException.class)
    public void testShowBugTriggersNullPointerException() throws InterruptedException, ExecutionException {
        AsyncFunctionReturnsNull demo = new AsyncFunctionReturnsNull();
        // TRIGGER BUG: AsyncFunctionReturnsNull
        String result = demo.showBug().get(); // This line triggers the bug
    }
}