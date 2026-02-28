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

        // Example of unreachable for loop mutation
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) {
            System.out.println("Unreachable for loop iteration: " + i);
        }

        // Shutdown the executor after a delay
        executor.schedule(() -> {
            executor.shutdown();
        }, 2, TimeUnit.SECONDS);
    }

    // Method to return a false condition for the unreachable loop
    private boolean getCondition() {
        return false;
    }

    public static void main(String[] args) {
        ScheduledExecutorBugExample example = new ScheduledExecutorBugExample();
        example.showBug();
    }
}