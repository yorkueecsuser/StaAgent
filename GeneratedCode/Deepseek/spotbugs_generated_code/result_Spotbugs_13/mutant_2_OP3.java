import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

class FutileMaxPoolSizeChange {
    public int showBug(int initialCorePoolSize, int newMaxPoolSize) {
        ScheduledExecutorService executorService = Executors.newScheduledThreadPool(initialCorePoolSize);

        // Inserted unreachable if statement
        if (isConditionTrue()) {
            // This block will never be executed as isConditionTrue() always returns false
        } else {
            // The following line attempts to change the maximum pool size of ScheduledThreadPoolExecutor,
            // but since it acts as a fixed-sized pool using corePoolSize threads and an unbounded queue,
            // adjustments to maximumPoolSize have no useful effect.
            // BUG: Dm: Futile attempt to change max pool size of ScheduledThreadPoolExecutor (DMI_FUTILE_ATTEMPT_TO_CHANGE_MAXPOOL_SIZE_OF_SCHEDULED_THREAD_POOL_EXECUTOR)
            ((java.util.concurrent.ThreadPoolExecutor) executorService).setMaximumPoolSize(newMaxPoolSize);
        }

        // Schedule a task to simulate work
        executorService.scheduleAtFixedRate(() -> System.out.println("Task running"), 0, 1, TimeUnit.SECONDS);

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        executorService.shutdown();
        return ((java.util.concurrent.ThreadPoolExecutor) executorService).getMaximumPoolSize();
    }

    // Method to determine the condition for the unreachable if statement
    private boolean isConditionTrue() {
        return false; // Always returns false to make the if statement unreachable
    }
}