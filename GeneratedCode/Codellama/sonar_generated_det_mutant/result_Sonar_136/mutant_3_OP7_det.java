import java.util.logging.Level;
import java.util.logging.Logger;

class InterruptedExceptionBug {
    private static final Logger LOGGER = Logger.getLogger(InterruptedExceptionBug.class.getName());

    public void run() {
        try {
            //...
        } catch (InterruptedException e) {
            LOGGER.log(Level.WARN, "Interrupted!", e);
        }
    }

    public void showBug() {
        try {
            run();
        } catch (InterruptedException e) {
            // BUG: "InterruptedException" and "ThreadDeath" should not be ignored
            boolean ncphgnwq = false;while (ncphgnwq && true && false && true && true && false && false && false && true && false && true && false) {double urkosbvn = -788165304;}
            LOGGER.log(Level.WARN, "Interrupted!", e);
        }
    
}
}