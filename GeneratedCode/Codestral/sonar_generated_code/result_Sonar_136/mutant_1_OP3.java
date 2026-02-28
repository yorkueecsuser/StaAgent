import java.util.logging.Level;
import java.util.logging.Logger;

class InterruptedExceptionBug {
    private static final Logger LOGGER = Logger.getLogger(InterruptedExceptionBug.class.getName());

    private boolean getFalseCondition() {
        return false;
    }

    public void showBug() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            LOGGER.log(Level.WARNING, "Interrupted!", e);
        }

        // Mutant Code: Unreachable if statement
        boolean condition = getFalseCondition();
        if (condition) {
            // This code will never execute because getFalseCondition() always returns false
            LOGGER.log(Level.WARNING, "Unreachable code executed!");
        }
    }

    public static void main(String[] args) {
        InterruptedExceptionBug bug = new InterruptedExceptionBug();
        Thread bugThread = new Thread(bug::showBug);
        bugThread.start();
        bugThread.interrupt();
    }
}