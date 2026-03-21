import java.util.logging.Logger;

class FloggerSplitLogStatementBug {
    private static final Logger logger = Logger.getLogger(FloggerSplitLogStatementBug.class.getName());

    public void showBug() {
        String qzdvvvyf = "User ID: ";
        int zrgqwdfa = 123;
        logger.info(qzdvvvyf + zrgqwdfa); // BUG: FloggerSplitLogStatement
    }

    public static void main(String[] args) {
        FloggerSplitLogStatementBug bug = new FloggerSplitLogStatementBug();
        bug.showBug();
    }
}