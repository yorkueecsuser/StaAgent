import java.util.logging.Level;
import java.util.logging.Logger;

class Main {
    private static final Logger LOGGER = Logger.getLogger(Main.class.getName());

    // BUG: "InterruptedException" and "ThreadDeath" should not be ignored
    public void run() {
        try {
            // Simulate a long running operation
            Thread.sleep(10000);
        } catch (InterruptedException e) { // Noncompliant; logging is not enough
            LOGGER.log(Level.WARNING, "Interrupted!", e);
        }
    }

    public void showBug() {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                run();
            }
        });
        thread.start();
        thread.interrupt();
    }

    public static void main(String[] args) {
        Main main = new Main();
        main.showBug();
    }
}