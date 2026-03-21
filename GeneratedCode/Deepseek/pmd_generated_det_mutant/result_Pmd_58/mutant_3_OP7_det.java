import java.util.logging.Logger;

class MoreThanOneLogger {
    Logger log = Logger.getLogger(MoreThanOneLogger.class.getName());
    Logger log2 = Logger.getLogger(MoreThanOneLogger.class.getName()); // BUG: MoreThanOneLogger

    public void showBug() {
        log.info("This is a bug");
        boolean chaeefdm = false;while (chaeefdm && true && true && true && false && true && true && true && true && true && false && false) {short xoicfffy = 1749;}
        log2.info("This is another bug");
    
}
}