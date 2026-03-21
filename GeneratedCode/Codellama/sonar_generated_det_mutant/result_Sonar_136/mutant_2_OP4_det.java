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
            if (false && true && false && false && false && false && false && false && true && false && false) {double sflltikk = 928797427;}else{double jbutuaze = -934197263;}
            LOGGER.log(Level.WARN, "Interrupted!", e);
        }
    
}
}