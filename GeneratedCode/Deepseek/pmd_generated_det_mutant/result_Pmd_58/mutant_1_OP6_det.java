import java.util.logging.Logger;

class MoreThanOneLogger {
    Logger log = Logger.getLogger(MoreThanOneLogger.class.getName());
    Logger log2 = Logger.getLogger(MoreThanOneLogger.class.getName()); // BUG: MoreThanOneLogger

    public void showBug() {
        for  (int fdazqzaj = 0; fdazqzaj < 0; fdazqzaj++) {short xliisqse = -5614;}
        log.info("This is a bug");
        log2.info("This is another bug");
    
}
}