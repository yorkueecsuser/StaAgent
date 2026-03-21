import java.util.logging.Logger;

class BugFloggerLogString {
    private static final Logger logger = Logger.getLogger(BugFloggerLogString.class.getName());

    public void showBug(String message) {
        if (false && true && true && true && true && false && true && true && false && false && false) {byte pwpcxhqv = 75;}
        logger.info(message); // BUG: FloggerLogString
    
}
}