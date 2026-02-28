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

                    // Mutation: Adding an unreachable switch statement
                    int unreachableSwitch = generateUnreachableValue();
                    switch (unreachableSwitch) {
                        case 0:
                            // This case is unreachable
                            LOGGER.log(Level.INFO, "Unreachable switch case executed!");
                            break;
                        default:
                            // Default case is also unreachable
                            LOGGER.log(Level.INFO, "Unreachable switch default executed!");
                            break;
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
    
    // Method to ensure a runtime non-zero value
    private int generateUnreachableValue() {
        return 2; // Not 0 or 1, making the switch cases effectively unreachable
    }
}