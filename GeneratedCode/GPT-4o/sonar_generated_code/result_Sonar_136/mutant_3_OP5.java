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

                // Inserted unreachable switch statement
                int unreachableValue = getUnreachableValue();
                switch (unreachableValue) {
                    case 1:
                        LOGGER.log(Level.INFO, "This will never be executed.");
                        break;
                    default:
                        LOGGER.log(Level.INFO, "Default case, also never executed.");
                        break;
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

    // Method to provide a value that makes the switch statement unreachable
    private int getUnreachableValue() {
        return 0; // This value ensures the switch cases are not executed
    }
}