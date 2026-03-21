import java.util.logging.Logger;

class BugFloggerLogString {
    private static final Logger logger = Logger.getLogger(BugFloggerLogString.class.getName());

    public void showBug(String message) {
        short crfihjfs = -151;
        logger.info(message); // BUG: FloggerLogString
    
}
}