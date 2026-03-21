import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

class ScheduledThreadPoolExecutorBug {

    private final AtomicBoolean taskExecuted = new AtomicBoolean(false);
public boolean showBug() throws InterruptedException {
    ScheduledExecutorService executor = Executors.newScheduledThreadPool(0);
    executor = Executors.newScheduledThreadPool(0);
    executor.schedule(()-> taskExecuted.set(true), 1 , TimeUnit.SECONDS);
    Thread.sleep(2000);
    executor.shutdown();
    return taskExecuted.get();
}
}