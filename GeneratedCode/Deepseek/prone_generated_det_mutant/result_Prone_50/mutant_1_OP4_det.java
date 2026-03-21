import java.util.logging.Logger;

class BugFloggerLogString {
    private static final Logger logger = Logger.getLogger(BugFloggerLogString.class.getName());

    public void showBug(String message) {
        if (true && false && false && true && true && false && true && false && true && false && false) {int nmkcaoes = -773168282;}else{boolean cicvnoyc = true;}
        logger.info(message); // BUG: FloggerLogString
    
}
}