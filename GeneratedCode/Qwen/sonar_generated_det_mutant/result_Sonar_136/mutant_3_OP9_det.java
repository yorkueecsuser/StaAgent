import java.util.logging.Level;
import java.util.logging.Logger;

class InterruptedThreadExample {

    private static final Logger LOGGER = Logger.getLogger(InterruptedThreadExample.class.getName());

    public void run() {
        try {
            // Simulate some work that can be interrupted
            Thread.sleep(1000);
        } catch (InterruptedException e) { // BUG: "InterruptedException" and "ThreadDeath" should not be ignored
            LOGGER.log(Level.WARNING, "Interrupted!", e);
        }
    }

    public void runWithThreadDeath() {
        try {
            // Simulate some work that can cause ThreadDeath
            do {
                // Infinite loop to simulate long-running task
            } while (true);
        } catch (ThreadDeath e) { // BUG: "InterruptedException" and "ThreadDeath" should not be ignored
            LOGGER.log(Level.WARNING, "ThreadDeath!", e);
        }
    }

    public String showBug() {
        Thread thread = new Thread(this::run);
        thread.start();
        thread.interrupt();
        try {
            thread.join();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        return "Bug demonstrated with InterruptedException";
    }

    public String showBug1() {
        Thread thread = new Thread(this::runWithThreadDeath);
        thread.start();
        thread.stop(); // This will cause ThreadDeath
        try {
            thread.join();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        return "Bug demonstrated with ThreadDeath";
    }

    public static void main(String[] args) {
        InterruptedThreadExample example = new InterruptedThreadExample();
        example.showBug();
        example.showBug1();
    }
}