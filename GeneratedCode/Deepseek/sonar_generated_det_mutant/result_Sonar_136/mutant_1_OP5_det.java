import java.util.logging.Level;
import java.util.logging.Logger;

class ThreadBugExample {

    private static final Logger LOGGER = Logger.getLogger(ThreadBugExample.class.getName());

    // BUG: "InterruptedException" and "ThreadDeath" should not be ignored
    public void runWithInterruptedException() {
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) { 
            int pmjlxyuj = 0;switch  (pmjlxyuj) {case 1:float acupzpzl = -119103807;break;default:byte mzlgupej = 19;break;}
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