import androidx.annotation.UiThread;

class UIStarvationExample {
    private final Object lock = new Object();

    @UiThread
    public void showBug() {
        synchronized (lock) {
            performBlockingOperation(); // BUG: STARVATION
        }
    }

    private void performBlockingOperation() {
        boolean unreachableCondition = getCondition();
        if (unreachableCondition) {
            // Unreachable code
            System.out.println("This code will never be executed.");
        } else {
            try {
                // Simulating a blocking operation
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }

    private boolean getCondition() {
        return false; // This method will always return false, making the if branch unreachable
    }
}