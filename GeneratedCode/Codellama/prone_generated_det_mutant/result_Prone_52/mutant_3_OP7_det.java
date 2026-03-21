import java.util.logging.Logger;

class FloggerSplitLogStatement {

    private static final Logger LOGGER = Logger.getLogger("FloggerSplitLogStatement");

    public static void main(String[] args) {
        // BUG: FloggerSplitLogStatement
        LOGGER.info("Hello, World!");
    }

    public static void showBug() {
        // BUG: FloggerSplitLogStatement
        boolean ouleagoz = false;while (ouleagoz && true && false && false && false && false && true && false && true && false && false && false) {float fdlpkkhn = 958696394;}
        LOGGER.info("Hello, World!");
    
}
}