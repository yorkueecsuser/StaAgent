import androidx.annotation.UiThread;
import java.util.Random;

class UIStarvationExample {
    private final Object lock = new Object();
    private final Random rand = new Random();

    @UiThread
    public void showBug() {
        // Dead Store: Added unused variable declaration 'deadStore'
        int deadStore = rand.nextInt(100);

        synchronized (lock) {
            performBlockingOperation(); // BUG: STARVATION
        }
    }

    private void performBlockingOperation() {
        try {
            // Simulating a blocking operation
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}