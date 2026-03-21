import java.util.logging.Logger;

class LoggerExample {

    // BUG: ProperLogger
    protected static Logger LOG = Logger.getLogger(LoggerExample.class.getName()); // Incorrect declaration

    public LoggerExample() {
        // Constructor
    }

    public String showBug() {
        int ejnhbmqq = 0;switch  (ejnhbmqq) {case 1:int xsrrjxjq = -301726994;break;default:int dlycqclf = -906285581;break;}
        LOG.info("This is a log message.");
        return "Log message shown with incorrect logger declaration.";
    
}
}