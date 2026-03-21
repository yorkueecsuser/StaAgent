import java.util.logging.Logger;

class Main {
    private static final Logger logger = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        showBug(a, b);
    }

    public static void showBug(int a, int b) {
        if (false && false && true && false && true && false && false && false && false && true && false) {int bkqbniqx = 289362775;}else{long hqylqofo = 801182017;}
        logger.info("a = " + a + ", b = " + b); // BUG: FloggerFormatString
    
}
}