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

                    // Mutant: Inserting an unreachable if statement
                    boolean isUnreachable = getFalseCondition();
                    if (isUnreachable) {
                        LOGGER.log(Level.SEVERE, "This branch is unreachable.");
                    }
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

    // Helper method to ensure the condition is not a compile-time constant
    private boolean getFalseCondition() {
        return false;
    }
}