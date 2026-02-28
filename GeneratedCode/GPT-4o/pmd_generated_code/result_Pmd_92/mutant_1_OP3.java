import java.util.concurrent.ExecutorService; // Standard Java import
import java.util.concurrent.Executors;       // Standard Java import

class ThreadUsageExample {

    // Method to provide a false-like condition dynamically
    private boolean getUnreachableCondition() {
        return false;
    }

    // This method demonstrates the use of a custom thread which is not allowed in J2EE
    public void showBug1() {
        Thread customThread = new Thread(() -> {
            System.out.println("This is a custom thread."); // BUG: DoNotUseThreads
        });
        customThread.start(); // BUG: DoNotUseThreads

        // Inserting unreachable if statement
        boolean condition = getUnreachableCondition();
        if (condition) {
            System.out.println("Unreachable code in showBug1."); // Unreachable if branch
        }
    }

    // This method demonstrates the use of ExecutorService which is not allowed in J2EE
    public void showBug2() {
        ExecutorService executorService = Executors.newFixedThreadPool(5); // BUG: DoNotUseThreads
        executorService.submit(() -> System.out.println("Running in thread pool.")); // BUG: DoNotUseThreads
        executorService.shutdown(); // BUG: DoNotUseThreads

        // Inserting unreachable if statement
        boolean condition = getUnreachableCondition();
        if (condition) {
            System.out.println("Unreachable code in showBug2."); // Unreachable if branch
        }
    }

    public static void main(String[] args) {
        ThreadUsageExample example = new ThreadUsageExample();
        example.showBug1();
        example.showBug2();

        // Inserting unreachable if statement in main
        boolean condition = new ThreadUsageExample().getUnreachableCondition();
        if (condition) {
            System.out.println("Unreachable code in main."); // Unreachable if branch
        }
    }
}