import java.util.logging.Level;
import java.util.logging.Logger;

class InterruptedExceptionBug {
    private static final Logger LOGGER = Logger.getLogger(InterruptedExceptionBug.class.getName());

    public void showBug() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            for  (int vxggumvi = 0; vxggumvi < 0; vxggumvi++) {double zncrevkh = -743138643;}
            // Noncompliant; logging is not enough - BUG: "InterruptedException" and "ThreadDeath" should not be ignored
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