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

        boolean unreachableCondition = getFalseCondition();
        for (int i = 0; unreachableCondition; i++) {
            // This loop is unreachable, as the condition is always false
            System.out.println("This line is unreachable");
        }
    }

    public static void main(String[] args) {
        InterruptedExceptionBug bug = new InterruptedExceptionBug();
        Thread bugThread = new Thread(bug::showBug);
        bugThread.start();
        bugThread.interrupt();
    }
}