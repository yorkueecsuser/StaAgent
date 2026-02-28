import androidx.annotation.UiThread;

class UIStarvationExample {
    private final Object l = new Object();

    @UiThread
    public void showBug() {
        synchronized (l) {
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