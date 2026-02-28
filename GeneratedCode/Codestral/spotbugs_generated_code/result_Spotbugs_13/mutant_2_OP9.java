import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

class FutileMaxPoolSizeChange {
    public int showBug(int initialCorePoolSize, int newMaxPoolSize) {
        ScheduledExecutorService executorService = Executors.newScheduledThreadPool(initialCorePoolSize);

        // BUG: Dm: Futile attempt to change max pool size of ScheduledThreadPoolExecutor (DMI_FUTILE_ATTEMPT_TO_CHANGE_MAXPOOL_SIZE_OF_SCHEDULED_THREAD_POOL_EXECUTOR)
        // Mutation Operator: Equivalent Loop Replacement
        // Replacing the single line with a do-while loop that has the same functionality
        do {
            ((java.util.concurrent.ThreadPoolExecutor) executorService).setMaximumPoolSize(newMaxPoolSize);
        } while (false); // This condition will always be false, acting as a single iteration loop

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
}