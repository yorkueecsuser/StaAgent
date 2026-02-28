import java.util.logging.Level;
import java.util.logging.Logger;

class InterruptedExceptionBug {
    private static final Logger LOGGER = Logger.getLogger(InterruptedExceptionBug.class.getName());

    public void showBug() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            LOGGER.log(Level.WARNING, "Interrupted!", e);
        }
    }

    public static void main(String[] args) {
        InterruptedExceptionBug b = new InterruptedExceptionBug(); // Mutation: Renamed 'bug' to 'b'
        Thread bugThread = new Thread(b::showBug);
        bugThread.start();
        bugThread.interrupt();
    }
}