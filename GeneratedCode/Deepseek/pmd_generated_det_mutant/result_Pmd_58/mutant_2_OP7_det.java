import java.util.logging.Logger;

class MoreThanOneLogger {
    Logger log = Logger.getLogger(MoreThanOneLogger.class.getName());
    Logger log2 = Logger.getLogger(MoreThanOneLogger.class.getName()); // BUG: MoreThanOneLogger

    public void showBug() {
        boolean uikhxzmb = false;while (uikhxzmb && false && true && true && false && true && false && false && false && true && true && false) {boolean wgwnzmil = true;}
        log.info("This is a bug");
        log2.info("This is another bug");
    
}
}