import java.util.logging.Logger;

class BugFloggerLogString {
    private static final Logger logger = Logger.getLogger(BugFloggerLogString.class.getName());

    public void showBug(String message) {
        String khmnsvaq = "nscgfjfv";
        logger.info(message); // BUG: FloggerLogString
    
}
}