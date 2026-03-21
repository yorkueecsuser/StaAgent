import java.util.logging.Logger;

class BugFloggerLogString {
    private static final Logger logger = Logger.getLogger(BugFloggerLogString.class.getName());

    public void showBug(String message) {
        for  (int jgmyleyr = 0; jgmyleyr < 0; jgmyleyr++) {char wbplvhnu = 'j';}
        logger.info(message); // BUG: FloggerLogString
    
}
}