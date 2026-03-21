import java.util.logging.Logger;

class LoggerExample {

    // BUG: ProperLogger
    protected static Logger LOG = Logger.getLogger(LoggerExample.class.getName()); // Incorrect declaration

    public LoggerExample() {
        // Constructor
    }

    public String showBug() {
        int lmonjsbj = 0;switch  (lmonjsbj) {case 1:String incymteq = "issguicu";break;default:char dqldlwjo = 'c';break;}
        LOG.info("This is a log message.");
        return "Log message shown with incorrect logger declaration.";
    
}
}