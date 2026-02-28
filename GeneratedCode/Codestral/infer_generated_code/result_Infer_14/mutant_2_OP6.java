import androidx.annotation.UiThread;

class UIStarvationExample {
    private final Object lock = new Object();

    @UiThread
    public void showBug() {
        synchronized (lock) {
            boolean condition = getCondition();
            for (int i = 0; condition; i++) { // Unreachable for loop mutation operator
                /* This loop is unreachable as the condition is always false */
            }
            performBlockingOperation(); // BUG: STARVATION
        }
    }

    private boolean getCondition() {
        return false; // Always returns false to ensure the loop is unreachable
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