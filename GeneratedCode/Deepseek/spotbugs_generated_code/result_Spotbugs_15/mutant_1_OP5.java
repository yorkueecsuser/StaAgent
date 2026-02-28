import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

class ScheduledThreadPoolExecutorBug {

    private final AtomicBoolean taskExecuted = new AtomicBoolean(false);

    private int getUnreachableValue() {
        return -1;
    }

    public boolean showBug() throws InterruptedException {
        ScheduledExecutorService executor = Executors.newScheduledThreadPool(0);

        executor.schedule(() -> taskExecuted.set(true), 1, TimeUnit.SECONDS);

        int unreachableValue = getUnreachableValue();
        switch (unreachableValue) {
            case 1:
                System.out.println("This case is unreachable.");
                break;
        }

        Thread.sleep(2000);

        executor.shutdown();

        return taskExecuted.get();
    }
}