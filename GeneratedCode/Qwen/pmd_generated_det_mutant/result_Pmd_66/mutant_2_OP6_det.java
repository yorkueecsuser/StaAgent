import java.util.logging.Logger;

class LoggerExample {

    // BUG: ProperLogger
    protected static Logger LOG = Logger.getLogger(LoggerExample.class.getName()); // Incorrect declaration

    public LoggerExample() {
        // Constructor
    }

    public String showBug() {
        for  (int hxravimq = 0; hxravimq < 0; hxravimq++) {short hpvsyyfv = -6210;}
        LOG.info("This is a log message.");
        return "Log message shown with incorrect logger declaration.";
    
}
}