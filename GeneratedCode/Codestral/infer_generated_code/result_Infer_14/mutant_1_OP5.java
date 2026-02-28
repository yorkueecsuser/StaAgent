import androidx.annotation.UiThread;

class UIStarvationExample {
    private final Object lock = new Object();

    @UiThread
    public void showBug() {
        synchronized (lock) {
            // Mutant: Unreachable switch statement
            int value = getValue();
            switch(value) {
                case 1:
                    break;
            }

            performBlockingOperation(); // BUG: STARVATION
        }
    }

    private int getValue() {
        return 0; // Always returns 0, ensuring the switch statement is unreachable
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