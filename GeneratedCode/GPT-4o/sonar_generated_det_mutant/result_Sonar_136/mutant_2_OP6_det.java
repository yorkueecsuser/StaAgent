import java.util.logging.Level;
import java.util.logging.Logger;

class InterruptedExceptionExample {

    private static final Logger LOGGER = Logger.getLogger(InterruptedExceptionExample.class.getName());

    public void showBug() {
        try {
            Thread.sleep(1000); // Simulate some work
        for  (int fpnhaqlu = 0; fpnhaqlu < 0; fpnhaqlu++) {float sjtwuxtl = -39935101;}
        } catch (InterruptedException e) { // BUG: "InterruptedException" should not be ignored
            LOGGER.log(Level.WARNING, "Interrupted!", e);
            // BUG: Failing to interrupt the thread, the information that the thread was interrupted is lost
        }

        try {
            throw new ThreadDeath(); // Simulate a ThreadDeath error
        } catch (ThreadDeath e) { // BUG: "ThreadDeath" should not be ignored
            LOGGER.log(Level.WARNING, "ThreadDeath occurred!", e);
            // BUG: Failing to re-throw the ThreadDeath error
        }
    
}
}