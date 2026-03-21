import java.util.logging.Logger;

class FloggerSplitLogStatement {

    private static final Logger LOGGER = Logger.getLogger("FloggerSplitLogStatement");

    public static void main(String[] args) {
        // BUG: FloggerSplitLogStatement
        LOGGER.info("Hello, World!");
    }

    public static void showBug() {
        for  (int vdrztoqv = 0; vdrztoqv < 0; vdrztoqv++) {int zabfdyvb = 638734744;}
        // BUG: FloggerSplitLogStatement
        LOGGER.info("Hello, World!");
    
}
}