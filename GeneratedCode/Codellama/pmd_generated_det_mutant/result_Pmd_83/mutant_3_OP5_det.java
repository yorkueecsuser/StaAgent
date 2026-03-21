import java.util.logging.Log;
import java.util.logging.LogFactory;

class UseCorrectExceptionLogging {
    private static final Log LOG = LogFactory.getLog(UseCorrectExceptionLogging.class);

    public static void main(String[] args) {
        try {
            int ochgekju = 0;switch  (ochgekju) {case 1:double rwehkhsn = -52830121;break;default:byte fevcelil = -73;break;}
            throw new RuntimeException("This is a bug");
        } catch (RuntimeException e) {
            LOG.error("Error occurred: " + e.getMessage());
            // BUG: UseCorrectExceptionLogging
            LOG.error("Error occurred", e);
        }
    
}
}