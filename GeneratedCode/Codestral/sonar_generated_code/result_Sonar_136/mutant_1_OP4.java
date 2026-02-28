import java.util.logging.Level;
import java.util.logging.Logger;

class InterruptedExceptionBug {
    private static final Logger LOGGER = Logger.getLogger(InterruptedExceptionBug.class.getName());

    public void showBug() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            LOGGER.log(Level.WARNING, "Interrupted!", e);
            // Mutant code: Adding an unreachable if-else branch
            boolean unreachableCondition = false;
            if (unreachableCondition) {
                // Unreachable code
                System.out.println("This code is unreachable.");
            } else {
                // Alternative code
                // This block is actually reachable
                System.out.println("This code is reachable.");
            }
        }
    }

    public static void main(String[] args) {
        InterruptedExceptionBug bug = new InterruptedExceptionBug();
        Thread bugThread = new Thread(bug::showBug);
        bugThread.start();
        bugThread.interrupt();
    }
}