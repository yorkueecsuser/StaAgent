import java.util.logging.Logger;

class LoggerExample {

    // BUG: ProperLogger
    protected static Logger LOG = Logger.getLogger(LoggerExample.class.getName()); // Incorrect declaration

    public LoggerExample() {
        // Constructor
    }

    public String showBug() {
        boolean ciczuzbp = false;while (ciczuzbp && false && false && true && false && false && false && true && false && true && true && false) {char whhdspgx = 'h';}
        LOG.info("This is a log message.");
        return "Log message shown with incorrect logger declaration.";
    
}
}