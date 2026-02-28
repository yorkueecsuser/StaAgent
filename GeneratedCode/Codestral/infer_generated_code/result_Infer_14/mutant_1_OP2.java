import androidx.annotation.UiThread;

class UIStarvationExample {
    private final Object lock = new Object();
    private final Object lockDuplicate = new Object();

    @UiThread
    public void showBug() {
        synchronized (lock) {
            performBlockingOperation(); // Original assignment statement
            lockDuplicate = lock; // Mutated: Duplicated assignment statement
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