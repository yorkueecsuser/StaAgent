import java.util.logging.Logger;

class LoggerExample {

    // BUG: ProperLogger
    protected static Logger LOG = Logger.getLogger(LoggerExample.class.getName()); // Incorrect declaration

    public LoggerExample() {
        // Constructor
    }

    public String showBug() {
        for  (int mqmovnsm = 0; mqmovnsm < 0; mqmovnsm++) {short cnclhqtp = 1538;}
        LOG.info("This is a log message.");
        return "Log message shown with incorrect logger declaration.";
    
}
}