import androidx.annotation.UiThread;

class UIStarvationExample {
    private final Object lock = new Object();
    private final Object duplicateLock = new Object();

    @UiThread
    public void showBug() {
        synchronized (lock) {
            performBlockingOperation(); // BUG: STARVATION
        }
        synchronized (duplicateLock) {
            duplicateLock = duplicateLock; // Mutant: Duplicate the assignment statement
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