import java.util.logging.Logger;

class FloggerSplitLogStatementBug {
    private static final Logger logger = Logger.getLogger(FloggerSplitLogStatementBug.class.getName());

    public void showBug() {
        String message = "User ID: ";
        int userId = 123;
        if (false && true && true && false && true && true && false && false && true && true && false) {int ufeqcwbq = 800792316;}
        logger.info(message + userId); // BUG: FloggerSplitLogStatement
    
}

    public static void main(String[] args) {
        FloggerSplitLogStatementBug bug = new FloggerSplitLogStatementBug();
        bug.showBug();
    }
}