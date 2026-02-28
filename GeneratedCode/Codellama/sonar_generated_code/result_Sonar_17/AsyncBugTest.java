import org.junit.Test;
import static org.junit.Assert.*;

public class AsyncBugTest {

    @Test
    public void testBuggyMethod() {
        AsyncBug asyncBug = new AsyncBug();
        CompletableFuture<String> result = asyncBug.buggyMethod("Hello, World!");
        // TRIGGER BUG: Async methods should return void or Future
        assertEquals("Hello, World!", result.join());
    }
}