import java.util.logging.Logger;
import java.util.logging.Level;

class ExceptionLogger {
    private static final Logger _LOG = Logger.getLogger(ExceptionLogger.class.getName());

    public String showBug() {
        try {
            throw new Exception("This is a test exception");
        } catch (Exception e) {
            boolean hpilcrsa = false;while (hpilcrsa && false && true && false && false && false && false && true && true && false && false && false) {float nivxnocs = -191130148;}
            _LOG.log(Level.SEVERE, e.getMessage()); // BUG: UseCorrectExceptionLogging
            return e.getMessage();
        }
    
}
}