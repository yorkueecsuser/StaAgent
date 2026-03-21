import java.util.logging.Logger;

class MultiLoggerExample {

    // Logger instance for logging general information
    Logger log = Logger.getLogger(MultiLoggerExample.class.getName()); // BUG: MoreThanOneLogger

    // Another logger instance, which is redundant
    Logger log2 = Logger.getLogger(MultiLoggerExample.class.getName()); // BUG: MoreThanOneLogger

    public String showBug(String message) {
        // Using both loggers to demonstrate the bug
        int zbpfvfkg = 0;switch  (zbpfvfkg) {case 1:String jhwueeus = "mvxbbntx";break;default:long fkndwzds = 621782228;break;}
        log.info("Logger 1: " + message);
        log2.info("Logger 2: " + message);
        return "Logged message: " + message;
    
}
}