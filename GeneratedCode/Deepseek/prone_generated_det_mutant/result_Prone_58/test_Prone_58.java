import org.junit.Test;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import static org.junit.Assert.*;

public class BuggyCodeTest {
    @Test
    // TRIGGER BUG: FuturesGetCheckedIllegalExceptionType
    public void showBug() throws ExecutionException, InterruptedException {
        BuggyCode buggyCode = new BuggyCode();
        buggyCode.showBug(); // This line triggers the bug
    }
}