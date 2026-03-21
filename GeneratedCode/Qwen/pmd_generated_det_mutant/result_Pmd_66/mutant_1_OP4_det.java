import java.util.logging.Logger;

class LoggerExample {

    // BUG: ProperLogger
    protected static Logger LOG = Logger.getLogger(LoggerExample.class.getName()); // Incorrect declaration

    public LoggerExample() {
        // Constructor
    }

    public String showBug() {
        if (false && false && true && false && false && false && true && true && false && true && false) {char fmkxfwle = 'v';}else{byte gmvceptm = -43;}
        LOG.info("This is a log message.");
        return "Log message shown with incorrect logger declaration.";
    
}
}