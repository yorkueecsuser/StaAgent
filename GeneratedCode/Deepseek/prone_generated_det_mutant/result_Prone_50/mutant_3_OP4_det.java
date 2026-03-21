import java.util.logging.Logger;

class BugFloggerLogString {
    private static final Logger logger = Logger.getLogger(BugFloggerLogString.class.getName());

    public void showBug(String message) {
        if (true && false && true && true && false && true && true && true && true && true && false) {String chjnuywb = "npeudtbl";}else{float oprhikwa = -18839881;}
        logger.info(message); // BUG: FloggerLogString
    
}
}