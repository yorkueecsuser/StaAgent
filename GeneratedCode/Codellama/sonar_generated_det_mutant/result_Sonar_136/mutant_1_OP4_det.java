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
            if (true && false && false && true && true && false && false && false && false && true && false) {double tjkqisdc = 392136596;}else{int oacwqkyz = 743535135;}
            LOGGER.log(Level.WARN, "Interrupted!", e);
        }
    
}
}