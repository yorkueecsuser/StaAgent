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

                // Mutant: Adding an unreachable if-else branch
                boolean unreachableCondition = getUnreachableCondition();
                if (unreachableCondition) {
                    LOGGER.log(Level.INFO, "This branch is unreachable."); // This block is unreachable
                } else {
                    LOGGER.log(Level.INFO, "This else block is also unreachable.");
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
    
    // This method ensures the condition is dynamic
    private boolean getUnreachableCondition() {
        return false;
    }
}