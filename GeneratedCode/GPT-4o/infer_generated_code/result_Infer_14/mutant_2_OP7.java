import androidx.annotation.UiThread;

class StarvationExample {

    private final Object lock = new Object();

    @UiThread
    public void showBug() {
        synchronized (lock) {
            boolean conditionWhile = getCondition();
            while (conditionWhile) {
                // Unreachable code block
                System.out.println("This is unreachable");
            }
            try {
                // Simulates a long-running operation on the UI thread
                Thread.sleep(5000); // BUG: STARVATION
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }

    // Method to ensure condition is dynamically determined at runtime
    private boolean getCondition() {
        return false;
    }
}