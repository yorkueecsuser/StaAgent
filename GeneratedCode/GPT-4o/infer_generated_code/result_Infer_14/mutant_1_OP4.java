import androidx.annotation.UiThread;

class StarvationExample {

    private final Object lock = new Object();

    @UiThread
    public void showBug() {
        synchronized (lock) {
            try {
                // Simulates a long-running operation on the UI thread
                Thread.sleep(5000); // BUG: STARVATION

                // Added unreachable if-else statement as a mutant
                boolean condition = getCondition(); // This method always returns false
                if (condition) {
                    System.out.println("This block is unreachable.");
                } else {
                    System.out.println("Executing else block.");
                }
                
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }

    // Method that always returns false to make the if condition unreachable
    private boolean getCondition() {
        return false;
    }
}