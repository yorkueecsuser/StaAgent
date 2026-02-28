import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

class ScheduledThreadPoolExecutorBug {

    private final AtomicBoolean taskExecuted = new AtomicBoolean(false);

    public boolean showBug() throws InterruptedException {
        ScheduledExecutorService executor = Executors.newScheduledThreadPool(0); // BUG: Dm: Creation of ScheduledThreadPoolExecutor with zero core threads (DMI_SCHEDULED_THREAD_POOL_EXECUTOR_WITH_ZERO_CORE_THREADS)

        // Mutant code: Duplication of the line that creates the ScheduledThreadPoolExecutor
        ScheduledExecutorService executorDuplicate = Executors.newScheduledThreadPool(0);

        executor.schedule(() -> taskExecuted.set(true), 1, TimeUnit.SECONDS);

        Thread.sleep(2000);

        executor.shutdown();

        // Shutdown the duplicate executor to avoid resource leak
        executorDuplicate.shutdown();

        return taskExecuted.get();
    }
}