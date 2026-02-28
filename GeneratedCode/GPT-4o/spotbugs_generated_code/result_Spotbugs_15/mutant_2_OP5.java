import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

class ScheduledExecutorBugExample {

    // This method demonstrates the bug where a ScheduledThreadPoolExecutor is created with zero core threads.
    public void showBug() {
        ScheduledThreadPoolExecutor executor = new ScheduledThreadPoolExecutor(0); // BUG: Dm: Creation of ScheduledThreadPoolExecutor with zero core threads (DMI_SCHEDULED_THREAD_POOL_EXECUTOR_WITH_ZERO_CORE_THREADS)

        // Inserted unreachable switch statement
        int unreachableCondition = getUnreachableCondition();
        switch (unreachableCondition) {
            case 1:
                System.out.println("This code is unreachable.");
                break;
            default:
                break;
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
    
    private int getUnreachableCondition() {
        return 0; // Value chosen such that the switch case is unreachable
    }

    public static void main(String[] args) {
        ScheduledExecutorBugExample example = new ScheduledExecutorBugExample();
        example.showBug();
    }
}