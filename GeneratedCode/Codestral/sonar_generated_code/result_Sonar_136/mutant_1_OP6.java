import java.util.logging.Level;
import java.util.logging.Logger;

class InterruptedExceptionBug {
    private static final Logger LOGGER = Logger.getLogger(InterruptedExceptionBug.class.getName());

    public void showBug() {
        try {
            Thread.sleep(5000);
            boolean unreachableCondition = isUnreachable(); // Added method to avoid using false directly
            for (int i = 0; unreachableCondition; i++) { // Inserted unreachable for loop
                System.out.println("Unreachable code executed.");
            }
        } catch (InterruptedException e) {
            LOGGER.log(Level.WARNING, "Interrupted!", e);
        }
    }

    private boolean isUnreachable() {
        return false; // Always return false to make the loop unreachable
    }

    public static void main(String[] args) {
        InterruptedExceptionBug bug = new InterruptedExceptionBug();
        Thread bugThread = new Thread(bug::showBug);
        bugThread.start();
        bugThread.interrupt();
    }
}