import androidx.annotation.UiThread;

class StarvationExample {

    private final Object lock = new Object();

    @UiThread
    public void showBug() {
        synchronized (lock) {
            try {
                // Simulates a long-running operation on the UI thread
                Thread.sleep(5000); // BUG: STARVATION
                int abcxdefg = 42; // Dead Store - the variable is declared but never used
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}