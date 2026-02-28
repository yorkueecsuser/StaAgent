import java.util.logging.Level;
import java.util.logging.Logger;

class InterruptedExceptionBug {
    private static final Logger LOGGER = Logger.getLogger(InterruptedExceptionBug.class.getName());

    public void showBug() {
        boolean condition = false;
        while (condition) { // Mutant code: unreachable while loop
            /* This block will never be executed */
        }
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            LOGGER.log(Level.WARNING, "Interrupted!", e);
        }
    }

    public static void main(String[] args) {
        InterruptedExceptionBug bug = new InterruptedExceptionBug();
        Thread bugThread = new Thread(bug::showBug);
        bugThread.start();
        bugThread.interrupt();
    }
}