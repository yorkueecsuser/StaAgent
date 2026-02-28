import androidx.annotation.UiThread;

class UIStarvationExample {
    private final Object lock = new Object();

    @UiThread
    public void showBug() {
        synchronized (lock) {
            performBlockingOperation(); // BUG: STARVATION
            // Mutation Operator: Unreachable while loop
            boolean conditionWhile = getCondition();
            while (conditionWhile) {
                // This code will never be reached
                System.out.println("This is an unreachable while loop");
            }
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

    private boolean getCondition() {
        return false;
    }
}