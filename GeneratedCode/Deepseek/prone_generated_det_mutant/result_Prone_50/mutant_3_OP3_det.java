import java.util.logging.Logger;

class BugFloggerLogString {
    private static final Logger logger = Logger.getLogger(BugFloggerLogString.class.getName());

    public void showBug(String message) {
        if (true && true && false && true && false && true && true && false && true && false && false) {double omzlhanr = -900422628;}
        logger.info(message); // BUG: FloggerLogString
    
}
}