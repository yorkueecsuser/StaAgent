import org.junit.Test;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

public class AsyncCallableExampleTest {

    @Test(expected = NullPointerException.class)
    public void testShowBugTriggersNullPointerException() throws ExecutionException, InterruptedException {
        AsyncCallableExample example = new AsyncCallableExample();
        Future<Void> result = example.showBug(); // TRIGGER BUG: AsyncCallableReturnsNull
        result.get(); // This will throw NullPointerException
    }
}