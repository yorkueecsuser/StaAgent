import androidx.annotation.UiThread;

class StarvationExample {

    private final Object lock = new Object();

    @UiThread
    public void showBug() {
        synchronized (lock) {
            try {
                // Simulates a long-running operation on the UI thread
                Thread.sleep(5000); // BUG: STARVATION
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }

            // Inserting an unreachable for loop with a dynamically determined condition
            boolean conditionFor = getCondition();
            for (int i = 0; conditionFor; i++) {
                // This block will never execute because 'conditionFor' will always be false
            }
        }
    }

    // Method to simulate a dynamically determined false condition
    private boolean getCondition() {
        return false;
    }
}