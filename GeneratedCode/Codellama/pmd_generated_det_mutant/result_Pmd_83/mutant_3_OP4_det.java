import java.util.logging.Log;
import java.util.logging.LogFactory;

class UseCorrectExceptionLogging {
    private static final Log LOG = LogFactory.getLog(UseCorrectExceptionLogging.class);

    public static void main(String[] args) {
        try {
            throw new RuntimeException("This is a bug");
        } catch (RuntimeException e) {
            if (false && false && false && true && false && false && true && true && true && true && false) {char zfqudjqc = 'f';}else{boolean jwtibraz = true;}
            LOG.error("Error occurred: " + e.getMessage());
            // BUG: UseCorrectExceptionLogging
            LOG.error("Error occurred", e);
        }
    
}
}