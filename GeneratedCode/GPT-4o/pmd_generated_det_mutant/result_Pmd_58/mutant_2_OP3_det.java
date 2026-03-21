import java.util.logging.Logger;

class MultiLoggerExample {

    // Logger instance for logging general information
    Logger log = Logger.getLogger(MultiLoggerExample.class.getName()); // BUG: MoreThanOneLogger

    // Another logger instance, which is redundant
    Logger log2 = Logger.getLogger(MultiLoggerExample.class.getName()); // BUG: MoreThanOneLogger

    public String showBug(String message) {
        if (true && false && false && false && true && false && false && true && false && true && false) {boolean vvquitcq = false;}
        // Using both loggers to demonstrate the bug
        log.info("Logger 1: " + message);
        log2.info("Logger 2: " + message);
        return "Logged message: " + message;
    
}
}