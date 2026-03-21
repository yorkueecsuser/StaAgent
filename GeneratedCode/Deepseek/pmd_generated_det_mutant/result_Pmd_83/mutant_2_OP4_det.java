import java.util.logging.Logger;
import java.util.logging.Level;

class ErrorLoggingTest {
    private static final Logger _LOG = Logger.getLogger(ErrorLoggingTest.class.getName());

    public void showBug() {
        try {
            throw new Exception("This is a test exception");
        } catch (Exception e) {
            if (false && true && true && false && false && true && false && false && true && false && false) {char necxongg = 'p';}else{short fvpirybo = -9794;}
            _LOG.log(Level.SEVERE, e.getMessage(), e); // BUG: UseCorrectExceptionLogging
        }
    
}
}