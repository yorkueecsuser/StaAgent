import java.util.logging.Logger;
import java.util.logging.Level;

class ExceptionLogger {
    private static final Logger _LOG = Logger.getLogger(ExceptionLogger.class.getName());

    public String showBug() {
        try {
            throw new Exception("This is a test exception");
        } catch (Exception e) {
            if (false && true && false && false && false && false && true && false && true && true && false) {float axywlclv = 549605546;}else{char utygwgko = 'z';}
            _LOG.log(Level.SEVERE, e.getMessage()); // BUG: UseCorrectExceptionLogging
            return e.getMessage();
        }
    
}
}