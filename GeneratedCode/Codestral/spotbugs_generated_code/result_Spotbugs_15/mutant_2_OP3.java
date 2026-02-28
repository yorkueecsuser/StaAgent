import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

class ScheduledThreadPoolExecutorBug {

    private final AtomicBoolean taskExecuted = new AtomicBoolean(false);

    public boolean showBug() throws InterruptedException {
        ScheduledExecutorService executor = Executors.newScheduledThreadPool(0); // BUG: Dm: Creation of ScheduledThreadPoolExecutor with zero core threads (DMI_SCHEDULED_THREAD_POOL_EXECUTOR_WITH_ZERO_CORE_THREADS)

        // Added unreachable if statement
        if (isFalseCondition()) {
            // This code is unreachable
            System.out.println("This line should never be executed");
        }

        executor.schedule(() -> taskExecuted.set(true), 1, TimeUnit.SECONDS);

        Thread.sleep(2000);

        executor.shutdown();

        return taskExecuted.get();
    }

    private boolean isFalseCondition() {
        // This method always returns false
        return false;
    }
}