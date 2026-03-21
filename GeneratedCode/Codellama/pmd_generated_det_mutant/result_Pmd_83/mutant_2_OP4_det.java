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
            if (false && false && false && false && true && true && false && false && true && true && false) {String upnphhxo = "xrxcflhg";}else{int mzlbdhnd = -598255497;}
            LOG.error("Error occurred", e);
        }
    
}
}