import androidx.annotation.UiThread;

class UIStarvationExample {
    private final Object lock = new Object();

    @UiThread
    public void showBug() {
        synchronized (lock) {
            performBlockingOperation(); // BUG: STARVATION
            if (isUnreachableCondition()) {  // Mutant code added here
                // This block will never be executed
            } else {
                // Regular code continues as before
            }
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

    private boolean isUnreachableCondition() {
        // Implement a condition that is always false
        return false;
    }
}