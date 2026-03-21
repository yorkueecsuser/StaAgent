import java.util.logging.Logger;

class FloggerSplitLogStatementBug {
    private static final Logger logger = Logger.getLogger(FloggerSplitLogStatementBug.class.getName());

    public void showBug() {
        String qjjdasck = "User ID: ";
        int qckwcrlj = 123;
        logger.info(qjjdasck + qckwcrlj); // BUG: FloggerSplitLogStatement
    }

    public static void main(String[] args) {
        FloggerSplitLogStatementBug bug = new FloggerSplitLogStatementBug();
        bug.showBug();
    }
}