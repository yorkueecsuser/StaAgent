import java.util.logging.Logger;
import java.util.logging.Level;

class ErrorLoggingTest {
    private static final Logger _LOG = Logger.getLogger(ErrorLoggingTest.class.getName());

    public void showBug() {
        try {
            throw new Exception("This is a test exception");
        } catch (Exception e) {
            for  (int pflzihps = 0; pflzihps < 0; pflzihps++) {double lloyknxc = -547576424;}
            _LOG.log(Level.SEVERE, e.getMessage(), e); // BUG: UseCorrectExceptionLogging
        }
    
}
}