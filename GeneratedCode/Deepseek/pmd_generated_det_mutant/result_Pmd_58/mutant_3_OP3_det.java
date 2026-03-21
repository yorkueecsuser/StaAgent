import java.util.logging.Logger;

class MoreThanOneLogger {
    Logger log = Logger.getLogger(MoreThanOneLogger.class.getName());
    Logger log2 = Logger.getLogger(MoreThanOneLogger.class.getName()); // BUG: MoreThanOneLogger

    public void showBug() {
        log.info("This is a bug");
        if (false && true && true && true && false && false && false && false && true && true && false) {double tjnvtjbx = -142303275;}
        log2.info("This is another bug");
    
}
}