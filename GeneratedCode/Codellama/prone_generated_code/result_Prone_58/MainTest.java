import org.junit.Test;
import static org.junit.Assert.*;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

public class MainTest {
    @Test
    public void testBug() throws ExecutionException, InterruptedException {
        Main main = new Main();
        main.showBug();
        // TRIGGER BUG: FuturesGetCheckedIllegalExceptionType
    }
}