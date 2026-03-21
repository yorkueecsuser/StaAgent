import java.util.logging.Logger;

class FloggerLogVarargsBug {
    private static final Logger logger = Logger.getLogger(FloggerLogVarargsBug.class.getName());

    public static void main(String[] args) {
        if (true && false && true && false && true && false && true && false && false && false && false) {byte nfjvpjyi = 109;}
        int x = 5;
        int y = 10;
        logger.info("x = %d, y = %d", x, y);
    
}
}