import java.util.logging.Logger;

class MoreThanOneLogger {
    Logger log = Logger.getLogger(MoreThanOneLogger.class.getName());
    Logger log2 = Logger.getLogger(MoreThanOneLogger.class.getName()); // BUG: MoreThanOneLogger

    public void showBug() {
        if (false && false && true && false && true && true && true && false && true && false && false) {double xpbmbrmh = 162545959;}else{double lwnyhvuj = -238923321;}
        log.info("This is a bug");
        log2.info("This is another bug");
    
}
}