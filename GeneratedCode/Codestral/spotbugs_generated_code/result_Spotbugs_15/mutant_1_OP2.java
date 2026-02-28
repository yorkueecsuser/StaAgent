import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

class ScheduledThreadPoolExecutorBug {

    private final AtomicBoolean taskExecuted = new AtomicBoolean(false);

    public boolean showBug() throws InterruptedException {
        ScheduledExecutorService executor = Executors.newScheduledThreadPool(0);
        // Added mutation: duplicate the assignment statement that sets the number of core threads to zero
        int coreThreads = 0;
        ScheduledExecutorService executorDuplicate = Executors.newScheduledThreadPool(coreThreads);

        executor.schedule(() -> taskExecuted.set(true), 1, TimeUnit.SECONDS);

        Thread.sleep(2000);

        executor.shutdown();
        // Added mutation: duplicate the shutdown() call
        executorDuplicate.shutdown();

        return taskExecuted.get();
    }
}