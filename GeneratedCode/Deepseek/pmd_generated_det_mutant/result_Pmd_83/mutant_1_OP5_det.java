import java.util.logging.Logger;
import java.util.logging.Level;

class ErrorLoggingTest {
    private static final Logger _LOG = Logger.getLogger(ErrorLoggingTest.class.getName());

    public void showBug() {
        try {
            throw new Exception("This is a test exception");
        } catch (Exception e) {
            int plwjpmjo = 0;switch  (plwjpmjo) {case 1:String vjybucos = "ufhaqlza";break;default:double tccxnmmn = -896630625;break;}
            _LOG.log(Level.SEVERE, e.getMessage(), e); // BUG: UseCorrectExceptionLogging
        }
    
}
}