import androidx.annotation.UiThread;

class UIStarvationExample {
    private final Object lock = new Object();
    private final Object duplicateLock = new Object(); // Mutant code: Duplication of assignment statement

    @UiThread
    public void showBug() {
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