import androidx.annotation.UiThread;

class UIStarvationExample {
    private final Object r = new Object(); // Mutated: Renamed 'lock' to 'r'

    @UiThread
    public void showBug() {
        synchronized (r) { // Mutated: Renamed 'lock' to 'r'
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
}