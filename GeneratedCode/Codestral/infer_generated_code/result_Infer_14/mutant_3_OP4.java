import androidx.annotation.UiThread;

class UIStarvationExample {
    private final Object lock = new Object();

    @UiThread
    public void showBug() {
        synchronized (lock) {
            boolean unreachableCondition = getUnreachableCondition();
            if (unreachableCondition) {
                // Unreachable code
                performUnreachableOperation();
            } else {
                performBlockingOperation(); // BUG: STARVATION
            }
        }
    }

    private boolean getUnreachableCondition() {
        return false;
    }

    private void performBlockingOperation() {
        try {
            // Simulating a blocking operation
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

    private void performUnreachableOperation() {
        // This method will never be executed
        System.out.println("This is an unreachable operation.");
    }
}