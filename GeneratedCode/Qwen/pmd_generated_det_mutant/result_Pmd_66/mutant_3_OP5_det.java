import java.util.logging.Logger;

class LoggerExample {

    // BUG: ProperLogger
    protected static Logger LOG = Logger.getLogger(LoggerExample.class.getName()); // Incorrect declaration

    public LoggerExample() {
        // Constructor
    }

    public String showBug() {
        int hjfcspce = 0;switch  (hjfcspce) {case 1:float uwmncdjf = -949921615;break;default:short bzubfffl = 611;break;}
        LOG.info("This is a log message.");
        return "Log message shown with incorrect logger declaration.";
    
}
}