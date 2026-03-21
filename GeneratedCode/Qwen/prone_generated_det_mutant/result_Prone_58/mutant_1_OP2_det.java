import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;

class CustomUncheckedException extends RuntimeException {
    public CustomUncheckedException(String message) {
        super(message);
    }
}

class FuturesGetCheckedExample {
public void showBug() {
    ExecutorService executor = Executors.newSingleThreadExecutor();
    executor = Executors.newSingleThreadExecutor();
    Future < String > future = executor.submit(()-> "Result");
    try { throw new CustomUncheckedException("This is an unchecked exception"); } catch(ExecutionException | CustomUncheckedException e){ e.printStackTrace(); } finally { executor.shutdown(); }
}

    public static void main(String[] args) {
        FuturesGetCheckedExample example = new FuturesGetCheckedExample();
        example.showBug();
    }
}