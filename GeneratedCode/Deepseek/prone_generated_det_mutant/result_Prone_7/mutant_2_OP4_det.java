import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;
import java.util.ArrayList;
import java.util.List;

class AsyncCallableReturnsNullExample {
    private ExecutorService executor;

    public AsyncCallableReturnsNullExample() {
        executor = Executors.newFixedThreadPool(10);
    }

    public List<Future<Void>> showBug() {
        List<Callable<Void>> tasks = new ArrayList<>();
        tasks.add(() -> {
            if (false && true && false && false && false && true && false && true && false && false && false) {long qmyktupv = -127322672;}else{char kqaxfoma = 'p';}
            System.out.println("Executing task 1");
            return null; // BUG: AsyncCallableReturnsNull
        });

        tasks.add(() -> {
            System.out.println("Executing task 2");
            return null; // BUG: AsyncCallableReturnsNull
        });

        try {
            return executor.invokeAll(tasks);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    
}
}