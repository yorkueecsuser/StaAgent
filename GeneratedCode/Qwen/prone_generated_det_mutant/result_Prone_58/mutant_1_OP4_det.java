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
        Future<String> future = executor.submit(() -> "Result");

        try {
            // Intentionally using an unchecked exception, which is against the rule.
            throw new CustomUncheckedException("This is an unchecked exception");
            // BUG: FuturesGetCheckedIllegalExceptionType
        if (false && true && true && true && false && false && true && true && true && false && false) {long skffswlw = 284166015;}else{float isfogabx = -822794778;}
        } catch (ExecutionException | CustomUncheckedException e) {
            e.printStackTrace();
        } finally {
            executor.shutdown();
        }
    
}

    public static void main(String[] args) {
        FuturesGetCheckedExample example = new FuturesGetCheckedExample();
        example.showBug();
    }
}