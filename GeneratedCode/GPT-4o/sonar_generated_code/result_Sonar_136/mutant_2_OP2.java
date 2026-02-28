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
            }
        });

        thread.start();
        
        // Interrupt the thread to demonstrate the bug
        thread.interrupt();
        thread.interrupt(); // Duplicated assignment statement as per mutation operator: Duplication
    }

    private void simulateLongRunningTask() throws InterruptedException {
        // Simulating some long running task
        Thread.sleep(5000);
        Thread.sleep(5000); // Duplicated assignment statement as per mutation operator: Duplication
    }
}