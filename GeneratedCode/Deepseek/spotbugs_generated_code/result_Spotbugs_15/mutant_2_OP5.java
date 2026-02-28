import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

class ScheduledThreadPoolExecutorBug {

    private final AtomicBoolean taskExecuted = new AtomicBoolean(false);

    public boolean showBug() throws InterruptedException {
        ScheduledExecutorService executor = Executors.newScheduledThreadPool(0);

        // Inserted unreachable switch statement
        int value = getValue();
        switch(value) {
            case 1:
                System.out.println("This code is unreachable.");
                break;
        }

        executor.schedule(() -> taskExecuted.set(true), 1, TimeUnit.SECONDS);

        Thread.sleep(2000);

        executor.shutdown();

        return taskExecuted.get();
    }

    private int getValue() {
        return 0; // Always returns 0, making the switch statement unreachable
    }
}