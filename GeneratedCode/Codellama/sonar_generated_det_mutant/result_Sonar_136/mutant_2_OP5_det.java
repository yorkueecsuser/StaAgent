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
            int ntraggtu = 0;switch  (ntraggtu) {case 1:float sabrysfw = 736654952;break;default:boolean zwphtpsy = true;break;}
            LOGGER.log(Level.WARN, "Interrupted!", e);
        }
    
}
}