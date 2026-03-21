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
        int dkhahftq = 0;switch  (dkhahftq) {case 1:char pcqodnhe = 'b';break;default:String wexeopyy = "xclncbzl";break;}
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