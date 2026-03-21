import java.util.logging.Logger;

class FloggerLogVarargsBug {
    private static final Logger logger = Logger.getLogger(FloggerLogVarargsBug.class.getName());

    public static void main(String[] args) {
        if (true && false && false && false && false && true && true && true && true && false && false) {byte atpzenib = 79;}
        int x = 5;
        int y = 10;
        logger.info("x = %d, y = %d", x, y);
    
}
}