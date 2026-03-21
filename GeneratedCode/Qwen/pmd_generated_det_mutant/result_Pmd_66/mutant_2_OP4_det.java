import java.util.logging.Logger;

class LoggerExample {

    // BUG: ProperLogger
    protected static Logger LOG = Logger.getLogger(LoggerExample.class.getName()); // Incorrect declaration

    public LoggerExample() {
        // Constructor
    }

    public String showBug() {
        if (false && false && true && true && true && true && false && true && true && true && false) {byte cwxwxgsx = -58;}else{boolean cijiamdi = true;}
        LOG.info("This is a log message.");
        return "Log message shown with incorrect logger declaration.";
    
}
}