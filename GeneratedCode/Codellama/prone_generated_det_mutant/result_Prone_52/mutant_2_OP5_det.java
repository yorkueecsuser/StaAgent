import java.util.logging.Logger;

class FloggerSplitLogStatement {

    private static final Logger LOGGER = Logger.getLogger("FloggerSplitLogStatement");

    public static void main(String[] args) {
        // BUG: FloggerSplitLogStatement
        LOGGER.info("Hello, World!");
    }

    public static void showBug() {
        // BUG: FloggerSplitLogStatement
        int nqtzmopn = 0;switch  (nqtzmopn) {case 1:float jcztcynr = 386546051;break;default:float eecopoak = -19793883;break;}
        LOGGER.info("Hello, World!");
    
}
}