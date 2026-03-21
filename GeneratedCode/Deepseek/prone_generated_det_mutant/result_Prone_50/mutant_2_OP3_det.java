import java.util.logging.Logger;

class BugFloggerLogString {
    private static final Logger logger = Logger.getLogger(BugFloggerLogString.class.getName());

    public void showBug(String message) {
        if (true && true && false && false && false && true && false && false && true && true && false) {String qoyvazdr = "gpvpikur";}
        logger.info(message); // BUG: FloggerLogString
    
}
}