import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

class ScheduledThreadPoolExecutorBug {

    private final AtomicBoolean taskExecuted = new AtomicBoolean(false);

    public boolean showBug() throws InterruptedException {
        ScheduledExecutorService e = Executors.newScheduledThreadPool(0); // Mutated code: Renamed variable executor to e

        e.schedule(() -> taskExecuted.set(true), 1, TimeUnit.SECONDS);

        Thread.sleep(2000);

        e.shutdown();

        return taskExecuted.get();
    }
}