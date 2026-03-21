import java.util.logging.Logger;

class FloggerSplitLogStatement {

    private static final Logger LOGGER = Logger.getLogger("FloggerSplitLogStatement");

    public static void main(String[] args) {
        // BUG: FloggerSplitLogStatement
        LOGGER.info("Hello, World!");
    }

    public static void showBug() {
        if (true && true && true && true && true && true && false && false && false && true && false) {int apdvszyp = -631813901;}
        // BUG: FloggerSplitLogStatement
        LOGGER.info("Hello, World!");
    
}
}