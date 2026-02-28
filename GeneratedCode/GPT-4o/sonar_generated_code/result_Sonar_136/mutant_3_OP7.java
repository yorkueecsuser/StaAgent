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

                // Inserting an unreachable while loop with a condition that is always false based on a method call
                boolean conditionWhile = getUnreachableCondition();
                while (conditionWhile) {
                    // This block is unreachable
                    LOGGER.log(Level.INFO, "This is unreachable code.");
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
    
    private boolean getUnreachableCondition() {
        // Method that returns false, making the condition of the while loop false
        return false;
    }
}