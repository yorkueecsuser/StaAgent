import java.util.concurrent.ExecutorService; // Standard Java import
import java.util.concurrent.Executors;       // Standard Java import

class ThreadUsageExample {

    // This method demonstrates the use of a custom thread which is not allowed in J2EE
    public void showBug1() {
        Thread customThread = new Thread(() -> {
            System.out.println("This is a custom thread."); // BUG: DoNotUseThreads
        });
        customThread.start(); // BUG: DoNotUseThreads

        // Inserting an unreachable switch statement
        int unreachableSwitchValue = getUnreachableValue();
        switch (unreachableSwitchValue) {
            case 1:
                System.out.println("Unreachable case 1");
                break;
            case 2:
                System.out.println("Unreachable case 2");
                break;
            default:
                // No default action
                break;
        }
    }

    // This method demonstrates the use of ExecutorService which is not allowed in J2EE
    public void showBug2() {
        ExecutorService executorService = Executors.newFixedThreadPool(5); // BUG: DoNotUseThreads
        executorService.submit(() -> System.out.println("Running in thread pool.")); // BUG: DoNotUseThreads
        executorService.shutdown(); // BUG: DoNotUseThreads

        // Inserting an unreachable switch statement
        int unreachableSwitchValue = getUnreachableValue();
        switch (unreachableSwitchValue) {
            case 3:
                System.out.println("Unreachable case 3");
                break;
            case 4:
                System.out.println("Unreachable case 4");
                break;
            default:
                // No default action
                break;
        }
    }

    // Method to ensure the switch statement is unreachable
    private int getUnreachableValue() {
        return 0; // Ensures that no case in the switch statement is executed
    }

    public static void main(String[] args) {
        ThreadUsageExample example = new ThreadUsageExample();
        example.showBug1();
        example.showBug2();
    }
}