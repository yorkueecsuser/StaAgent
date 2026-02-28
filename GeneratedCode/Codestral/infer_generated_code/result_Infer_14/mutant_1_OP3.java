import androidx.annotation.UiThread;

class UIStarvationExample {
    private final Object lock = new Object();
    private boolean unreachableCondition = false;

    @UiThread
    public void showBug() {
        synchronized (lock) {
            if (unreachableCondition) {
                // Unreachable code
                performAdditionalOperation();
            }
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

    private void performAdditionalOperation() {
        // This method will never be executed due to the unreachable condition
        // Implementation is not necessary for the mutation
    }
}