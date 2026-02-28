import java.util.logging.Level;
import java.util.logging.Logger;

class ThreadInterruptionExample {
    private static final Logger LOGGER = Logger.getLogger(ThreadInterruptionExample.class.getName());

    public void showBug() {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    simulateLongRunningTask();
                } catch (InterruptedException e) { // BUG: "InterruptedException" and "ThreadDeath" should not be ignored
                    LOGGER.log(Level.WARNING, "Interrupted!", e); // Logging is not sufficient
                }
                
                // Unreachable if-else statement added here
                boolean condition = getDynamicCondition();
                if (condition) {
                    LOGGER.log(Level.INFO, "This block is unreachable at runtime.");
                } else {
                    LOGGER.log(Level.INFO, "This block is also unreachable at runtime.");
                }
            }
        });

        thread.start();
        
        // Interrupt the thread to demonstrate the bug
        thread.interrupt();
    }

    private void simulateLongRunningTask() throws InterruptedException {
        // Simulating some long running task
        Thread.sleep(5000);
    }
    
    // Method to provide a dynamic condition
    private boolean getDynamicCondition() {
        return false; // Always returns false at runtime
    }
}