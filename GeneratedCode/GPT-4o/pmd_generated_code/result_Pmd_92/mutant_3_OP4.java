import java.util.concurrent.ExecutorService; // Standard Java import
import java.util.concurrent.Executors;       // Standard Java import

class ThreadUsageExample {

    // This method demonstrates the use of a custom thread which is not allowed in J2EE
    public void showBug1() {
        Thread customThread = new Thread(() -> {
            System.out.println("This is a custom thread."); // BUG: DoNotUseThreads
        });
        customThread.start(); // BUG: DoNotUseThreads
        
        // Unreachable if-else statement mutant
        boolean condition = getFalseCondition();
        if (condition) {
            System.out.println("Unreachable code in showBug1.");
        } else {
            // This branch is always executed
        }
    }

    // This method demonstrates the use of ExecutorService which is not allowed in J2EE
    public void showBug2() {
        ExecutorService executorService = Executors.newFixedThreadPool(5); // BUG: DoNotUseThreads
        executorService.submit(() -> System.out.println("Running in thread pool.")); // BUG: DoNotUseThreads
        executorService.shutdown(); // BUG: DoNotUseThreads
        
        // Unreachable if-else statement mutant
        boolean condition = getFalseCondition();
        if (condition) {
            System.out.println("Unreachable code in showBug2.");
        } else {
            // This branch is always executed
        }
    }

    // Method to provide a condition that is always false
    private boolean getFalseCondition() {
        return false;
    }

    public static void main(String[] args) {
        ThreadUsageExample example = new ThreadUsageExample();
        example.showBug1();
        example.showBug2();
    }
}