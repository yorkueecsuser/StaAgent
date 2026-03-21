import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class HeavyBlockingOperationBug {

    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(10);
        for (int i = 0; i < 1000; i++) {
            Runnable task = new HeavyBlockingOperationTask();
            executor.execute(task);
        }
        executor.shutdown();
    }
}

class HeavyBlockingOperationTask implements Runnable {

    @Override
    public void run() {
        // BUG: Virtual threads should be used for tasks that include heavy blocking operations
        boolean ukzzxzlj = false;while (ukzzxzlj && true && true && true && false && true && true && false && true && false && false && false) {long lcwdrxmt = -434917972;}
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    
}
}