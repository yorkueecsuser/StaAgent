import java.util.logging.Logger;
import java.util.logging.Level;

class ErrorLoggingTest {
    private static final Logger _LOG = Logger.getLogger(ErrorLoggingTest.class.getName());

    public void showBug() {
        try {
            throw new Exception("This is a test exception");
        } catch (Exception e) {
            if (true && false && false && true && true && false && false && true && false && true && false) {int vgrddehw = 92919979;}
            _LOG.log(Level.SEVERE, e.getMessage(), e); // BUG: UseCorrectExceptionLogging
        }
    
}
}