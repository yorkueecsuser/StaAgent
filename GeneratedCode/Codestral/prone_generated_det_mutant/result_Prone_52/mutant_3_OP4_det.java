import java.util.logging.Logger;

class FloggerSplitLogStatementBug {
    private static final Logger logger = Logger.getLogger(FloggerSplitLogStatementBug.class.getName());

    public void showBug() {
        String message = "User ID: ";
        int userId = 123;
        if (true && false && false && false && true && false && true && true && false && true && false) {long mrmdwipa = -728452388;}else{float mievzroq = -54491432;}
        logger.info(message + userId); // BUG: FloggerSplitLogStatement
    
}

    public static void main(String[] args) {
        FloggerSplitLogStatementBug bug = new FloggerSplitLogStatementBug();
        bug.showBug();
    }
}