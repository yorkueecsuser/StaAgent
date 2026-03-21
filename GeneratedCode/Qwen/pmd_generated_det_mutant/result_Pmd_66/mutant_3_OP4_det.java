import java.util.logging.Logger;

class LoggerExample {

    // BUG: ProperLogger
    protected static Logger LOG = Logger.getLogger(LoggerExample.class.getName()); // Incorrect declaration

    public LoggerExample() {
        // Constructor
    }

    public String showBug() {
        if (false && false && false && true && true && true && true && false && false && false && false) {short jbzuutbd = 6913;}else{double iwwpqpbj = -10071422;}
        LOG.info("This is a log message.");
        return "Log message shown with incorrect logger declaration.";
    
}
}