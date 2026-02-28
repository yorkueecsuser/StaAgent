import androidx.annotation.UiThread;

class UIStarvationExampleMutant {
    private final Object lock = new Object();
    private boolean getUnreachableCondition() {
        return false;
    }

    @UiThread
    public void showBug() {
        synchronized (lock) {
            if (getUnreachableCondition()) {
                // Unreachable Mutant Code
                performUnreachableOperation();
            }
            performBlockingOperation();
        }
    }

    private void performUnreachableOperation() {
        // This method is unreachable as per the condition
        System.out.println("This should never be executed!");
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