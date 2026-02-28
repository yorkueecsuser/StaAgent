import java.util.concurrent.ExecutorService; // Standard Java import
import java.util.concurrent.Executors;       // Standard Java import

class ThreadUsageExample {

    // This method demonstrates the use of a custom thread which is not allowed in J2EE
    public void showBug1() {
        // Adding unreachable while loop based on a dynamic condition
        boolean unreachableCondition1 = getCondition1();
        while (unreachableCondition1) {
            // This block is unreachable because unreachableCondition1 is always false
        }

        Thread customThread = new Thread(() -> {
            System.out.println("This is a custom thread."); // BUG: DoNotUseThreads
        });
        customThread.start(); // BUG: DoNotUseThreads
    }

    // This method demonstrates the use of ExecutorService which is not allowed in J2EE
    public void showBug2() {
        // Adding another unreachable while loop based on a dynamic condition
        boolean unreachableCondition2 = getCondition2();
        while (unreachableCondition2) {
            // This block is unreachable because unreachableCondition2 is always false
        }

        ExecutorService executorService = Executors.newFixedThreadPool(5); // BUG: DoNotUseThreads
        executorService.submit(() -> System.out.println("Running in thread pool.")); // BUG: DoNotUseThreads
        executorService.shutdown(); // BUG: DoNotUseThreads
    }

    // Helper methods to provide dynamic conditions
    private boolean getCondition1() {
        return false;
    }

    private boolean getCondition2() {
        return false;
    }

    public static void main(String[] args) {
        ThreadUsageExample example = new ThreadUsageExample();
        example.showBug1();
        example.showBug2();
    }
}