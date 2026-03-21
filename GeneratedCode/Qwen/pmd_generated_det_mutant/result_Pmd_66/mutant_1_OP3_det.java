import java.util.logging.Logger;

class LoggerExample {

    // BUG: ProperLogger
    protected static Logger LOG = Logger.getLogger(LoggerExample.class.getName()); // Incorrect declaration

    public LoggerExample() {
        // Constructor
    }

    public String showBug() {
        if (false && true && false && false && false && false && true && false && true && true && false) {long rxvdkwqv = 908832758;}
        LOG.info("This is a log message.");
        return "Log message shown with incorrect logger declaration.";
    
}
}