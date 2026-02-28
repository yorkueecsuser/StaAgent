import androidx.annotation.UiThread;

class StarvationExample {

    private final Object lock = new Object();

    @UiThread
    public void showBug() {
        synchronized (lock) {
            boolean conditionWhile = getCondition(); // Introduce a variable to control the loop
            while (conditionWhile) {
                // This block is unreachable because conditionWhile is initialized to false,
                // but the variable is not final and can be changed at runtime.
                System.out.println("This is an unreachable while loop.");
            }
            try {
                // Simulates a long-running operation on the UI thread
                Thread.sleep(5000); // BUG: STARVATION
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }

    private boolean getCondition() {
        return false; // The loop is unreachable because this method always returns false.
    }
}