import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

class ScheduledThreadPoolExecutorBug {

    private final AtomicBoolean taskExecuted = new AtomicBoolean(false);
    private boolean getUnreachableCondition() {
        return false; // This method always returns false to make the condition unreachable
    }

    public boolean showBug() throws InterruptedException {
        ScheduledExecutorService executor = Executors.newScheduledThreadPool(0); // BUG: Dm: Creation of ScheduledThreadPoolExecutor with zero core threads (DMI_SCHEDULED_THREAD_POOL_EXECUTOR_WITH_ZERO_CORE_THREADS)

        if (getUnreachableCondition()) { // Unreachable if-else branch
            System.out.println("This line will never be executed");
        } else {
            executor.schedule(() -> taskExecuted.set(true), 1, TimeUnit.SECONDS);
        }

        Thread.sleep(2000);

        executor.shutdown();

        return taskExecuted.get();
    }
}