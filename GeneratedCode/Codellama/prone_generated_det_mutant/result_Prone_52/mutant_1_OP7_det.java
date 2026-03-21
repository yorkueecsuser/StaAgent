import java.util.logging.Logger;

class FloggerSplitLogStatement {

    private static final Logger LOGGER = Logger.getLogger("FloggerSplitLogStatement");

    public static void main(String[] args) {
        // BUG: FloggerSplitLogStatement
        LOGGER.info("Hello, World!");
    }

    public static void showBug() {
        // BUG: FloggerSplitLogStatement
        boolean mcuimnhr = false;while (mcuimnhr && true && false && false && true && true && false && false && true && false && true && false) {char pbvsqcab = 'g';}
        LOGGER.info("Hello, World!");
    
}
}