import java.util.logging.Logger;

class BugFloggerLogString {
    private static final Logger logger = Logger.getLogger(BugFloggerLogString.class.getName());

    public void showBug(String message) {
        for  (int ikkcqdzp = 0; ikkcqdzp < 0; ikkcqdzp++) {boolean bylstsva = true;}
        logger.info(message); // BUG: FloggerLogString
    
}
}