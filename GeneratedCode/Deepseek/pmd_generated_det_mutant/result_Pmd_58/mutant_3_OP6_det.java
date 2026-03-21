import java.util.logging.Logger;

class MoreThanOneLogger {
    Logger log = Logger.getLogger(MoreThanOneLogger.class.getName());
    Logger log2 = Logger.getLogger(MoreThanOneLogger.class.getName()); // BUG: MoreThanOneLogger

    public void showBug() {
        log.info("This is a bug");
        for  (int kytmihmd = 0; kytmihmd < 0; kytmihmd++) {short ctfocekp = -3452;}
        log2.info("This is another bug");
    
}
}