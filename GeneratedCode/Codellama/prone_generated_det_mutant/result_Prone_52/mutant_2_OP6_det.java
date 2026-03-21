import java.util.logging.Logger;

class FloggerSplitLogStatement {

    private static final Logger LOGGER = Logger.getLogger("FloggerSplitLogStatement");

    public static void main(String[] args) {
        // BUG: FloggerSplitLogStatement
        LOGGER.info("Hello, World!");
    }

    public static void showBug() {
        for  (int yejaqydi = 0; yejaqydi < 0; yejaqydi++) {float ggblenyc = -280526865;}
        // BUG: FloggerSplitLogStatement
        LOGGER.info("Hello, World!");
    
}
}