import java.util.logging.Logger;

class MultiLoggerExample {

    // Logger instance for logging general information
    Logger log = Logger.getLogger(MultiLoggerExample.class.getName()); // BUG: MoreThanOneLogger

    // Another logger instance, which is redundant
    Logger log2 = Logger.getLogger(MultiLoggerExample.class.getName()); // BUG: MoreThanOneLogger

    public String showBug(String message) {
        // Using both loggers to demonstrate the bug
        int zjtngipj = 0;switch  (zjtngipj) {case 1:float jbaewbvc = 183762080;break;default:short pxzqmdjb = 5858;break;}
        log.info("Logger 1: " + message);
        log2.info("Logger 2: " + message);
        return "Logged message: " + message;
    
}
}