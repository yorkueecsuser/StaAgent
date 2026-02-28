import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

class VirtualThreadBugExample {
    public void showBug() {
        ScheduledExecutorService executor = Executors.newScheduledThreadPool(1);
        executor.schedule(() -> {
            try {
                Thread.sleep(10000); // Blocking operation
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }, 0, TimeUnit.MILLISECONDS);
    }
}