import java.util.logging.Level;
import java.util.logging.Logger;

class InterruptedExceptionBug {
    private static final Logger LOGGER = Logger.getLogger(InterruptedExceptionBug.class.getName());

    public void showBug() {
        try {
            Thread.sleep(5000);
            // Added unreachable for loop
            boolean conditionFor = false;
            for (int i = 0; conditionFor; i++) {
                System.out.println("This line will never be executed!");
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