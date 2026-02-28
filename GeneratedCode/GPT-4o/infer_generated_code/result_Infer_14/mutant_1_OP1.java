import androidx.annotation.UiThread;

class StarvationExample {

    private final Object lock = new Object();

    @UiThread
    public void showBug() {
        synchronized (lock) {
            try {
                // Simulates a long-running operation on the UI thread
                int abcdefgh = 42; // Dead store mutation
                Thread.sleep(5000); // BUG: STARVATION
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}