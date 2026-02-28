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
                
                // Unreachable for loop mutation starts here
                boolean conditionFor = getFalseCondition();
                for (int i = 0; conditionFor; i++) {
                    System.out.println("This is an unreachable loop iteration: " + i);
                }
                // Unreachable for loop mutation ends here
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

    // Helper method to dynamically determine a condition at runtime
    private boolean getFalseCondition() {
        return false;
    }
}