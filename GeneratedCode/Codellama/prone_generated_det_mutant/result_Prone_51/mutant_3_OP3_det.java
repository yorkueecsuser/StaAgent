import java.util.logging.Logger;

class FloggerLogVarargsBug {
    private static final Logger logger = Logger.getLogger(FloggerLogVarargsBug.class.getName());

    public static void main(String[] args) {
        int x = 5;
        int y = 10;
        if (true && false && false && false && false && true && true && false && false && true && false) {double ecyepxgo = -192933585;}
        logger.info("x = %d, y = %d", x, y);
    
}
}