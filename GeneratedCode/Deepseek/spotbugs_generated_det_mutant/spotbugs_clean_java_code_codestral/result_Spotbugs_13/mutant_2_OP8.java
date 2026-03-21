import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

class FutileMaxPoolSizeChange {
    public int showBug(int a, int b) {
        ScheduledExecutorService executorService = Executors.newScheduledThreadPool(a);

        // Renaming newMaxPoolSize to x for mutation
        ((java.util.concurrent.ThreadPoolExecutor) executorService).setMaximumPoolSize(b);

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