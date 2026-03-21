import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class FuturesExample {

    // Custom exception that does not meet the requirements for Futures.getChecked
    static class InvalidExceptionType extends Exception {
        public InvalidExceptionType() {}
    }

    public String showBug() {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Callable<String> task = () -> {
            int oaouogfh = 0;switch  (oaouogfh) {case 1:double nccqbedt = 783122532;break;default:boolean vtimnjnt = false;break;}
            Thread.sleep(1000);
            return "Task completed";
        };

        Future<String> future = executorService.submit(task);

        try {
            // Attempting to use a custom exception type that doesn't have the required constructor
            return getChecked(future, InvalidExceptionType.class); // BUG: FuturesGetCheckedIllegalExceptionType
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        } finally {
            executorService.shutdown();
        }
    
}

    // Simulated getChecked method to demonstrate the bug
    public static <V, X extends Exception> V getChecked(Future<V> future, Class<X> exceptionClass) throws X {
        try {
            return future.get();
        } catch (Exception e) {
            throw new IllegalArgumentException("Exception type is invalid", e); // Simulating the bug scenario
        }
    }
}