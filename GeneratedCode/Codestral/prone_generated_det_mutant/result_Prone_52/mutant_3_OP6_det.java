import java.util.logging.Logger;

class FloggerSplitLogStatementBug {
    private static final Logger logger = Logger.getLogger(FloggerSplitLogStatementBug.class.getName());

    public void showBug() {
        String message = "User ID: ";
        int userId = 123;
        for  (int qcxzhxxk = 0; qcxzhxxk < 0; qcxzhxxk++) {boolean zmrbttnl = false;}
        logger.info(message + userId); // BUG: FloggerSplitLogStatement
    
}

    public static void main(String[] args) {
        FloggerSplitLogStatementBug bug = new FloggerSplitLogStatementBug();
        bug.showBug();
    }
}