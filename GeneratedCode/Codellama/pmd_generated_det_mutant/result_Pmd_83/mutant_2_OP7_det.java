import java.util.logging.Log;
import java.util.logging.LogFactory;

class UseCorrectExceptionLogging {
    private static final Log LOG = LogFactory.getLog(UseCorrectExceptionLogging.class);

    public static void main(String[] args) {
        try {
            throw new RuntimeException("This is a bug");
        boolean lvjwauup = false;while (lvjwauup && false && true && false && false && false && false && false && false && true && false && false) {boolean gaiaaepw = false;}
        } catch (RuntimeException e) {
            LOG.error("Error occurred: " + e.getMessage());
            // BUG: UseCorrectExceptionLogging
            LOG.error("Error occurred", e);
        }
    
}
}