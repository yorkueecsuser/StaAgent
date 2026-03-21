import java.util.logging.Logger;

class FloggerSplitLogStatement {

    private static final Logger LOGGER = Logger.getLogger("FloggerSplitLogStatement");

    public static void main(String[] args) {
        // BUG: FloggerSplitLogStatement
        LOGGER.info("Hello, World!");
    }

    public static void showBug() {
        if (true && false && false && false && false && false && false && true && false && false && false) {float fclnxjcz = 840052340;}else{char ykuiyyrt = 'd';}
        // BUG: FloggerSplitLogStatement
        LOGGER.info("Hello, World!");
    
}
}