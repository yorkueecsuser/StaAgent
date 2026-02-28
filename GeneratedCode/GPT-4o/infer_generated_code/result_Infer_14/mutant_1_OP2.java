import androidx.annotation.UiThread;

class StarvationExample {

    private final Object lock = new Object();

    @UiThread
    public void showBug() {
        synchronized (lock) {
            try {
                // Simulates a long-running operation on the UI thread
                Thread.sleep(5000); // BUG: STARVATION
                // Duplication of the assignment statement to simulate mutation
                Thread.sleep(5000); // Duplicated assignment for mutation testing
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}