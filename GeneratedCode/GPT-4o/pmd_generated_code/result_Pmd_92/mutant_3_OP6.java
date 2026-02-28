import java.util.concurrent.ExecutorService; // Standard Java import
import java.util.concurrent.Executors;       // Standard Java import

class ThreadUsageExample {

    // This method demonstrates the use of a custom thread which is not allowed in J2EE
    public void showBug1() {
        Thread customThread = new Thread(() -> {
            System.out.println("This is a custom thread."); // BUG: DoNotUseThreads
        });
        customThread.start(); // BUG: DoNotUseThreads

        // Unreachable for loop mutant
        boolean conditionFor1 = getCondition();
        for (int i = 0; conditionFor1; i++) {
            System.out.println("This for loop is unreachable in showBug1.");
        }
    }

    // This method demonstrates the use of ExecutorService which is not allowed in J2EE
    public void showBug2() {
        ExecutorService executorService = Executors.newFixedThreadPool(5); // BUG: DoNotUseThreads
        executorService.submit(() -> System.out.println("Running in thread pool.")); // BUG: DoNotUseThreads
        executorService.shutdown(); // BUG: DoNotUseThreads

        // Unreachable for loop mutant
        boolean conditionFor2 = getCondition();
        for (int i = 0; conditionFor2; i++) {
            System.out.println("This for loop is unreachable in showBug2.");
        }
    }

    private boolean getCondition() {
        return false; // This method is used to create a condition that is always false at runtime
    }

    public static void main(String[] args) {
        ThreadUsageExample example = new ThreadUsageExample();
        example.showBug1();
        example.showBug2();
    }
}