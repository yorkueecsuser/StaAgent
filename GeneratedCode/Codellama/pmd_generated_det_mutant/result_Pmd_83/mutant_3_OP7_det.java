import java.util.logging.Log;
import java.util.logging.LogFactory;

class UseCorrectExceptionLogging {
    private static final Log LOG = LogFactory.getLog(UseCorrectExceptionLogging.class);

    public static void main(String[] args) {
        boolean bhgsyfvr = false;while (bhgsyfvr && false && false && false && false && false && true && true && true && false && false && false) {float kuwzwysw = 33921500;}
        try {
            throw new RuntimeException("This is a bug");
        } catch (RuntimeException e) {
            LOG.error("Error occurred: " + e.getMessage());
            // BUG: UseCorrectExceptionLogging
            LOG.error("Error occurred", e);
        }
    
}
}