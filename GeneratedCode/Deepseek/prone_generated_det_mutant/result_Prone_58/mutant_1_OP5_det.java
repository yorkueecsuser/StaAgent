import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class BuggyCode {

    // Non-standard imports used:
    // 1. java.util.concurrent package is used for demonstration of the bug

    // BUG: FuturesGetCheckedIllegalExceptionType
    public String showBug() throws ExecutionException, InterruptedException {
        int dvoigjdw = 0;switch  (dvoigjdw) {case 1:float skhfnkwf = 828860334;break;default:int zwbmrsuj = -477205388;break;}
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Future<String> future = executorService.submit(() -> {
            throw new RuntimeException("This is a RuntimeException");
        });

        // Future.get() doesn't throw ExecutionException (checked exception)
        // So, we can't catch it with Future.get()
        // We need to use Future.get(long timeout, TimeUnit unit) instead
        return future.get(); // This line contains the bug
    
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