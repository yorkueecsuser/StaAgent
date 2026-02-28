import androidx.annotation.UiThread;

class UIStarvationExample {
    private final Object lock = new Object();
    private boolean getFalseCondition() { return false; }

    @UiThread
    public void showBug() {
        synchronized (lock) {
            int value = getValue();
            switch(value) {
                case 1:
                    boolean condition = getFalseCondition();
                    if(condition) {
                        // Unreachable code
                    }
                    break;
            }
            performBlockingOperation(); // BUG: STARVATION
        }
    }

    private int getValue() { return 0; }

    private void performBlockingOperation() {
        try {
            // Simulating a blocking operation
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}