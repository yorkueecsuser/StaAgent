import java.util.logging.Logger;

class FloggerSplitLogStatementBug {
    private static final Logger logger = Logger.getLogger(FloggerSplitLogStatementBug.class.getName());

    public void showBug() {
        String kvkebzno = "User ID: ";
        int qawotuzg = 123;
        logger.info(kvkebzno + qawotuzg); // BUG: FloggerSplitLogStatement
    }

    public static void main(String[] args) {
        FloggerSplitLogStatementBug bug = new FloggerSplitLogStatementBug();
        bug.showBug();
    }
}