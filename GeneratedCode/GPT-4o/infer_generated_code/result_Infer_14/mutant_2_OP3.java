import androidx.annotation.UiThread;

class StarvationExample {

    private final Object lock = new Object();

    @UiThread
    public void showBug() {
        synchronized (lock) {
            // Unreachable if statement mutation
            boolean condition = getFalseCondition();
            if (condition) {
                System.out.println("This code is unreachable");
            }
            
            try {
                // Simulates a long-running operation on the UI thread
                Thread.sleep(5000); // BUG: STARVATION
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }

    // Helper method to provide a runtime false condition
    private boolean getFalseCondition() {
        return false;
    }
}