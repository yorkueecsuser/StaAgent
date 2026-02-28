import java.util.concurrent.ExecutorService; // Standard Java import
import java.util.concurrent.Executors;       // Standard Java import

class ThreadUsageExample {

    // This method demonstrates the use of a custom thread which is not allowed in J2EE
    public void showBug1() {
        Thread customThread = new Thread(() -> {
            System.out.println("This is a custom thread."); // BUG: DoNotUseThreads
        });
        customThread.start(); // BUG: DoNotUseThreads

        // Inserting unreachable switch statement
        int unreachableValue = getUnreachableValue();
        switch (unreachableValue) {
            case 1:
                System.out.println("This is unreachable case 1.");
                break;
            case 2:
                System.out.println("This is unreachable case 2.");
                break;
            default:
                // Default case which is also unreachable
                System.out.println("This is unreachable default case.");
                break;
        }
    }

    // This method demonstrates the use of ExecutorService which is not allowed in J2EE
    public void showBug2() {
        ExecutorService executorService = Executors.newFixedThreadPool(5); // BUG: DoNotUseThreads
        executorService.submit(() -> System.out.println("Running in thread pool.")); // BUG: DoNotUseThreads
        executorService.shutdown(); // BUG: DoNotUseThreads

        // Inserting another unreachable switch statement in a different method
        int anotherUnreachableValue = getAnotherUnreachableValue();
        switch (anotherUnreachableValue) {
            case 3:
                System.out.println("This is another unreachable case 3.");
                break;
            case 4:
                System.out.println("This is another unreachable case 4.");
                break;
            default:
                // Default case which is also unreachable
                System.out.println("This is another unreachable default case.");
                break;
        }
    }

    private int getUnreachableValue() {
        return -1; // Ensures the switch-case is unreachable
    }

    private int getAnotherUnreachableValue() {
        return -1; // Ensures the switch-case is unreachable
    }

    public static void main(String[] args) {
        ThreadUsageExample example = new ThreadUsageExample();
        example.showBug1();
        example.showBug2();
    }
}