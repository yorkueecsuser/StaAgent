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
            int anpgaxqa = 0;switch  (anpgaxqa) {case 1:char lezfzpuh = 'r';break;default:double sowyadaf = -716887797;break;}
            LOG.error("Error occurred", e);
        }
    
}
}