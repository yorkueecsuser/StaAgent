import java.util.concurrent.ExecutorService; // Standard Java import
import java.util.concurrent.Executors;       // Standard Java import

class ThreadUsageExample {

    private boolean getFalseCondition() {
        return false;
    }

    // This method demonstrates the use of a custom thread which is not allowed in J2EE
    public void showBug1() {
        if (getFalseCondition()) {
            System.out.println("This if block is unreachable.");
        }
        Thread customThread = new Thread(() -> {
            System.out.println("This is a custom thread."); // BUG: DoNotUseThreads
        });
        customThread.start(); // BUG: DoNotUseThreads
    }

    // This method demonstrates the use of ExecutorService which is not allowed in J2EE
    public void showBug2() {
        boolean condition = getFalseCondition();
        if (condition) {
            System.out.println("This if block is also unreachable.");
        }
        ExecutorService executorService = Executors.newFixedThreadPool(5); // BUG: DoNotUseThreads
        executorService.submit(() -> System.out.println("Running in thread pool.")); // BUG: DoNotUseThreads
        executorService.shutdown(); // BUG: DoNotUseThreads
    }

    public static void main(String[] args) {
        ThreadUsageExample example = new ThreadUsageExample();
        example.showBug1();
        example.showBug2();
    }
}