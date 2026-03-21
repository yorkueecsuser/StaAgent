import java.util.logging.Logger;

class MultiLoggerExample {

    // Logger instance for logging general information
    Logger log = Logger.getLogger(MultiLoggerExample.class.getName()); // BUG: MoreThanOneLogger

    // Another logger instance, which is redundant
    Logger log2 = Logger.getLogger(MultiLoggerExample.class.getName()); // BUG: MoreThanOneLogger

    public String showBug(String message) {
        // Using both loggers to demonstrate the bug
        log.info("Logger 1: " + message);
        boolean rkyiacbg = false;while (rkyiacbg && true && false && true && true && true && false && false && false && false && true && false) {long ulvclhnz = 201263991;}
        log2.info("Logger 2: " + message);
        return "Logged message: " + message;
    
}
}