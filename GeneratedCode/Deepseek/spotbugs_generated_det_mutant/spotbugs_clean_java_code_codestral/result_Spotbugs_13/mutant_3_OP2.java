import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

class FutileMaxPoolSizeChange {
    public int showBug(int initialCorePoolSize, int newMaxPoolSize) {
        ScheduledExecutorService executorService = Executors.newScheduledThreadPool(initialCorePoolSize);

        // The following line attempts to change the maximum pool size of ScheduledThreadPoolExecutor
        ((java.util.concurrent.ThreadPoolExecutor) executorService).setMaximumPoolSize(newMaxPoolSize);

        // Duplicate mutation: Attempt to change the maximum pool size again
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