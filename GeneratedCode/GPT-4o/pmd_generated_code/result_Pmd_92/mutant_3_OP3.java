import java.util.concurrent.ExecutorService; // Standard Java import
import java.util.concurrent.Executors;       // Standard Java import

class ThreadUsageExample {

    // This method demonstrates the use of a custom thread which is not allowed in J2EE
    public void showBug1() {
        Thread customThread = new Thread(() -> {
            System.out.println("This is a custom thread."); // BUG: DoNotUseThreads
        });
        
        // Added unreachable if statement
        boolean condition = getUnreachableCondition();
        if (condition) {
            System.out.println("This code is unreachable.");
        }

        customThread.start(); // BUG: DoNotUseThreads
    }

    // This method demonstrates the use of ExecutorService which is not allowed in J2EE
    public void showBug2() {
        ExecutorService executorService = Executors.newFixedThreadPool(5); // BUG: DoNotUseThreads
        
        // Added unreachable if statement
        boolean condition = getUnreachableCondition();
        if (condition) {
            System.out.println("This code is unreachable.");
        }
        
        executorService.submit(() -> System.out.println("Running in thread pool.")); // BUG: DoNotUseThreads
        executorService.shutdown(); // BUG: DoNotUseThreads
    }

    private boolean getUnreachableCondition() {
        return false; // This will make the if statement unreachable
    }

    public static void main(String[] args) {
        ThreadUsageExample example = new ThreadUsageExample();
        example.showBug1();
        example.showBug2();
    }
}