import androidx.annotation.UiThread;

class UIStarvationExample {
    private final Object l = new Object(); // Mutant: Renamed 'lock' to 'l'

    @UiThread
    public void showBug() {
        synchronized (l) { // Updated the reference to the new variable name
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