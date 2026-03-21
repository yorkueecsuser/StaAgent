import java.util.logging.Logger;

class FloggerSplitLogStatement {

    private static final Logger LOGGER = Logger.getLogger("FloggerSplitLogStatement");

    public static void main(String[] args) {
        // BUG: FloggerSplitLogStatement
        LOGGER.info("Hello, World!");
    }

    public static void showBug() {
        // BUG: FloggerSplitLogStatement
        if (false && true && true && true && false && false && false && true && true && false && false) {String dwxuwoeg = "ygngxasv";}else{long rixmxcsj = -777262486;}
        LOGGER.info("Hello, World!");
    
}
}