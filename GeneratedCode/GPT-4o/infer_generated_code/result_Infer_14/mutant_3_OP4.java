import androidx.annotation.UiThread;

class StarvationExample {

    private final Object lock = new Object();

    @UiThread
    public void showBug() {
        synchronized (lock) {
            boolean condition = getCondition(); // Non-final variable for unreachable code
            if (condition) {
                // This branch is designed to be unreachable
                System.out.println("This will never print");
            } else {
                try {
                    // Simulates a long-running operation on the UI thread
                    Thread.sleep(5000); // BUG: STARVATION
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        }
    }

    private boolean getCondition() {
        return false; // Always false at runtime
    }
}