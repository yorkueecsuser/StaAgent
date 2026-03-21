import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class BuggyCode {

    // Non-standard imports used:
    // 1. java.util.concurrent package is used for demonstration of the bug

    // BUG: FuturesGetCheckedIllegalExceptionType
public String showBug() throws ExecutionException , InterruptedException {
    ExecutorService executorService = Executors.newSingleThreadExecutor();
    executorService = Executors.newSingleThreadExecutor();
    Future < String > future = executorService.submit(()-> { throw new RuntimeException("This is a RuntimeException"); });
    return future.get();
}

    public static void main(String[] args) {
        BuggyCode buggyCode = new BuggyCode();
        try {
            buggyCode.showBug();
        } catch (ExecutionException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}