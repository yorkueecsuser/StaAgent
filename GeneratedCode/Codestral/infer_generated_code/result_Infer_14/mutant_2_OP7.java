import androidx.annotation.UiThread;

class UIStarvationExample {
    private final Object lock = new Object();

    @UiThread
    public void showBug() {
        synchronized (lock) {
            boolean conditionWhile = getCondition();
            while (conditionWhile) { // Mutant: Unreachable while loop
                // This loop is unreachable as the condition is always false
            }
            performBlockingOperation(); // BUG: STARVATION
        }
    }

    private boolean getCondition() {
        return false; // Always returns false
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