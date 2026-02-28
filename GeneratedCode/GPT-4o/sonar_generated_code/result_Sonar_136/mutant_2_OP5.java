import java.util.logging.Level;
import java.util.logging.Logger;

class ThreadInterruptionExample {
    private static final Logger LOGGER = Logger.getLogger(ThreadInterruptionExample.class.getName());

    public void showBug() {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                // Insert unreachable switch statement
                int unreachableSwitchValue = getUnreachableValue();
                switch (unreachableSwitchValue) {
                    case 1:
                        LOGGER.log(Level.INFO, "This case is unreachable.");
                        break;
                    default:
                        // This block simulates code that will never be executed
                        LOGGER.log(Level.INFO, "Default case of an unreachable switch.");
                }
                
                try {
                    simulateLongRunningTask();
                } catch (InterruptedException e) { // BUG: "InterruptedException" and "ThreadDeath" should not be ignored
                    LOGGER.log(Level.WARNING, "Interrupted!", e); // Logging is not sufficient
                }
            }
        });

        thread.start();
        
        // Interrupt the thread to demonstrate the bug
        thread.interrupt();
    }

    private int getUnreachableValue() {
        // This method always returns a value that does not match any case in the switch
        return 2; // As long as this is not 1, the switch statement remains unreachable
    }

    private void simulateLongRunningTask() throws InterruptedException {
        // Simulating some long running task
        Thread.sleep(5000);
    }
}