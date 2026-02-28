import java.util.logging.Level;
import java.util.logging.Logger;

class InterruptedExceptionBug {
    private static final Logger LOGGER = Logger.getLogger(InterruptedExceptionBug.class.getName());

    private boolean getFalseValue() {
        return false;
    }

    public void showBug() {
        try {
            Thread.sleep(5000);

            // Unreachable switch statement
            boolean falseValue = getFalseValue();
            switch (falseValue) {
                case true:
                    System.out.println("This line will never execute.");
                    break;
            }

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