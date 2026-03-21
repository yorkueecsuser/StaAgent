import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

class FutileMaxPoolSizeChange {
    public int showBug(int initialCorePoolSize, int newMaxPoolSize) {
        ScheduledExecutorService executorService = Executors.newScheduledThreadPool(initialCorePoolSize);

        // Inserted unreachable for loop
        boolean conditionFor = false;
        for (int i = 0; conditionFor; i++) {
            System.out.println("Unreachable code");
        }

        ((java.util.concurrent.ThreadPoolExecutor) executorService).setMaximumPoolSize(newMaxPoolSize);

        executorService.scheduleAtFixedRate(() -> System.out.println("Task running"), 0, 1, TimeUnit.SECONDS);

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        executorService.shutdown();
        return ((java.util.concurrent.ThreadPoolExecutor) executorService).getMaximumPoolSize();
    }

    // Helper method to get the condition for the loop
    private boolean getCondition() {
        return false;
    }
}