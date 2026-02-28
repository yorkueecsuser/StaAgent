import androidx.annotation.UiThread;

class UIStarvationExample {
    private final Object lock = new Object();

    private boolean getFalseCondition() {
        return false;
    }

    @UiThread
    public void showBug() {
        synchronized (lock) {
            // Mutant: Unreachable for loop
            boolean conditionFor = getFalseCondition();
            for (int i = 0; conditionFor; i++) {
                // This loop is unreachable
            }

            performBlockingOperation(); // Original code
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