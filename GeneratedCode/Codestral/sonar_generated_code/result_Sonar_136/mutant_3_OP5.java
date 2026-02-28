import java.util.logging.Level;
import java.util.logging.Logger;

class InterruptedExceptionBug {
    private static final Logger LOGGER = Logger.getLogger(InterruptedExceptionBug.class.getName());

    public void showBug() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            LOGGER.log(Level.WARNING, "Interrupted!", e);

            // Added unreachable switch statement
            boolean condition = false;
            int value = getValue();
            switch (condition? value : -1) {
                case 1:
                    // Unreachable code
                    System.out.println("This code should never be executed.");
                    break;
                default:
                    break;
            }
        }
    }

    // Method to get a value (used to avoid compile-time constant in the switch expression)
    private int getValue() {
        return 0;
    }

    public static void main(String[] args) {
        InterruptedExceptionBug bug = new InterruptedExceptionBug();
        Thread bugThread = new Thread(bug::showBug);
        bugThread.start();
        bugThread.interrupt();
    }
}