import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

class ScheduledExecutorBugExample {

    // This method demonstrates the bug where a ScheduledThreadPoolExecutor is created with zero core threads.
    public void showBug() {
        ScheduledThreadPoolExecutor executor = new ScheduledThreadPoolExecutor(0); // BUG: Dm: Creation of ScheduledThreadPoolExecutor with zero core threads (DMI_SCHEDULED_THREAD_POOL_EXECUTOR_WITH_ZERO_CORE_THREADS)
        
        // Attempt to schedule a task to run after a delay
        executor.schedule(() -> {
            System.out.println("This task will never run.");
        }, 1, TimeUnit.SECONDS);

        // Shutdown the executor after a delay
        executor.schedule(() -> {
            executor.shutdown();
        }, 2, TimeUnit.SECONDS);

        // Unreachable switch statement mutation added
        int unreachableValue = getUnreachableValue();
        switch (unreachableValue) {
            case 999: 
                System.out.println("This switch case will never be reached.");
                break;
            default:
                // No operation, ensuring the switch is unreachable
                break;
        }
    }
    
    // Helper method to return a value that makes the switch statement unreachable
    private int getUnreachableValue() {
        return -1; // Ensures it doesn't match any case
    }

    public static void main(String[] args) {
        ScheduledExecutorBugExample example = new ScheduledExecutorBugExample();
        example.showBug();
    }
}