import androidx.annotation.UiThread;

class UIStarvationExample {
    private final Object lock = new Object();
    private int deadStoreVariable; // Mutant: Dead Store

    @UiThread
    public void showBug() {
        synchronized (lock) {
            performBlockingOperation(); // BUG: STARVATION
        }
        deadStoreVariable = 42; // Mutant: Dead Store
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