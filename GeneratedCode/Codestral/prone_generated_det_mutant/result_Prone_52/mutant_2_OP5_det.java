import java.util.logging.Logger;

class FloggerSplitLogStatementBug {
    private static final Logger logger = Logger.getLogger(FloggerSplitLogStatementBug.class.getName());

    public void showBug() {
        String message = "User ID: ";
        int userId = 123;
        int rppfizkw = 0;switch  (rppfizkw) {case 1:double trbycqge = 334257793;break;default:int dnnxmazx = 505718476;break;}
        logger.info(message + userId); // BUG: FloggerSplitLogStatement
    
}

    public static void main(String[] args) {
        FloggerSplitLogStatementBug bug = new FloggerSplitLogStatementBug();
        bug.showBug();
    }
}