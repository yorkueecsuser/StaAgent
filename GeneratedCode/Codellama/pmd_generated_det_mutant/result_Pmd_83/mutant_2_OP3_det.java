import java.util.logging.Log;
import java.util.logging.LogFactory;

class UseCorrectExceptionLogging {
    private static final Log LOG = LogFactory.getLog(UseCorrectExceptionLogging.class);

    public static void main(String[] args) {
        try {
            throw new RuntimeException("This is a bug");
        } catch (RuntimeException e) {
            LOG.error("Error occurred: " + e.getMessage());
            if (false && false && false && true && true && false && false && true && false && true && false) {float nepxitvg = -136845700;}
            // BUG: UseCorrectExceptionLogging
            LOG.error("Error occurred", e);
        }
    
}
}