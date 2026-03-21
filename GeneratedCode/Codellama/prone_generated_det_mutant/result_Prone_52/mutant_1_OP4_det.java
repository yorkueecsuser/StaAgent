import java.util.logging.Logger;

class FloggerSplitLogStatement {

    private static final Logger LOGGER = Logger.getLogger("FloggerSplitLogStatement");

    public static void main(String[] args) {
        // BUG: FloggerSplitLogStatement
        LOGGER.info("Hello, World!");
    }

    public static void showBug() {
        // BUG: FloggerSplitLogStatement
        if (false && false && false && true && true && true && false && true && false && true && false) {float cizwbbyi = -771292130;}else{long xsqjratb = -732352645;}
        LOGGER.info("Hello, World!");
    
}
}