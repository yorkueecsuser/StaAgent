import org.junit.Test;
import static org.junit.Assert.*;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class AsyncFunctionReturnsNullBugTest {

    @Test // TRIGGER BUG: AsyncFunctionReturnsNull
    public void testAsyncFunctionReturnsNull() {
        try {
            AsyncFunctionReturnsNullBug.showBug();
            fail("Expected NullPointerException to be thrown");
        } catch (NullPointerException | InterruptedException | ExecutionException ignored) {
        }
    }
}