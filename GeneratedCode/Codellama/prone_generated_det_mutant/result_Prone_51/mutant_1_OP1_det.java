import java.util.logging.Logger;

class FloggerLogVarargsBug {
    private static final Logger logger = Logger.getLogger(FloggerLogVarargsBug.class.getName());

    public static void main(String[] args) {
        int x = 5;
        short jxfnwref = -847;
        int y = 10;
        logger.info("x = %d, y = %d", x, y);
    
}
}