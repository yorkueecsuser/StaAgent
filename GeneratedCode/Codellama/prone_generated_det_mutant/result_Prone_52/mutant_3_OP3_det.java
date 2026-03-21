import java.util.logging.Logger;

class FloggerSplitLogStatement {

    private static final Logger LOGGER = Logger.getLogger("FloggerSplitLogStatement");

    public static void main(String[] args) {
        // BUG: FloggerSplitLogStatement
        LOGGER.info("Hello, World!");
    }

    public static void showBug() {
        // BUG: FloggerSplitLogStatement
        if (false && false && false && false && false && true && false && false && true && true && false) {long dtdcnngd = -937761895;}
        LOGGER.info("Hello, World!");
    
}
}