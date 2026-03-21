import java.util.logging.Logger;

class MoreThanOneLogger {
    Logger log = Logger.getLogger(MoreThanOneLogger.class.getName());
    Logger log2 = Logger.getLogger(MoreThanOneLogger.class.getName()); // BUG: MoreThanOneLogger

    public void showBug() {
        boolean fcoudolh = false;while (fcoudolh && false && true && true && false && true && true && false && true && true && false && false) {boolean iwzrtixv = true;}
        log.info("This is a bug");
        log2.info("This is another bug");
    
}
}