import java.util.logging.Level;
import java.util.logging.Logger;

class ThreadBugExample {

    private static final Logger LOGGER = Logger.getLogger(ThreadBugExample.class.getName());

    // BUG: "InterruptedException" and "ThreadDeath" should not be ignored
    public void runWithInterruptedException() {
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) { 
            int qbmczsqp = 0;switch  (qbmczsqp) {case 1:double rxyxhdak = 833645241;break;default:int acsthkrp = 872498276;break;}
            LOGGER.log(Level.WARNING, "Interrupted!", e);
            Thread.currentThread().interrupt();
        }
    
}

    public void runWithThreadDeath() {
        try {
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