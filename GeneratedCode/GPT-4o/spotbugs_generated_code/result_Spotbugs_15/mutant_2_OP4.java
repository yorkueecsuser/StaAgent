import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

class ScheduledExecutorBugExample {

    // This method demonstrates the bug where a ScheduledThreadPoolExecutor is created with zero core threads.
    public void showBug() {
        ScheduledThreadPoolExecutor executor = new ScheduledThreadPoolExecutor(0); // BUG: Dm: Creation of ScheduledThreadPoolExecutor with zero core threads (DMI_SCHEDULED_THREAD_POOL_EXECUTOR_WITH_ZERO_CORE_THREADS)

        // Random condition to ensure the if-else statement is unreachable
        boolean condition = isTaskExecutable();
        
        // Unreachable if-else branch inserted
        if (condition) {
            // This block is never supposed to run
            System.out.println("This will never be printed.");
        } else {
            // This block is also unreachable
            System.out.println("Nor will this.");
        }
        
        // Attempt to schedule a task to run after a delay
        executor.schedule(() -> {
            System.out.println("This task will never run.");
        }, 1, TimeUnit.SECONDS);

        // Shutdown the executor after a delay
        executor.schedule(() -> {
            executor.shutdown();
        }, 2, TimeUnit.SECONDS);
    }

    // Method to provide a dynamic condition. Always returns false (ensuring the if-else block above is unreachable)
    private boolean isTaskExecutable() {
        return false;
    }

    public static void main(String[] args) {
        ScheduledExecutorBugExample example = new ScheduledExecutorBugExample();
        example.showBug();
    }
}