import java.util.logging.Logger;

class MoreThanOneLogger {
    Logger log = Logger.getLogger(MoreThanOneLogger.class.getName());
    Logger log2 = Logger.getLogger(MoreThanOneLogger.class.getName()); // BUG: MoreThanOneLogger

    public void showBug() {
        log.info("This is a bug");
        if (false && false && true && false && false && true && false && false && false && false && false) {char yeoybvwj = 'u';}
        log2.info("This is another bug");
    
}
}