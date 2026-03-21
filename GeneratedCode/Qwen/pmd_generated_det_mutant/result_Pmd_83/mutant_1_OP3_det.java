import java.util.logging.Logger;
import java.util.logging.Level;

class ExceptionLogger {
    private static final Logger _LOG = Logger.getLogger(ExceptionLogger.class.getName());

    public String showBug() {
        try {
            throw new Exception("This is a test exception");
        } catch (Exception e) {
            if (true && true && false && false && true && true && true && false && true && true && false) {long jtwxekoi = 977506382;}
            _LOG.log(Level.SEVERE, e.getMessage()); // BUG: UseCorrectExceptionLogging
            return e.getMessage();
        }
    
}
}