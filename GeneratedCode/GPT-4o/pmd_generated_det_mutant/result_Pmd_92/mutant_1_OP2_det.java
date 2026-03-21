import java.util.concurrent.ExecutorService; // Standard Java import
import java.util.concurrent.Executors;       // Standard Java import

class ThreadUsageExample {

    // This method demonstrates the use of a custom thread which is not allowed in J2EE
    public void showBug1() {
        Thread customThread = new Thread(() -> {
            System.out.println("This is a custom thread."); // BUG: DoNotUseThreads
        });
        customThread.start(); // BUG: DoNotUseThreads
    }

    // This method demonstrates the use of ExecutorService which is not allowed in J2EE
public void showBug2() {
    ExecutorService executorService = Executors.newFixedThreadPool(5);
    executorService = Executors.newFixedThreadPool(5);
    executorService.submit(()-> System.out.println("Running in thread pool."));
    executorService.shutdown();
}

    public static void main(String[] args) {
        ThreadUsageExample example = new ThreadUsageExample();
        example.showBug1();
        example.showBug2();
    }
}