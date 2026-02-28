import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

class FutileMaxPoolSizeChange {
    public int showBug(int initialCorePoolSize, int newMaxPoolSize) {
        ScheduledExecutorService executorService = Executors.newScheduledThreadPool(initialCorePoolSize);

        boolean shouldChangeMaxPoolSize = getCondition();

        if (shouldChangeMaxPoolSize) {
            // This block will never be executed because getCondition() always returns false
            ((java.util.concurrent.ThreadPoolExecutor) executorService).setMaximumPoolSize(newMaxPoolSize);
        } else {
            // This is the else block for the unreachable if-else statement
            System.out.println("This block is unreachable");
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

    private boolean getCondition() {
        return false;
    }
}