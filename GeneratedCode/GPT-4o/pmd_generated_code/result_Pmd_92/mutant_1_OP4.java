import java.util.concurrent.ExecutorService; // Standard Java import
import java.util.concurrent.Executors;       // Standard Java import

class ThreadUsageExample {
    
    // Method to simulate dynamic condition for unreachable branch
    private boolean getCondition() {
        return false; // Always returns false to simulate an unreachable branch
    }

    // This method demonstrates the use of a custom thread which is not allowed in J2EE
    public void showBug1() {
        // Adding an unreachable if-else statement
        if (getCondition()) {
            System.out.println("Unreachable branch for custom thread.");
        } else {
            Thread customThread = new Thread(() -> {
                System.out.println("This is a custom thread."); // BUG: DoNotUseThreads
            });
            customThread.start(); // BUG: DoNotUseThreads
        }
    }

    // This method demonstrates the use of ExecutorService which is not allowed in J2EE
    public void showBug2() {
        // Adding an unreachable if-else statement
        if (getCondition()) {
            System.out.println("Unreachable branch for executor service.");
        } else {
            ExecutorService executorService = Executors.newFixedThreadPool(5); // BUG: DoNotUseThreads
            executorService.submit(() -> System.out.println("Running in thread pool.")); // BUG: DoNotUseThreads
            executorService.shutdown(); // BUG: DoNotUseThreads
        }
    }

    public static void main(String[] args) {
        ThreadUsageExample example = new ThreadUsageExample();
        example.showBug1();
        example.showBug2();
    }
}