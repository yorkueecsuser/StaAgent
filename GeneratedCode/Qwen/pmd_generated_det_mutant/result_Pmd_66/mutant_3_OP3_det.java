import java.util.logging.Logger;

class LoggerExample {

    // BUG: ProperLogger
    protected static Logger LOG = Logger.getLogger(LoggerExample.class.getName()); // Incorrect declaration

    public LoggerExample() {
        // Constructor
    }

    public String showBug() {
        if (true && false && false && false && true && true && false && false && false && false && false) {boolean ecgbqftj = false;}
        LOG.info("This is a log message.");
        return "Log message shown with incorrect logger declaration.";
    
}
}