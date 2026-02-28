import androidx.annotation.UiThread;

class StarvationExample {

    private final Object lock = new Object();

    @UiThread
    public void showBug() {
        synchronized (lock) {
            try {
                // Simulates a long-running operation on the UI thread
                Thread.sleep(5000); // BUG: STARVATION
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
            
            // Insert unreachable for loop
            boolean conditionFor = getCondition();
            for (int i = 0; conditionFor; i++) {
                // This code is unreachable due to the conditionFor always being false
                System.out.println("This line is unreachable.");
            }
        }
    }
    
    // Method to get the condition for the loop
    private boolean getCondition() {
        // This method always returns false, making the for loop unreachable
        return false;
    }
}