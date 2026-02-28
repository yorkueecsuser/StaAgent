import java.util.logging.Level;
import java.util.logging.Logger;

class InterruptedExceptionBug {
    private static final Logger LOGGER = Logger.getLogger(InterruptedExceptionBug.class.getName());

    public void showBug() {
        int deadStoreVar; // Added dead store variable
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            LOGGER.log(Level.WARNING, "Interrupted!", e);
            deadStoreVar = 1; // Assign a value to the dead store variable to avoid compilation error
        }
    }

    public static void main(String[] args) {
        InterruptedExceptionBug bug = new InterruptedExceptionBug();
        Thread bugThread = new Thread(bug::showBug);
        bugThread.start();
        bugThread.interrupt();
    }
}