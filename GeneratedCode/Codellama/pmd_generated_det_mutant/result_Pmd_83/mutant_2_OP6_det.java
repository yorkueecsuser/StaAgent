import java.util.logging.Log;
import java.util.logging.LogFactory;

class UseCorrectExceptionLogging {
    private static final Log LOG = LogFactory.getLog(UseCorrectExceptionLogging.class);

    public static void main(String[] args) {
        try {
            throw new RuntimeException("This is a bug");
        } catch (RuntimeException e) {
            LOG.error("Error occurred: " + e.getMessage());
            // BUG: UseCorrectExceptionLogging
            for  (int xvetulrm = 0; xvetulrm < 0; xvetulrm++) {short sstgsybm = -1509;}
            LOG.error("Error occurred", e);
        }
    
}
}