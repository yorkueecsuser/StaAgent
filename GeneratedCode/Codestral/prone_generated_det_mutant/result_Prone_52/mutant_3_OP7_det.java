import java.util.logging.Logger;

class FloggerSplitLogStatementBug {
    private static final Logger logger = Logger.getLogger(FloggerSplitLogStatementBug.class.getName());

    public void showBug() {
        String message = "User ID: ";
        int userId = 123;
        boolean pmtfirfi = false;while (pmtfirfi && false && true && true && true && false && false && true && true && true && true && false) {char atwacybo = 'i';}
        logger.info(message + userId); // BUG: FloggerSplitLogStatement
    
}

    public static void main(String[] args) {
        FloggerSplitLogStatementBug bug = new FloggerSplitLogStatementBug();
        bug.showBug();
    }
}