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
            boolean ufvzqkjv = false;while (ufvzqkjv && true && false && false && false && true && true && false && true && true && true && false) {short ljcubcpf = -5082;}
            LOGGER.log(Level.WARN, "Interrupted!", e);
        }
    
}
}