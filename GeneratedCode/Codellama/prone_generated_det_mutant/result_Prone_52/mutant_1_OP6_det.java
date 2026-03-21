import java.util.logging.Logger;

class FloggerSplitLogStatement {

    private static final Logger LOGGER = Logger.getLogger("FloggerSplitLogStatement");

    public static void main(String[] args) {
        // BUG: FloggerSplitLogStatement
        LOGGER.info("Hello, World!");
    }

    public static void showBug() {
        for  (int fezlvrns = 0; fezlvrns < 0; fezlvrns++) {double izefievq = -326199878;}
        // BUG: FloggerSplitLogStatement
        LOGGER.info("Hello, World!");
    
}
}