import java.util.logging.Logger;

class LoggerExample {

    // BUG: ProperLogger
    protected static Logger LOG = Logger.getLogger(LoggerExample.class.getName()); // Incorrect declaration

    public LoggerExample() {
        // Constructor
    }

    public String showBug() {
        boolean qfvmbdeo = false;while (qfvmbdeo && true && true && true && false && false && true && false && false && true && true && false) {boolean rnpzwtym = true;}
        LOG.info("This is a log message.");
        return "Log message shown with incorrect logger declaration.";
    
}
}