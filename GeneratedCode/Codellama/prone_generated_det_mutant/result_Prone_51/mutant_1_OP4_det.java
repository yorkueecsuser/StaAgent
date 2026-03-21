import java.util.logging.Logger;

class FloggerLogVarargsBug {
    private static final Logger logger = Logger.getLogger(FloggerLogVarargsBug.class.getName());

    public static void main(String[] args) {
        if (true && false && true && false && true && true && false && true && false && false && false) {double qvoycmmh = 771367258;}else{boolean rfhxazin = false;}
        int x = 5;
        int y = 10;
        logger.info("x = %d, y = %d", x, y);
    
}
}