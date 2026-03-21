import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

class ScheduledThreadPoolExecutorBug {

    private final AtomicBoolean taskExecuted = new AtomicBoolean(false);

    public boolean showBug() throws InterruptedException {
        ScheduledExecutorService executor = Executors.newScheduledThreadPool(0); // BUG: Dm: Creation of ScheduledThreadPoolExecutor with zero core threads (DMI_SCHEDULED_THREAD_POOL_EXECUTOR_WITH_ZERO_CORE_THREADS)

        boolean flag = false;
        do {
            executor.schedule(() -> taskExecuted.set(true), 1, TimeUnit.SECONDS);
            flag = true; // This line ensures that the do-while loop executes at least once
        } while (!flag); // This condition will never be false, but it doesn't affect the original functionality

        Thread.sleep(2000);

        executor.shutdown();

        return taskExecuted.get();
    }
}