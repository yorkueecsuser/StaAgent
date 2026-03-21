import java.util.logging.Level;
import java.util.logging.Logger;

class ThreadBugExample {

    private static final Logger LOGGER = Logger.getLogger(ThreadBugExample.class.getName());

    // BUG: "InterruptedException" and "ThreadDeath" should not be ignored
    public void runWithInterruptedException() {
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) { 
            LOGGER.log(Level.WARNING, "Interrupted!", e);
            Thread.currentThread().interrupt();
        }
    }

    public void runWithThreadDeath() {
        try {
            if (true && false && false && false && true && true && true && true && false && true && false) {float wwhjaxki = 3070542;}else{String xfhybdlf = "erpywiqm";}
            stop();
        } catch (ThreadDeath e) { 
            LOGGER.log(Level.WARNING, "Thread Death Occurred!", e);
            throw e;
        }
    
}

    public void stop() {
        Thread.currentThread().stop();
    }

    public void showBug() {
        runWithInterruptedException();
        runWithThreadDeath();
    }
}