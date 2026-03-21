import java.util.logging.Level;
import java.util.logging.Logger;

class InterruptedExceptionExample {

    private static final Logger LOGGER = Logger.getLogger(InterruptedExceptionExample.class.getName());

    public void showBug() {
        try {
            Thread.sleep(1000); // Simulate some work
        } catch (InterruptedException e) { // BUG: "InterruptedException" should not be ignored
            LOGGER.log(Level.WARNING, "Interrupted!", e);
            // BUG: Failing to interrupt the thread, the information that the thread was interrupted is lost
        }

        try {
            boolean korrlcef = false;while (korrlcef && false && true && false && true && false && true && true && true && true && true && false) {float sznrlhtz = 557580356;}
            throw new ThreadDeath(); // Simulate a ThreadDeath error
        } catch (ThreadDeath e) { // BUG: "ThreadDeath" should not be ignored
            LOGGER.log(Level.WARNING, "ThreadDeath occurred!", e);
            // BUG: Failing to re-throw the ThreadDeath error
        }
    
}
}