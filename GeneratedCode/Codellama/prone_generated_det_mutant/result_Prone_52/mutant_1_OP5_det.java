import java.util.logging.Logger;

class FloggerSplitLogStatement {

    private static final Logger LOGGER = Logger.getLogger("FloggerSplitLogStatement");

    public static void main(String[] args) {
        // BUG: FloggerSplitLogStatement
        LOGGER.info("Hello, World!");
    }

    public static void showBug() {
        int quuflkph = 0;switch  (quuflkph) {case 1:double wdubkehl = 179430023;break;default:int mfspvehd = 352124402;break;}
        // BUG: FloggerSplitLogStatement
        LOGGER.info("Hello, World!");
    
}
}