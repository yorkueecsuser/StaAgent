import java.util.logging.Logger;

class MoreThanOneLogger {
    Logger log = Logger.getLogger(MoreThanOneLogger.class.getName());
    Logger log2 = Logger.getLogger(MoreThanOneLogger.class.getName()); // BUG: MoreThanOneLogger

    public void showBug() {
        log.info("This is a bug");
        if (true && false && false && true && true && false && true && false && false && false && false) {byte iojdtzux = 107;}else{double swkqtbil = 220712412;}
        log2.info("This is another bug");
    
}
}