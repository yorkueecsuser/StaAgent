import androidx.annotation.UiThread;

class StarvationExample {

    private final Object lock = new Object();

    @UiThread
    public void showBug() {
        synchronized (lock) {
            try {
                // Simulates a long-running operation on the UI thread
                Thread.sleep(5000); // BUG: STARVATION
                Thread.sleep(5000); // Duplicate of the above sleep statement for mutation
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}