import androidx.annotation.UiThread;

class UIStarvationExample {
    private final Object lock = new Object();

    @UiThread
    public void showBug() {
        synchronized (lock) {
            int value = getValue();
            switch (value) {
                case 1:
                    // This case is unreachable because getValue() never returns 1
                    performBlockingOperation();
                    break;
                default:
                    break;
            }
            performBlockingOperation(); // BUG: STARVATION
        }
    }

    private int getValue() {
        return 0; // A value that is not equal to 1
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