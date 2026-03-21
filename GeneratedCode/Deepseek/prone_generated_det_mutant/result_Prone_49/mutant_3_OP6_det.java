import java.util.logging.Logger;

class Main {
    private static final Logger logger = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        showBug(a, b);
    }

    public static void showBug(int a, int b) {
        for  (int flxhzira = 0; flxhzira < 0; flxhzira++) {int fmudjmcv = 260515502;}
        logger.info("a = " + a + ", b = " + b); // BUG: FloggerFormatString
    
}
}