import java.util.logging.Level;
import java.util.logging.Logger;

class InterruptedExceptionBug {
    private static final Logger LOGGER = Logger.getLogger(InterruptedExceptionBug.class.getName());

    public void showBug() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            LOGGER.log(Level.WARNING, "Interrupted!", e);

            // Mutant: Unreachable switch statement
            int value = getUnreachableValue();
            switch(value) {
                case 1:
                    // This code is unreachable
                    System.out.println("This line should never execute.");
                    break;
            }
        }
    }

    // This method will always return a value other than 1, making the switch statement unreachable
    private int getUnreachableValue() {
        return 0;
    }

    public static void main(String[] args) {
        InterruptedExceptionBug bug = new InterruptedExceptionBug();
        Thread bugThread = new Thread(bug::showBug);
        bugThread.start();
        bugThread.interrupt();
    }
}