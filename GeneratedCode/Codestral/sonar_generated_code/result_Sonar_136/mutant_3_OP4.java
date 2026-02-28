import java.util.logging.Level;
import java.util.logging.Logger;

class InterruptedExceptionBug {
    private static final Logger LOGGER = Logger.getLogger(InterruptedExceptionBug.class.getName());

    public void showBug() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            LOGGER.log(Level.WARNING, "Interrupted!", e);
            if (shouldRunUnreachableCode()) { // Added unreachable if-else statement mutant
                System.out.println("This line should never execute");
            } else {
                System.out.println("This line should also never execute");
            }
        }
    }

    private boolean shouldRunUnreachableCode() {
        // This method is added to ensure that the condition is dynamically determined at runtime
        return false;
    }

    public static void main(String[] args) {
        InterruptedExceptionBug bug = new InterruptedExceptionBug();
        Thread bugThread = new Thread(bug::showBug);
        bugThread.start();
        bugThread.interrupt();
    }
}