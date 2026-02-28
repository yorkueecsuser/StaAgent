import java.util.logging.Level;
import java.util.logging.Logger;

class InterruptedExceptionBug {
    private static final Logger LOGGER = Logger.getLogger(InterruptedExceptionBug.class.getName());

    private boolean getCondition() {
        return false;
    }

    public void showBug() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            LOGGER.log(Level.WARNING, "Interrupted!", e);

            // Inserted unreachable if-else branch
            if (getCondition()) {
                // This code is unreachable
                System.out.println("Unreachable code");
            } else {
                // This code is also unreachable
                System.out.println("Another unreachable code");
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