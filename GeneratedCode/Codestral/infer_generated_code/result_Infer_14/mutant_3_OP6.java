import androidx.annotation.UiThread;

class UIStarvationExample {
    private final Object lock = new Object();
    private boolean getCondition() { return false; }

    @UiThread
    public void showBug() {
        synchronized (lock) {
            for (int i = 0; getCondition(); i++) {  // Unreachable for loop
                System.out.println("Unreachable code");
            }
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