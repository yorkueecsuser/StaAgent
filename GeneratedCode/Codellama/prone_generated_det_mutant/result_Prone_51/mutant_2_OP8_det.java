import java.util.logging.Logger;

class FloggerLogVarargsBug {
    private static final Logger logger = Logger.getLogger(FloggerLogVarargsBug.class.getName());

    public static void main(String[] args) {
        int xhpklktbipxemvw = 5;
        int bipxemvw = 10;
        logger.info("xhpklktbipxemvw = %d, bipxemvw = %d", xhpklktbipxemvw, bipxemvw);
    }
}