import java.util.logging.Level;
import java.util.logging.Logger;

class InterruptedThreadExample {

    private static final Logger LOGGER = Logger.getLogger(InterruptedThreadExample.class.getName());

    public void showBug() {
        try {
            // Simulate some long-running task
            Thread.sleep(1000);
        } catch (InterruptedException e) { // BUG: "InterruptedException" and "ThreadDeath" should not be ignored
            LOGGER.log(Level.WARNING, "Interrupted!", e);
        }

        try {
            // Simulate some critical operation
            while (!Thread.currentThread().isInterrupted()) {
                // Some operation
            }
        } catch (ThreadDeath e) { // BUG: "InterruptedException" and "ThreadDeath" should not be ignored
            LOGGER.log(Level.WARNING, "ThreadDeath encountered!", e);
        }
    }

    public static void main(String[] args) {
        InterruptedThreadExample example = new InterruptedThreadExample();
        Thread thread = new Thread(example::showBug);
        thread.start();

        // Interrupt the thread after some delay
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        thread.interrupt();
    }
}