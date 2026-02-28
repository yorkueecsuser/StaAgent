import java.util.concurrent.ExecutorService; // Standard Java import
import java.util.concurrent.Executors;       // Standard Java import

class ThreadUsageExample {

    // This method demonstrates the use of a custom thread which is not allowed in J2EE
    public void showBug1() {
        Thread customThread = new Thread(() -> {
            System.out.println("This is a custom thread."); // BUG: DoNotUseThreads
        });
        customThread.start(); // BUG: DoNotUseThreads
        
        // Unreachable for loop mutation
        boolean conditionFor = getCondition(); // Dynamic condition
        for (int i = 0; conditionFor; i++) {
            System.out.println("This is an unreachable for loop inside showBug1."); // Unreachable code
        }
    }

    // This method demonstrates the use of ExecutorService which is not allowed in J2EE
    public void showBug2() {
        ExecutorService executorService = Executors.newFixedThreadPool(5); // BUG: DoNotUseThreads
        executorService.submit(() -> System.out.println("Running in thread pool.")); // BUG: DoNotUseThreads
        executorService.shutdown(); // BUG: DoNotUseThreads
        
        // Unreachable for loop mutation
        boolean conditionFor = getCondition(); // Dynamic condition
        for (int i = 0; conditionFor; i++) {
            System.out.println("This is an unreachable for loop inside showBug2."); // Unreachable code
        }
    }

    // Method to provide a dynamic condition for control structures
    private boolean getCondition() {
        return false; // Always returns false, making the loop unreachable
    }

    public static void main(String[] args) {
        ThreadUsageExample example = new ThreadUsageExample();
        example.showBug1();
        example.showBug2();
    }
}