import androidx.annotation.UiThread;

class UIStarvationExample {
    private final Object lock = new Object();

    @UiThread
    public void showBug() {
        synchronized (lock) {
            // Mutant code added to demonstrate the unreachable if statement
            boolean unreachableCondition = isUnreachableCondition();
            if (unreachableCondition) {
                performUnreachableOperation();
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

    private boolean isUnreachableCondition() {
        return false; // This condition is always false, making the if statement unreachable
    }

    private void performUnreachableOperation() {
        // This method will never be executed due to the unreachable if statement
        System.out.println("This operation is unreachable.");
    }
}