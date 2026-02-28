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
    }

    private void simulateLongRunningTask() throws InterruptedException {
        // Simulating some long running task
        Thread.sleep(5000);
    }
}

// Mutant Code
class ThreadInterruptionExample3 {
    private static final Logger LOGGER = Logger.getLogger(ThreadInterruptionExample3.class.getName());

    public void showBug() {
        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    simulateLongRunningTask();
                } catch (InterruptedException x) { // BUG: "InterruptedException" and "ThreadDeath" should not be ignored
                    LOGGER.log(Level.WARNING, "Interrupted!", x); // Logging is not sufficient
                }
            }
        });

        t.start();
        
        // Interrupt the thread to demonstrate the bug
        t.interrupt();
    }

    private void simulateLongRunningTask() throws InterruptedException {
        // Simulating some long running task
        Thread.sleep(5000);
    }
}