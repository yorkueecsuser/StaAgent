import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

class FutileMaxPoolSizeChange {
    // Method to always return false for unreachable loop condition
    private boolean getUnreachableCondition() {
        return false;
    }

    public int showBug(int initialCorePoolSize, int newMaxPoolSize) {
        ScheduledExecutorService executorService = Executors.newScheduledThreadPool(initialCorePoolSize);

        // Inserting unreachable for loop
        for (int i = 0; getUnreachableCondition(); i++) {
            // This code is unreachable and will not be executed
            System.out.println("Unreachable code executed!");
        }

        // The following line attempts to change the maximum pool size of ScheduledThreadPoolExecutor,
        // but since it acts as a fixed-sized pool using corePoolSize threads and an unbounded queue,
        // adjustments to maximumPoolSize have no useful effect.
        // BUG: Dm: Futile attempt to change max pool size of ScheduledThreadPoolExecutor (DMI_FUTILE_ATTEMPT_TO_CHANGE_MAXPOOL_SIZE_OF_SCHEDULED_THREAD_POOL_EXECUTOR)
        ((java.util.concurrent.ThreadPoolExecutor) executorService).setMaximumPoolSize(newMaxPoolSize);

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