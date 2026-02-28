import androidx.annotation.UiThread;

class StarvationExample {

    private final Object lock = new Object();

    @UiThread
    public void showBug() {
        synchronized (lock) {
            try {
                // Simulates a long-running operation on the UI thread
                Thread.sleep(5000); // BUG: STARVATION

                // Unreachable if statement
                boolean condition = getCondition();
                if (condition) {
                    System.out.println("This will never be printed.");
                }
                
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }

    // Method to always return false
    private boolean getCondition() {
        return false;
    }
}